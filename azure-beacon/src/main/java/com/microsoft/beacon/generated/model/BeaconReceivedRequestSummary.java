package com.microsoft.beacon.generated.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Section of the response that summarize the request received as it has been interpreted by the
 * Beacon server. This summary can help to identify differences between the incoming request and its
 * interpretation or processing, e.g. in the response granularity or pagination. The required
 * properties include those that should be part of every request.
 */
@Schema(
    name = "beaconReceivedRequestSummary",
    description =
        "Section of the response that summarize the request received as it has been interpreted by the Beacon server. This summary can help to identify differences between the incoming request and its interpretation or processing, e.g. in the response granularity or pagination. The required properties include those that should be part of every request.")
@JsonTypeName("beaconReceivedRequestSummary")
@Generated(
    value = "org.openapitools.codegen.languages.SpringCodegen",
    date = "2024-09-18T10:46:59.161413591-07:00[America/Los_Angeles]",
    comments = "Generator version: 7.8.0")
@SuppressWarnings("PMD")
public class BeaconReceivedRequestSummary {

  private String apiVersion;

  @Valid private List<String> filters = new ArrayList<>();

  private IncludeResultsetResponses includeResultsetResponses = IncludeResultsetResponses.HIT;

  private Pagination pagination;

  private RequestParameters requestParameters;

  private Granularity requestedGranularity = Granularity.BOOLEAN;

  @Valid private List<@Valid SchemasPerEntity> requestedSchemas = new ArrayList<>();

  private Boolean testMode = false;

  public BeaconReceivedRequestSummary() {
    super();
  }

  /** Constructor with only required parameters */
  public BeaconReceivedRequestSummary(
      String apiVersion,
      Pagination pagination,
      Granularity requestedGranularity,
      List<@Valid SchemasPerEntity> requestedSchemas) {
    this.apiVersion = apiVersion;
    this.pagination = pagination;
    this.requestedGranularity = requestedGranularity;
    this.requestedSchemas = requestedSchemas;
  }

  public BeaconReceivedRequestSummary apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Version of API, e.g. in request or response. Beacon uses a Github-style, \"v\"-prefixed
   * semantic versioning format.
   *
   * @return apiVersion
   */
  @NotNull
  @Schema(
      name = "apiVersion",
      description =
          "Version of API, e.g. in request or response. Beacon uses a Github-style, \"v\"-prefixed semantic versioning format.",
      requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("apiVersion")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public BeaconReceivedRequestSummary filters(List<String> filters) {
    this.filters = filters;
    return this;
  }

  public BeaconReceivedRequestSummary addFiltersItem(String filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

  /**
   * Ontology based filters. A CURIE syntax is encouraged to be used.
   *
   * @return filters
   */
  @Schema(
      name = "filters",
      example = "[\"BTO:0000199\",\"PATO:0000383\"]",
      description = "Ontology based filters. A CURIE syntax is encouraged to be used.",
      requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filters")
  public List<String> getFilters() {
    return filters;
  }

  public void setFilters(List<String> filters) {
    this.filters = filters;
  }

  public BeaconReceivedRequestSummary includeResultsetResponses(
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

  public BeaconReceivedRequestSummary pagination(Pagination pagination) {
    this.pagination = pagination;
    return this;
  }

  /**
   * Get pagination
   *
   * @return pagination
   */
  @NotNull
  @Valid
  @Schema(name = "pagination", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pagination")
  public Pagination getPagination() {
    return pagination;
  }

  public void setPagination(Pagination pagination) {
    this.pagination = pagination;
  }

  public BeaconReceivedRequestSummary requestParameters(RequestParameters requestParameters) {
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

  public BeaconReceivedRequestSummary requestedGranularity(Granularity requestedGranularity) {
    this.requestedGranularity = requestedGranularity;
    return this;
  }

  /**
   * Get requestedGranularity
   *
   * @return requestedGranularity
   */
  @NotNull
  @Valid
  @Schema(name = "requestedGranularity", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("requestedGranularity")
  public Granularity getRequestedGranularity() {
    return requestedGranularity;
  }

  public void setRequestedGranularity(Granularity requestedGranularity) {
    this.requestedGranularity = requestedGranularity;
  }

  public BeaconReceivedRequestSummary requestedSchemas(
      List<@Valid SchemasPerEntity> requestedSchemas) {
    this.requestedSchemas = requestedSchemas;
    return this;
  }

  public BeaconReceivedRequestSummary addRequestedSchemasItem(
      SchemasPerEntity requestedSchemasItem) {
    if (this.requestedSchemas == null) {
      this.requestedSchemas = new ArrayList<>();
    }
    this.requestedSchemas.add(requestedSchemasItem);
    return this;
  }

  /**
   * Set of schemas to be used in the response to a request.
   *
   * @return requestedSchemas
   */
  @NotNull
  @Valid
  @Schema(
      name = "requestedSchemas",
      description = "Set of schemas to be used in the response to a request.",
      requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("requestedSchemas")
  public List<@Valid SchemasPerEntity> getRequestedSchemas() {
    return requestedSchemas;
  }

  public void setRequestedSchemas(List<@Valid SchemasPerEntity> requestedSchemas) {
    this.requestedSchemas = requestedSchemas;
  }

  public BeaconReceivedRequestSummary testMode(Boolean testMode) {
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
    BeaconReceivedRequestSummary beaconReceivedRequestSummary = (BeaconReceivedRequestSummary) o;
    return Objects.equals(this.apiVersion, beaconReceivedRequestSummary.apiVersion)
        && Objects.equals(this.filters, beaconReceivedRequestSummary.filters)
        && Objects.equals(
            this.includeResultsetResponses, beaconReceivedRequestSummary.includeResultsetResponses)
        && Objects.equals(this.pagination, beaconReceivedRequestSummary.pagination)
        && Objects.equals(this.requestParameters, beaconReceivedRequestSummary.requestParameters)
        && Objects.equals(
            this.requestedGranularity, beaconReceivedRequestSummary.requestedGranularity)
        && Objects.equals(this.requestedSchemas, beaconReceivedRequestSummary.requestedSchemas)
        && Objects.equals(this.testMode, beaconReceivedRequestSummary.testMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        apiVersion,
        filters,
        includeResultsetResponses,
        pagination,
        requestParameters,
        requestedGranularity,
        requestedSchemas,
        testMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeaconReceivedRequestSummary {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    includeResultsetResponses: ")
        .append(toIndentedString(includeResultsetResponses))
        .append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    requestParameters: ").append(toIndentedString(requestParameters)).append("\n");
    sb.append("    requestedGranularity: ")
        .append(toIndentedString(requestedGranularity))
        .append("\n");
    sb.append("    requestedSchemas: ").append(toIndentedString(requestedSchemas)).append("\n");
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
