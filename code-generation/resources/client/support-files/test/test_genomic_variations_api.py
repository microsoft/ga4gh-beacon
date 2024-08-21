# coding: utf-8

# Copyright (c) Microsoft Corporation.
# Licensed under the MIT License.

from curses import meta
import re
import unittest

from ga4gh_beacon_client.api.genomic_variations_api import GenomicVariationsApi
from ga4gh_beacon_client.models.results_ok_response import ResultsOKResponse

from test.tests_helper import default_beacon_request_body

class TestGenomicVariationsApi(unittest.TestCase):
    """GenomicVariationsApi unit test stubs"""

    def setUp(self) -> None:
        self.api = GenomicVariationsApi()

    def tearDown(self) -> None:
        pass

    def test_get_example_entries(self) -> None:
        res = self.api.get_example_entries()
        self.assertIsInstance(res, ResultsOKResponse)

    def test_get_one_genomic_variant_biosamples(self) -> None:
        res = self.api.get_one_genomic_variant_biosamples("GRCh37-1-55505652-G-A")
        self.assertIsInstance(res, ResultsOKResponse)

    def test_get_one_genomic_variant_individuals(self) -> None:
        res = self.api.get_one_genomic_variant_individuals("GRCh37-1-55505652-G-A")
        self.assertIsInstance(res, ResultsOKResponse)

    def test_get_one_genomic_variation(self) -> None:
        res = self.api.get_one_genomic_variation("GRCh37-1-55505652-G-A")
        self.assertIsInstance(res, ResultsOKResponse)

    def test_post_example_entries_request(self) -> None:
        res = self.api.post_example_entries_request(default_beacon_request_body)
        self.assertIsInstance(res, ResultsOKResponse)

    def test_post_one_genomic_variant_biosamples(self) -> None:
        res = self.api.post_one_genomic_variant_biosamples("GRCh37-1-55505652-G-A", default_beacon_request_body)
        self.assertIsInstance(res, ResultsOKResponse)

    def test_post_one_genomic_variant_individuals(self) -> None:
        res = self.api.post_one_genomic_variant_individuals("GRCh37-1-55505652-G-A", default_beacon_request_body)
        self.assertIsInstance(res, ResultsOKResponse)

    def test_post_one_genomic_variation(self) -> None:
        res = self.api.post_one_genomic_variation("GRCh37-1-55505652-G-A", default_beacon_request_body)
        self.assertIsInstance(res, ResultsOKResponse)


if __name__ == '__main__':
    unittest.main()
