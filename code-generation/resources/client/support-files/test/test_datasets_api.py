# coding: utf-8

# Copyright (c) Microsoft Corporation.
# Licensed under the MIT License.

import unittest

from ga4gh_beacon_client.api.datasets_api import DatasetsApi
from ga4gh_beacon_client.models.beacon_filtering_terms_response import BeaconFilteringTermsResponse
from ga4gh_beacon_client.models.collections_response import CollectionsResponse
from ga4gh_beacon_client.models.results_ok_response import ResultsOKResponse

from test.tests_helper import default_beacon_request_body

class TestDatasetsApi(unittest.TestCase):
    """DatasetsApi unit test stubs"""

    def setUp(self) -> None:
        self.api = DatasetsApi()

    def tearDown(self) -> None:
        pass

    def test_get_datasets(self) -> None:
        res = self.api.get_datasets()
        self.assertIsInstance(res, CollectionsResponse)

    def test_get_one_dataset(self) -> None:
        res = self.api.get_one_dataset("ds01010101")
        self.assertIsInstance(res, ResultsOKResponse)

    def test_get_one_dataset_biosamples(self) -> None:
        res = self.api.get_one_dataset_biosamples("ds01010101")
        self.assertIsInstance(res, ResultsOKResponse)

    def test_get_one_dataset_entries(self) -> None:
        res = self.api.get_one_dataset_entries("ds01010101")
        self.assertIsInstance(res, ResultsOKResponse)

    def test_get_one_dataset_filtering_terms(self) -> None:
        res = self.api.get_one_dataset_filtering_terms("ds01010101")
        self.assertIsInstance(res, BeaconFilteringTermsResponse)

    def test_get_one_dataset_individuals(self) -> None:
        res = self.api.get_one_dataset_individuals("ds01010101")
        self.assertIsInstance(res, ResultsOKResponse)

    def test_post_datasets_request(self) -> None:
        res = self.api.post_datasets_request(default_beacon_request_body)
        self.assertIsInstance(res, CollectionsResponse)

    def test_post_one_dataset(self) -> None:
        res = self.api.post_one_dataset("ds01010101", default_beacon_request_body)
        self.assertIsInstance(res, ResultsOKResponse)

    def test_post_one_dataset_biosamples(self) -> None:
        res = self.api.post_one_dataset_biosamples("ds01010101", default_beacon_request_body)
        self.assertIsInstance(res, ResultsOKResponse)

    def test_post_one_dataset_entries(self) -> None:
        res = self.api.post_one_dataset_entries("ds01010101", default_beacon_request_body)
        self.assertIsInstance(res, ResultsOKResponse)

    def test_post_one_dataset_filtering_terms(self) -> None:
        res = self.api.post_one_dataset_filtering_terms("ds01010101", default_beacon_request_body)
        self.assertIsInstance(res, BeaconFilteringTermsResponse)

    def test_post_one_dataset_individuals(self) -> None:
        res = self.api.post_one_dataset_individuals("ds01010101", default_beacon_request_body)
        self.assertIsInstance(res, ResultsOKResponse)


if __name__ == '__main__':
    unittest.main()
