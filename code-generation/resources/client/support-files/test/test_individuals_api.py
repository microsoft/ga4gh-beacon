# coding: utf-8

# Copyright (c) Microsoft Corporation.
# Licensed under the MIT License.

from curses import meta
import unittest

from ga4gh_beacon_client.api.individuals_api import IndividualsApi
from ga4gh_beacon_client.models.beacon_filtering_terms_response import BeaconFilteringTermsResponse
from ga4gh_beacon_client.models.beacon_query import BeaconQuery
from ga4gh_beacon_client.models.beacon_request_body import BeaconRequestBody
from ga4gh_beacon_client.models.beacon_request_meta import BeaconRequestMeta
from ga4gh_beacon_client.models.custom_filter import CustomFilter
from ga4gh_beacon_client.models.filtering_term import FilteringTerm
from ga4gh_beacon_client.models.granularity import Granularity
from ga4gh_beacon_client.models.include_resultset_responses import IncludeResultsetResponses
from ga4gh_beacon_client.models.pagination import Pagination
from ga4gh_beacon_client.models.results_ok_response import ResultsOKResponse

from test.tests_helper import default_beacon_request_body

class TestIndividualsApi(unittest.TestCase):
    """IndividualsApi unit test stubs"""

    def setUp(self) -> None:
        self.api = IndividualsApi()

    def tearDown(self) -> None:
        pass

    def test_get_individuals(self) -> None:
        res = self.api.get_individuals(skip=0,
                                       limit=2,
                                       include_resultset_responses="HIT",
                                       filters=["NCIT:C3222"])
        self.assertIsInstance(res, ResultsOKResponse)

    def test_get_individuals_filtering_terms(self) -> None:
        res = self.api.get_individuals_filtering_terms()
        self.assertIsInstance(res, BeaconFilteringTermsResponse)

    def test_get_one_individual(self) -> None:
        res = self.api.get_one_individual("Ind001")
        self.assertIsInstance(res, ResultsOKResponse)

    def test_get_one_individual_biosamples(self) -> None:
        res = self.api.get_one_individual_biosamples("Ind001")
        self.assertIsInstance(res, ResultsOKResponse)

    def test_get_one_individual_genomic_variants(self) -> None:
        res = self.api.get_one_individual_genomic_variants("Ind001")
        self.assertIsInstance(res, ResultsOKResponse)

    def test_post_individuals_filtering_terms(self) -> None:
        res = self.api.post_individuals_filtering_terms(default_beacon_request_body)
        self.assertIsInstance(res, BeaconFilteringTermsResponse)

    def test_post_individuals_request(self) -> None:
        meta = BeaconRequestMeta(apiVersion="v2.0.0")
        query = BeaconQuery(
            filters=[
                FilteringTerm(CustomFilter(id="NCIT:C4349", scope="individual")),
                FilteringTerm(CustomFilter(id="NCIT:C16576", scope="individual"))
            ],
            includeResultsetResponses=IncludeResultsetResponses.HIT,
            pagination=Pagination(skip=0, limit=2),
            requestedGranularity=Granularity.RECORD,
            testMode=True
        )
        request_body = BeaconRequestBody(meta=meta, query=query)
        res = self.api.post_individuals_request(request_body)
        self.assertIsInstance(res, ResultsOKResponse)

    def test_post_one_individual(self) -> None:
        res = self.api.post_one_individual("Ind001", default_beacon_request_body)
        self.assertIsInstance(res, ResultsOKResponse)

    def test_post_one_individual_biosamples(self) -> None:
        res = self.api.post_one_individual_biosamples("Ind001", default_beacon_request_body)
        self.assertIsInstance(res, ResultsOKResponse)

    def test_pot_one_individual_genomic_variants(self) -> None:
        res = self.api.post_one_individual_genomic_variants("Ind001", default_beacon_request_body)
        self.assertIsInstance(res, ResultsOKResponse)


if __name__ == '__main__':
    unittest.main()
