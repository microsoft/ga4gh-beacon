package com.microsoft.beacon.api.controller.utils;

import com.microsoft.beacon.api.generated.model.individual.BeaconResponseMeta;
import com.microsoft.beacon.api.generated.model.individual.BeaconResultsets;
import com.microsoft.beacon.api.generated.model.individual.BeaconResultsetsResponse;
import com.microsoft.beacon.api.generated.model.individual.BeaconSummaryResponseSection;
import com.microsoft.beacon.api.generated.model.individual.Granularity;
import com.microsoft.beacon.api.generated.model.individual.ResultsetInstance;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ResponseBuilder {
  public static <T> BeaconResultsetsResponse buildBeaconResultsetsResponse(
      List<T> items, String type) {
    Objects.requireNonNull(items);

    boolean isDatasetEmpty = items.size() > 0;
    List<Object> dataCollection = new ArrayList<>(items);
    var meta =
        new BeaconResponseMeta("v2.0", "org.example.beacon.v2", null, Granularity.RECORD, null);

    var resultsetInstance =
        new ResultsetInstance(
            isDatasetEmpty, "org.example.beacon.v2", dataCollection, items.size(), type);
    List<ResultsetInstance> elements = List.of(resultsetInstance);
    var response = new BeaconResultsets(elements);

    var responseSummary = new BeaconSummaryResponseSection(isDatasetEmpty);
    responseSummary.setNumTotalResults(items.size());
    return new BeaconResultsetsResponse(meta, response, responseSummary);
  }
}
