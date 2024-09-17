package com.microsoft.beacon.generated.api;

import com.microsoft.beacon.api.service.DatasetService;
import com.microsoft.beacon.generated.model.BeaconRequestBody;
import com.microsoft.beacon.generated.model.GetDatasets200Response;
import com.microsoft.beacon.generated.model.GetOneDataset200Response;
import jakarta.validation.constraints.*;
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
  public ResponseEntity<GetDatasets200Response> getDatasets(
      String requestedSchema, Integer skip, Integer limit, List<String> filters) {
    System.out.println("hello");
    dataService.getTestMessage();
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }

  @Override
  public ResponseEntity<GetOneDataset200Response> postOneDataset(
      String id, BeaconRequestBody beaconRequestBody) {
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }
}
