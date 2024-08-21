# coding: utf-8

# Copyright (c) Microsoft Corporation.
# Licensed under the MIT License.

import os
import json
from ga4gh_beacon_client.configuration import Configuration
from ga4gh_beacon_client.models.beacon_query import BeaconQuery
from ga4gh_beacon_client.models.beacon_request_body import BeaconRequestBody
from ga4gh_beacon_client.models.beacon_request_meta import BeaconRequestMeta

CONFIG_FILE_PATH = os.path.join(os.path.dirname(__file__), 'test-config.json')

class TestHelper:

    def __init__(self):
        self.mock_responses = True
        self.configuration = None
        self.default_beacon_request_body = BeaconRequestBody(meta=BeaconRequestMeta(apiVersion="v2.0.0"),
                                                             query=BeaconQuery(testMode=True))

    def setup_api_client_configuration(self):
        # Check if the configuration file exists
        if not os.path.exists(CONFIG_FILE_PATH):
            raise FileNotFoundError(f"Configuration file not found: {CONFIG_FILE_PATH}")

        # Load configuration file
        with open(CONFIG_FILE_PATH, 'r') as config_file:
            config_data = json.load(config_file)

        # Load mock_responses from configuration and set the environment variable
        self.mock_responses = config_data.get('mock_responses', True)

        host = config_data.get('host')
        if not host:
            raise ValueError("The 'host' parameter is required in the configuration file.")

        # Initialize Configuration object
        configuration = Configuration(
            host=host,
            api_key=config_data.get('api_key'),
            api_key_prefix=config_data.get('api_key_prefix'),
            username=config_data.get('username'),
            password=config_data.get('password'),
            access_token=config_data.get('access_token'),
            server_index=config_data.get('server_index'),
            server_variables=config_data.get('server_variables'),
            server_operation_index=config_data.get('server_operation_index'),
            server_operation_variables=config_data.get('server_operation_variables'),
            ssl_ca_cert=config_data.get('ssl_ca_cert')
        )

        Configuration.set_default(configuration)
