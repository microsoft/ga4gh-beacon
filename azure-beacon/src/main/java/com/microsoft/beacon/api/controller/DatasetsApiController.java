package com.microsoft.beacon.generated.api;

import com.microsoft.beacon.generated.model.BeaconRequestBody;
import com.microsoft.beacon.generated.model.GetDatasets200Response;
import com.microsoft.beacon.generated.model.GetOneDataset200Response;
import jakarta.validation.constraints.*;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

@RestController
public class DatasetsApiController implements DatasetsApi {

  private final NativeWebRequest request;

  @Autowired
  public DatasetsApiController(NativeWebRequest request) {
    this.request = request;
  }

  @Override
  public Optional<NativeWebRequest> getRequest() {

    return Optional.ofNullable(request);
  }

  @Override
  public ResponseEntity<GetDatasets200Response> getDatasets(
      String requestedSchema, Integer skip, Integer limit, List<String> filters) {
    System.out.println("hello");
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }

  @Override
  public ResponseEntity<GetOneDataset200Response> postOneDataset(
      String id, BeaconRequestBody beaconRequestBody) {
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }
}
