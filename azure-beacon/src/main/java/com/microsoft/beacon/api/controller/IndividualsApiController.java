package com.microsoft.beacon.api.controller;

import com.microsoft.beacon.api.controller.utils.ResponseBuilder;
import com.microsoft.beacon.api.db.model.Individual;
import com.microsoft.beacon.api.db.model.IndividualExtended;
import com.microsoft.beacon.api.generated.api.IndividualsApi;
import com.microsoft.beacon.api.generated.model.individual.GetIndividuals200Response;
import com.microsoft.beacon.api.generated.model.individual.IncludeResultsetResponses;
import com.microsoft.beacon.api.service.IndividualService;
import jakarta.annotation.Generated;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.request.NativeWebRequest;

@Generated(
    value = "org.openapitools.codegen.languages.SpringCodegen",
    date = "2024-09-18T10:46:59.161413591-07:00[America/Los_Angeles]",
    comments = "Generator version: 7.8.0")
@Controller
// @RequestMapping("${openapi.gA4GHBeaconAPISpecificationIndividualsEndpoints.base-path:}")
// @RequestMapping("/individuals")
public class IndividualsApiController implements IndividualsApi {

  class IndividualsResponse implements GetIndividuals200Response {
    private final List<Individual> individuals;

    public IndividualsResponse(Individual individual) {
      this.individuals = individual != null ? List.of(individual) : Collections.emptyList();
    }

    public IndividualsResponse(List<Individual> individuals) {
      this.individuals = individuals;
    }

    public List<Individual> getIndividuals() {
      return this.individuals;
    }
  }

  private final NativeWebRequest request;
  private final IndividualService individualService;

  @Autowired
  public IndividualsApiController(NativeWebRequest request, IndividualService individualService) {
    this.request = request;
    this.individualService = individualService;
  }

  @Override
  public Optional<NativeWebRequest> getRequest() {
    return Optional.ofNullable(request);
  }

  @Override
  public ResponseEntity<GetIndividuals200Response> getOneIndividual(String id) {
    Optional<Individual> maybeIndividual = individualService.getIndividual(id);
    return maybeIndividual
        .<ResponseEntity<GetIndividuals200Response>>map(
            individual -> new ResponseEntity<>(new IndividualsResponse(individual), HttpStatus.OK))
        .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
  }

  @Override
  public ResponseEntity<GetIndividuals200Response> getIndividuals(
      String requestedSchema, /*ignored*/
      Integer skip,
      Integer limit,
      IncludeResultsetResponses includeResultsetResponses,
      List<String> filters) {
    List<IndividualExtended> individuals = individualService.getIndividuals(skip, limit, filters);
    return individuals.size() > 0
        ? new ResponseEntity<>(
            ResponseBuilder.buildBeaconResultsetsResponse(individuals, "individual"), HttpStatus.OK)
        : new ResponseEntity<>(HttpStatus.NOT_FOUND);
  }
}
