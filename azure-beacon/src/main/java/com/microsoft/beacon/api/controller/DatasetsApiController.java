package com.microsoft.beacon.api.controller;

import com.microsoft.beacon.api.db.model.Dataset;
import com.microsoft.beacon.api.service.DatasetService;
import com.microsoft.beacon.generated.api.DatasetsApi;
import com.microsoft.beacon.generated.model.BeaconRequestBody;
import com.microsoft.beacon.generated.model.BeaconResponseMeta;
import com.microsoft.beacon.generated.model.BeaconResultsets;
import com.microsoft.beacon.generated.model.BeaconResultsetsResponse;
import com.microsoft.beacon.generated.model.BeaconSummaryResponseSection;
import com.microsoft.beacon.generated.model.GetOneDataset200Response;
import com.microsoft.beacon.generated.model.Granularity;
import com.microsoft.beacon.generated.model.ResultsetInstance;
import jakarta.validation.constraints.*;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DatasetsApiController implements DatasetsApi {

  private final DatasetService dataService;

  @Autowired
  public DatasetsApiController(DatasetService dataService) {
    this.dataService = dataService;
  }

  @Override
  public ResponseEntity<BeaconResultsetsResponse> getDatasets(
      String requestedSchema, Integer skip, Integer limit, List<String> filters) {
    var datasets = dataService.getDatasets();
    List<Object> urls = new ArrayList<Object>();
    for (Dataset set : datasets) {
      urls.add(set.Name + ", " + set.Description + ", " + set.ExternalUrl);
    }

    boolean datasetNotempty = datasets != null && !datasets.isEmpty() ? true : false;
    // BeaconReceivedRequestSummary and List<@Valid SchemasPerEntity> will be null for now
    // this will for starters only support granularity of "record"
    BeaconResponseMeta meta =
        new BeaconResponseMeta("v2.0", "org.example.beacon.v2", null, Granularity.RECORD, null);
    ResultsetInstance resultsCollection =
        new ResultsetInstance(
            datasetNotempty, "org.example.beacon.v2", urls, datasets.size(), "dataset");
    List<ResultsetInstance> elements = new ArrayList<ResultsetInstance>();
    elements.add(resultsCollection);
    BeaconResultsets results = new BeaconResultsets(elements);

    BeaconSummaryResponseSection response = new BeaconSummaryResponseSection(datasetNotempty);
    response.setNumTotalResults(datasets.size());

    BeaconResultsetsResponse responseFull = new BeaconResultsetsResponse(meta, results, response);

    return new ResponseEntity<>(responseFull, HttpStatus.OK);
  }

  @Override
  public ResponseEntity<GetOneDataset200Response> getOneDataset(String id, String requestedSchema) {
    var dataset = dataService.getDataset(id);
    return new ResponseEntity<GetOneDataset200Response>(HttpStatus.OK);
  }

  @Override
  public ResponseEntity<GetOneDataset200Response> postOneDataset(
      String id, BeaconRequestBody beaconRequestBody) {
    var dataset = dataService.getDataset(id);
    return new ResponseEntity<GetOneDataset200Response>(HttpStatus.OK);
  }
}
