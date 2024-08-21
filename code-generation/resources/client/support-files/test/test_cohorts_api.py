# coding: utf-8

# Copyright (c) Microsoft Corporation.
# Licensed under the MIT License.

import re
import unittest

from ga4gh_beacon_client.api.cohorts_api import CohortsApi
from ga4gh_beacon_client.models.beacon_filtering_terms_response import BeaconFilteringTermsResponse
from ga4gh_beacon_client.models.beacon_query import BeaconQuery
from ga4gh_beacon_client.models.beacon_request_body import BeaconRequestBody
from ga4gh_beacon_client.models.beacon_request_meta import BeaconRequestMeta
from ga4gh_beacon_client.models.collections_response import CollectionsResponse
from ga4gh_beacon_client.models.custom_filter import CustomFilter
from ga4gh_beacon_client.models.filtering_term import FilteringTerm
from ga4gh_beacon_client.models.granularity import Granularity
from ga4gh_beacon_client.models.include_resultset_responses import IncludeResultsetResponses
from ga4gh_beacon_client.models.pagination import Pagination
from ga4gh_beacon_client.models.results_ok_response import ResultsOKResponse

from test.tests_helper import default_beacon_request_body

class TestCohortsApi(unittest.TestCase):
    """CohortsApi unit test stubs"""

    def setUp(self) -> None:
        self.api = CohortsApi()

    def tearDown(self) -> None:
        pass

    def test_get_cohorts(self) -> None:
        res = self.api.get_cohorts(skip=0,
                                   limit=2,
                                   filters=["NCIT:C3222"])
        self.assertIsInstance(res, CollectionsResponse)

    def test_get_one_cohort(self) -> None:
        res = self.api.get_one_cohort("cohort0001")
        self.assertIsInstance(res, ResultsOKResponse)

    def test_get_one_cohort_filtering_terms(self) -> None:
        res = self.api.get_one_cohort_filtering_terms("cohort0001", skip=0, limit=2)
        self.assertIsInstance(res, BeaconFilteringTermsResponse)

    def test_get_one_cohort_individuals(self) -> None:
        res = self.api.get_one_cohort_individuals("cohort0001", skip=0, limit=2)
        self.assertIsInstance(res, ResultsOKResponse)

    def test_post_cohorts_request(self) -> None:
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
        res = self.api.post_cohorts_request(request_body)
        self.assertIsInstance(res, CollectionsResponse)

    def test_post_one_cohort(self) -> None:
        res = self.api.post_one_cohort("cohort0001", default_beacon_request_body)
        self.assertIsInstance(res, ResultsOKResponse)

    def test_post_one_cohort_entries(self) -> None:
        res = self.api.post_one_cohort_entries("cohort0001", default_beacon_request_body)
        self.assertIsInstance(res, ResultsOKResponse)

    def test_post_one_cohort_filtering_terms(self) -> None:
        res = self.api.post_one_cohort_filtering_terms("cohort0001", default_beacon_request_body)
        self.assertIsInstance(res, BeaconFilteringTermsResponse)


if __name__ == '__main__':
    unittest.main()
