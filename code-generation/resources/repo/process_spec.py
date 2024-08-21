# Copyright (c) Microsoft Corporation.
# Licensed under the MIT License.

"""
This script combines the Beacon framework specification with the model specifications.
It also performs the following tasks:
- Replaces references to remote files to local files to account for the unfixed issues in the remote repository.
- Replaces model references to framework JSON files to their original YAML files.
  - This is done because mixing references to JSON and YAML files generated multiple duplicate files by the OpenAPI generator, such as beacon_response_meta1.py and beacon_response_meta1.py.
- Makes changes to the path tags to generate a more cohesive client where model files are grouped by type and not split into POST and GET files.
"""

import os
import yaml
import re
from typing import Dict, Any

FRAMEWORK_SPEC_PATH = './beacon-v2/framework/src/endpoints.yaml'
MODELS_SPEC_PATHS = [
    './beacon-v2/models/src/beacon-v2-default-model/analyses/endpoints.yaml',
    './beacon-v2/models/src/beacon-v2-default-model/biosamples/endpoints.yaml',
    './beacon-v2/models/src/beacon-v2-default-model/cohorts/endpoints.yaml',
    './beacon-v2/models/src/beacon-v2-default-model/datasets/endpoints.yaml',
    './beacon-v2/models/src/beacon-v2-default-model/genomicVariations/endpoints.yaml',
    './beacon-v2/models/src/beacon-v2-default-model/individuals/endpoints.yaml',
    './beacon-v2/models/src/beacon-v2-default-model/runs/endpoints.yaml'
]
OUTPUT_FILE = './beacon-v2/framework/src/endpoints_combined.yaml'

# Example reference URL:
# https://raw.githubusercontent.com/ga4gh-beacon/beacon-v2/main/framework/json/common/beaconCommonComponents.json#/definitions/Skip
# match.group(1) => common/beaconCommonComponents
# match.group(2) => #/definitions/Skip
REF_PATTERN = re.compile(
    r'^https://raw.githubusercontent.com/ga4gh-beacon/beacon-v2/main/framework/json/(.*)\.json(.*)$'
)


def load_yaml(file_path: str) -> Dict[str, Any]:
    with open(file_path, 'r') as file:
        return yaml.safe_load(file)


def save_yaml(data: Dict[str, Any], file_path: str) -> None:
    with open(file_path, 'w') as file:
        yaml.dump(data, file, sort_keys=False)


def replace_refs(data: Any) -> Any:
    if isinstance(data, dict):
        for key, value in data.items():
            if key == '$ref' and isinstance(value, str):
                match = REF_PATTERN.match(value)
                if match:
                    data[key] = f"./{match.group(1)}.yaml{match.group(2)}"
            else:
                data[key] = replace_refs(value)
    elif isinstance(data, list):
        for i, item in enumerate(data):
            data[i] = replace_refs(item)
    return data


def add_tag_prefixes(paths: Dict[str, Any], prefix: str) -> Dict[str, Any]:
    for path, methods in paths.items():
        for method, data in methods.items():
            if 'tags' in data:
                data['tags'] = [
                    prefix if tag in ['GET Endpoints', 'POST Endpoints'] else
                    (tag.removesuffix(' endpoints') if tag == 'Informational endpoints' else tag)
                    for tag in data['tags']
                ]
    return paths


def merge_paths(base_paths: Dict[str, Any], merge_paths: Dict[str, Any]) -> Dict[str, Any]:
    for path, methods in merge_paths.items():
        if path not in base_paths:
            base_paths[path] = methods
        else:
            for method, data in methods.items():
                if method not in base_paths[path]:
                    base_paths[path][method] = data
                else:
                    base_paths[path][method].update(data)
    return base_paths


def merge_components(base_components: Dict[str, Any],
                     merge_components: Dict[str, Any]) -> Dict[str, Any]:
    for key, value in merge_components.items():
        if key not in base_components:
            base_components[key] = value
        else:
            base_components[key].update(value)
    return base_components


def combine_specs(framework_spec_path: str, models_spec_paths: list) -> Dict[str, Any]:
    base_data = load_yaml(framework_spec_path)
    base_paths = add_tag_prefixes(base_data.get('paths', {}), "")
    base_components = base_data.get('components', {})

    for file in models_spec_paths:
        prefix = os.path.basename(os.path.dirname(file))
        merge_data = load_yaml(file)
        merge_data['paths'] = add_tag_prefixes(merge_data.get('paths', {}), prefix)
        base_paths = merge_paths(base_paths, merge_data.get('paths', {}))
        base_components = merge_components(base_components, merge_data.get('components', {}))

    base_data['paths'] = base_paths
    base_data['components'] = base_components
    base_data = replace_refs(base_data)

    return base_data


def main():
    combined_spec = combine_specs(FRAMEWORK_SPEC_PATH, MODELS_SPEC_PATHS)
    save_yaml(combined_spec, OUTPUT_FILE)


if __name__ == "__main__":
    main()
