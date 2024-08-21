# coding: utf-8

# Copyright (c) Microsoft Corporation.
# Licensed under the MIT License.

import unittest

from ga4gh_beacon_client.api.informational_api import InformationalApi
from ga4gh_beacon_client.models.beacon_filtering_terms_response import BeaconFilteringTermsResponse
from ga4gh_beacon_client.models.beacon_info_response import BeaconInfoResponse
from ga4gh_beacon_client.models.ga4gh_service_info100_schema import Ga4ghServiceInfo100Schema


class TestInformationalApi(unittest.TestCase):
    """InformationalApi unit test stubs"""

    def setUp(self) -> None:
        self.api = InformationalApi()

    def tearDown(self) -> None:
        pass

    def test_get_beacon_info_root(self) -> None:
        res = self.api.get_beacon_info_root()
        self.assertIsInstance(res, BeaconInfoResponse)

    def test_get_beacon_root(self) -> None:
        res = self.api.get_beacon_root()
        self.assertIsInstance(res, BeaconInfoResponse)

    def test_get_beacon_service_info(self) -> None:
        res = self.api.get_beacon_service_info()
        self.assertIsInstance(res, Ga4ghServiceInfo100Schema)

    def test_get_filtering_terms(self) -> None:
        res = self.api.get_filtering_terms()
        self.assertIsInstance(res, BeaconFilteringTermsResponse)


if __name__ == '__main__':
    unittest.main()
