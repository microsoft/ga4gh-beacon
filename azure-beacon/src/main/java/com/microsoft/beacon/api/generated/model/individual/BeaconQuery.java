package com.microsoft.beacon.api.generated.model.individual;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.*;
import java.util.ArrayList;
import java.util.Objects;

/** Parameters to limit the list of returned results. */
@Schema(name = "BeaconQuery", description = "Parameters to limit the list of returned results.")
@Generated(
    value = "org.openapitools.codegen.languages.SpringCodegen",
    date = "2024-09-18T10:46:59.161413591-07:00[America/Los_Angeles]",
    comments = "Generator version: 7.8.0")
@SuppressWarnings("PMD")
public class BeaconQuery {

  @Valid private List<FilteringTerm> filters = new ArrayList<>();

  private IncludeResultsetResponses includeResultsetResponses = IncludeResultsetResponses.HIT;

  private Pagination pagination;

  private RequestParameters requestParameters;

  private Granularity requestedGranularity = Granularity.BOOLEAN;

  private Boolean testMode = false;

  public BeaconQuery filters(List<FilteringTerm> filters) {
    this.filters = filters;
    return this;
  }

  public BeaconQuery addFiltersItem(FilteringTerm filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

  /**
   * Filtering terms are the main means to select subsets of records from a Beacon response. While
   * the name implies the application to a generated response, in practice implementations may apply
   * them at the query stage. Note: In the processing of Beacon v2.0 requests multiple filters are
   * assumed to be chained by the logical AND operator.
   *
   * @return filters
   */
  @Valid
  @Schema(
      name = "filters",
      description =
          "Filtering terms are the main means to select subsets of records from a Beacon response. While the name implies the application to a generated response, in practice implementations may apply them at the query stage. Note: In the processing of Beacon v2.0 requests multiple filters are assumed to be chained by the logical AND operator.",
      requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filters")
  public List<FilteringTerm> getFilters() {
    return filters;
  }

  public void setFilters(List<FilteringTerm> filters) {
    this.filters = filters;
  }

  public BeaconQuery includeResultsetResponses(
      IncludeResultsetResponses includeResultsetResponses) {
    this.includeResultsetResponses = includeResultsetResponses;
    return this;
  }

  /**
   * Get includeResultsetResponses
   *
   * @return includeResultsetResponses
   */
  @Valid
  @Schema(name = "includeResultsetResponses", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("includeResultsetResponses")
  public IncludeResultsetResponses getIncludeResultsetResponses() {
    return includeResultsetResponses;
  }

  public void setIncludeResultsetResponses(IncludeResultsetResponses includeResultsetResponses) {
    this.includeResultsetResponses = includeResultsetResponses;
  }

  public BeaconQuery pagination(Pagination pagination) {
    this.pagination = pagination;
    return this;
  }

  /**
   * Get pagination
   *
   * @return pagination
   */
  @Valid
  @Schema(name = "pagination", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pagination")
  public Pagination getPagination() {
    return pagination;
  }

  public void setPagination(Pagination pagination) {
    this.pagination = pagination;
  }

  public BeaconQuery requestParameters(RequestParameters requestParameters) {
    this.requestParameters = requestParameters;
    return this;
  }

  /**
   * Get requestParameters
   *
   * @return requestParameters
   */
  @Valid
  @Schema(name = "requestParameters", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requestParameters")
  public RequestParameters getRequestParameters() {
    return requestParameters;
  }

  public void setRequestParameters(RequestParameters requestParameters) {
    this.requestParameters = requestParameters;
  }

  public BeaconQuery requestedGranularity(Granularity requestedGranularity) {
    this.requestedGranularity = requestedGranularity;
    return this;
  }

  /**
   * Get requestedGranularity
   *
   * @return requestedGranularity
   */
  @Valid
  @Schema(name = "requestedGranularity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requestedGranularity")
  public Granularity getRequestedGranularity() {
    return requestedGranularity;
  }

  public void setRequestedGranularity(Granularity requestedGranularity) {
    this.requestedGranularity = requestedGranularity;
  }

  public BeaconQuery testMode(Boolean testMode) {
    this.testMode = testMode;
    return this;
  }

  /**
   * Used for indicating that a request or response is done in a test context e.g. for compliance
   * testing i.e. to evaluate the acceptance/understanding of a request and the structure of the
   * returned response by the Beacon instance. A TRUE `testMode` parameter DOES NOT require that the
   * Beacon instance is a test instance, but that this specific request-response cycle is a testing
   * one. When `true` the Beacon instance MUST respond the request but it SHOULD use virtual or
   * non-sensitive data. Here, what is being evaluated is the acceptance/understanding of a request
   * and the structure of the returned response by the Beacon instance.
   *
   * @return testMode
   */
  @Schema(
      name = "testMode",
      description =
          "Used for indicating that a request or response is done in a test context e.g. for compliance testing i.e. to evaluate the acceptance/understanding of a request and the structure of the returned response by the Beacon instance. A TRUE `testMode` parameter DOES NOT require that the Beacon instance is a test instance, but that this specific request-response cycle is a testing one. When `true` the Beacon instance MUST respond the request but it SHOULD use virtual or non-sensitive data. Here, what is being evaluated is the acceptance/understanding of a request and the structure of the returned response by the Beacon instance.",
      requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("testMode")
  public Boolean getTestMode() {
    return testMode;
  }

  public void setTestMode(Boolean testMode) {
    this.testMode = testMode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeaconQuery beaconQuery = (BeaconQuery) o;
    return Objects.equals(this.filters, beaconQuery.filters)
        && Objects.equals(this.includeResultsetResponses, beaconQuery.includeResultsetResponses)
        && Objects.equals(this.pagination, beaconQuery.pagination)
        && Objects.equals(this.requestParameters, beaconQuery.requestParameters)
        && Objects.equals(this.requestedGranularity, beaconQuery.requestedGranularity)
        && Objects.equals(this.testMode, beaconQuery.testMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        filters,
        includeResultsetResponses,
        pagination,
        requestParameters,
        requestedGranularity,
        testMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeaconQuery {\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    includeResultsetResponses: ")
        .append(toIndentedString(includeResultsetResponses))
        .append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    requestParameters: ").append(toIndentedString(requestParameters)).append("\n");
    sb.append("    requestedGranularity: ")
        .append(toIndentedString(requestedGranularity))
        .append("\n");
    sb.append("    testMode: ").append(toIndentedString(testMode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
