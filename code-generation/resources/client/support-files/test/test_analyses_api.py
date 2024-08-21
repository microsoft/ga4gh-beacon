# coding: utf-8

# Copyright (c) Microsoft Corporation.
# Licensed under the MIT License.

import unittest

from ga4gh_beacon_client.api.analyses_api import AnalysesApi
from ga4gh_beacon_client.models.beacon_query import BeaconQuery
from ga4gh_beacon_client.models.beacon_request_body import BeaconRequestBody
from ga4gh_beacon_client.models.beacon_request_meta import BeaconRequestMeta
from ga4gh_beacon_client.models.beacon_resultsets_response import BeaconResultsetsResponse
from ga4gh_beacon_client.models.custom_filter import CustomFilter
from ga4gh_beacon_client.models.filtering_term import FilteringTerm
from ga4gh_beacon_client.models.granularity import Granularity
from ga4gh_beacon_client.models.include_resultset_responses import IncludeResultsetResponses
from ga4gh_beacon_client.models.pagination import Pagination
from ga4gh_beacon_client.models.results_ok_response import ResultsOKResponse

from test.tests_helper import default_beacon_request_body

class TestAnalysesApi(unittest.TestCase):
    """AnalysesApi unit test stubs"""

    def setUp(self) -> None:
        self.api = AnalysesApi()

    def tearDown(self) -> None:
        pass

    def test_get_analyses(self) -> None:
        res = self.api.get_analyses(skip=0,
                                    limit=2,
                                    include_resultset_responses=IncludeResultsetResponses.HIT,
                                    filters=["NCIT:C3222"])
        self.assertIsInstance(res, ResultsOKResponse)

    def test_get_one_analysis(self) -> None:
        res = self.api.get_one_analysis("analyses-example-0001")
        self.assertIsInstance(res, ResultsOKResponse)

    def test_get_one_analysis_variants(self) -> None:
        res = self.api.get_one_analysis_variants("analyses-example-0001")
        self.assertIsInstance(res, ResultsOKResponse)

    def test_post_analyses_request(self) -> None:
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
        res = self.api.post_analyses_request(request_body)
        self.assertIsInstance(res, BeaconResultsetsResponse)

    def test_post_one_analysis_request(self) -> None:
        res = self.api.post_one_analysis_request("analyses-example-0001", default_beacon_request_body)
        self.assertIsInstance(res, ResultsOKResponse)

    def test_post_one_analysis_variants_request(self) -> None:
        res = self.api.post_one_analysis_variants_request("analyses-example-0001", default_beacon_request_body)
        self.assertIsInstance(res, ResultsOKResponse)


if __name__ == '__main__':
    unittest.main()
