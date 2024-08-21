# coding: utf-8

# Copyright (c) Microsoft Corporation.
# Licensed under the MIT License.

import unittest

from ga4gh_beacon_client.api.configuration_api import ConfigurationApi
from ga4gh_beacon_client.models.beacon_configuration_response import BeaconConfigurationResponse
from ga4gh_beacon_client.models.beacon_entry_types_response import BeaconEntryTypesResponse
from ga4gh_beacon_client.models.beacon_map_response import BeaconMapResponse


class TestConfigurationApi(unittest.TestCase):

    def setUp(self) -> None:
        self.api = ConfigurationApi()

    def tearDown(self) -> None:
        pass

    def test_get_beacon_configuration(self) -> None:
        res = self.api.get_beacon_configuration()
        self.assertIsInstance(res, BeaconConfigurationResponse)

    def test_get_beacon_map(self) -> None:
        res = self.api.get_beacon_map()
        self.assertIsInstance(res, BeaconMapResponse)

    def test_get_entry_types(self) -> None:
        res = self.api.get_entry_types()
        self.assertIsInstance(res, BeaconEntryTypesResponse)


if __name__ == '__main__':
    unittest.main()
