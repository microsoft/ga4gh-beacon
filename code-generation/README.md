# GA4GH Beacon Code Generation

This folder contains scripts to generate the [GA4GH Beacon v2 API](https://docs.genomebeacons.org/) client and serve code in Python. The scripts use the OpenAPI specification files in the [repository](https://github.com/ga4gh-beacon/beacon-v2) for Beacon v2.

The output of the code generation is the following libraries:

- **ga4gh-beacon-client**: client code to interact and send queries to Beacon server implementations.
- **ga4gh-beacon-server**: server code to bootstrap an implementation of a Beacon server.

## Code Generation Overview

The code generation script does the following:

1. Clones the Beacon v2 [repository](https://github.com/ga4gh-beacon/beacon-v2).
2. Applies a [patch](./resources/repo/repo-changes.patch) with code fixes to the repo.
   - This is necessary due to a number of syntax issues in the Beacon OpenAPI specification files, which prevent the generation of the client and server code.
3. Runs a preprocess [script](./resources/repo/process_spec.py) on the OpenAPI specification files with the following actions:
   1. Combines the model endpoint OpenAPI files into the framework OpenAPI file.
   2. Replaces remote file references in model specifications to local files to account for the syntax issues in the remote repository which are fixed in the repo patch.
   3. Makes changes to the path tags to generate more cohesive code files where endpoints are grouped by models and not by HTTP methods (GET and POST).
4. Generates the code using the [OpenAPI Generator](https://openapi-generator.tech/) for the client (`python`) and server (`python-flask`).
5. Applies patches to fix issues in the generated code for the [client](./resources/client/client-changes.patch) and [server](./resources/server/server-changes.patch).

## Running the Code Generation

The main code generation script is found in the [Makefile](./Makefile) file.

1. Clone this repository to your local machine.
2. Open the [Makefile](./Makefile) and make sure the variables at the top of the file (such as `REPO_BRANCH` and `REPO_COMMIT`) are set to your desired values.
3. Open the terminal in the root directory of this repository and run the `make` command.
4. If the script runs successfully, the generated code will be placed in the `dist` directory:
   - `dist/ga4gh-beacon-client`
   - `dist/ga4gh-beacon-server`

## Using the Client Library

The client library is designed to be used with any Beacon server implementation that follows the GA4GH Beacon v2 API standard.

**Note:** The client library code is currently pending upload to PyPi. In the meantime, you can use the client library by copying the `ga4gh-beacon-client` directory to your project and importing the `ga4gh_beacon_client` module.

After importing the module, you can create a client object and send queries to a Beacon server. Here is a few examples of how to use the client library:

First, create the `Configuration` and `ApiClient` objects:

```python
configuration = Configuration(host="http://your-beacon-host.com")
api_client = ApiClient(configuration)
```

`GET` service info:

```python
info_api = InformationalApi(api_client)
res = info_api.get_beacon_service_info()
```

`GET` biosamples:

```python
biosamples_api = BiosamplesApi(api_client)
res = biosamples_api.get_biosamples(skip=0,
                                    limit=2,
                                    include_resultset_responses=IncludeResultsetResponses.HIT,
                                    filters=["NCIT:C16576", "NCIT:C4349"])
```

`POST` biosamples:

```python
meta = BeaconRequestMeta(apiVersion="v2.0.0")
query = BeaconQuery(
   filters=[
       FilteringTerm(CustomFilter(id="NCIT:C16576", scope="individual")),
       FilteringTerm(CustomFilter(id="NCIT:C4349", scope="individual"))
   ],
   includeResultsetResponses=IncludeResultsetResponses.HIT,
   pagination=Pagination(skip=0, limit=2),
   requestedGranularity=Granularity.RECORD,
   testMode=True
)
request_body = BeaconRequestBody(meta=meta, query=query)

biosamples_api = BiosamplesApi(api_client)
res = biosamples_api.post_biosamples_request(request_body)
```

Refer to the generated client [README](./dist/ga4gh-beacon-client/README.md) file for more information on how to use the client library.

## Testing the Client Library

Because each Beacon implementation may have different endpoint configurations, such as a url or auth, the tests are designed to load these connection configurations from a config file. Open the [`test-config.json`](./dist/ga4gh-beacon-client/test/test-config.json) file in the `test` directory and make fill in the needed values. The only required value is the `host` property.

```json
{
   "host": "http://your-beacon-url.com",
}
```

The values and keys of the config file correspond to the properties of the `Configuration` class. See the [`Configuration`](./dist/ga4gh-beacon-client/ga4gh_beacon_client/configuration.py) class for more information.

### Mock Server with Prism

To run the tests against a local mock server, you can use the [Prism](https://github.com/stoplightio/prism) server mocking library, which can mock a server based on an OpenAPI specification file. Here is an example of how to run the prism mock server:

```bash
npx -y @stoplight/prism-cli mock ./dist/ga4gh-beacon-server/ga4gh_beacon_server/openapi/openapi.yaml
```

This launches a very local server with all the supported Beacon v2 endpoints.

### Running the Tests

After the [config file](./dist/ga4gh-beacon-client/test/test-config.json) is pointing to the correct Beacon server (local or remote), you can run the tests in the `dist/ga4gh-beacon-client` directory with the following command:

```bash
python -m unittest discover -s "./test" -p "test_*.py"
```

## Using the Server Library

Due to the nature of the OpenAPI specifications documents and the code generator, the generated code is a Python-Flask server which implements the Beacon v2 endpoints, but does not contain the actual logic to handle requests or fetch data from the database. The server code is a bootstrap starting point to help implement a Beacon server.

Refer to the generated server [README](./dist/ga4gh-beacon-server/README.md) file for more information on how to use the server library.

## To Do

### Mock Test Responses

Currently, the tests are using a server endpoint to test (such as a live remote server or a local Prism mock server). This is not ideal as it requires a separate server to be running. Instead, we can use mock responses in the tests. This will allow the tests to be run in any order and without the need for a server.

One possible way to do this is using the [HTTPretty](https://github.com/gabrielfalcao/HTTPretty) library to mock the HTTP responses. Also, as the Beacon repo contains example responses to each endpoint (such as [this](https://github.com/ga4gh-beacon/beacon-v2/tree/main/framework/src/responses/examples-fullDocuments)), we can use these as the mock responses.
