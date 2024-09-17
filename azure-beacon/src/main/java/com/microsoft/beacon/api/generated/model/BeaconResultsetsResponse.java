package com.microsoft.beacon.generated.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Beacon response that includes record level details, grouped in Resultsets. */
@Schema(
    name = "beaconResultsetsResponse",
    description = "Beacon response that includes record level details, grouped in Resultsets.")
@JsonTypeName("beaconResultsetsResponse")
@Generated(
    value = "org.openapitools.codegen.languages.SpringCodegen",
    date = "2024-09-17T11:51:47.952858147-07:00[America/Los_Angeles]",
    comments = "Generator version: 7.8.0")
public class BeaconResultsetsResponse implements GetOneDataset200Response {

  @Valid private List<@Valid Handover> beaconHandovers = new ArrayList<>();

  private Object info;

  private BeaconResponseMeta meta;

  private BeaconResultsets response;

  private BeaconSummaryResponseSection responseSummary;

  public BeaconResultsetsResponse() {
    super();
  }

  /** Constructor with only required parameters */
  public BeaconResultsetsResponse(
      BeaconResponseMeta meta,
      BeaconResultsets response,
      BeaconSummaryResponseSection responseSummary) {
    this.meta = meta;
    this.response = response;
    this.responseSummary = responseSummary;
  }

  public BeaconResultsetsResponse beaconHandovers(List<@Valid Handover> beaconHandovers) {
    this.beaconHandovers = beaconHandovers;
    return this;
  }

  public BeaconResultsetsResponse addBeaconHandoversItem(Handover beaconHandoversItem) {
    if (this.beaconHandovers == null) {
      this.beaconHandovers = new ArrayList<>();
    }
    this.beaconHandovers.add(beaconHandoversItem);
    return this;
  }

  /**
   * Set of handovers to be added in one section the response.
   *
   * @return beaconHandovers
   */
  @Valid
  @Schema(
      name = "beaconHandovers",
      description = "Set of handovers to be added in one section the response.",
      requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("beaconHandovers")
  public List<@Valid Handover> getBeaconHandovers() {
    return beaconHandovers;
  }

  public void setBeaconHandovers(List<@Valid Handover> beaconHandovers) {
    this.beaconHandovers = beaconHandovers;
  }

  public BeaconResultsetsResponse info(Object info) {
    this.info = info;
    return this;
  }

  /**
   * Placeholder to allow the Beacon to return any additional information that is necessary or could
   * be of interest in relation to the query or the entry returned. It is recommended to encapsulate
   * additional informations in this attribute instead of directly adding attributes at the same
   * level than the others in order to avoid collision in the names of attributes in future versions
   * of the specification.
   *
   * @return info
   */
  @Schema(
      name = "info",
      description =
          "Placeholder to allow the Beacon to return any additional information that is necessary or could be of interest in relation to the query or the entry returned. It is recommended to encapsulate additional informations in this attribute instead of directly adding attributes at the same level than the others in order to avoid collision in the names of attributes in future versions of the specification.",
      requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("info")
  public Object getInfo() {
    return info;
  }

  public void setInfo(Object info) {
    this.info = info;
  }

  public BeaconResultsetsResponse meta(BeaconResponseMeta meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   *
   * @return meta
   */
  @NotNull
  @Valid
  @Schema(name = "meta", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("meta")
  public BeaconResponseMeta getMeta() {
    return meta;
  }

  public void setMeta(BeaconResponseMeta meta) {
    this.meta = meta;
  }

  public BeaconResultsetsResponse response(BeaconResultsets response) {
    this.response = response;
    return this;
  }

  /**
   * Get response
   *
   * @return response
   */
  @NotNull
  @Valid
  @Schema(name = "response", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("response")
  public BeaconResultsets getResponse() {
    return response;
  }

  public void setResponse(BeaconResultsets response) {
    this.response = response;
  }

  public BeaconResultsetsResponse responseSummary(BeaconSummaryResponseSection responseSummary) {
    this.responseSummary = responseSummary;
    return this;
  }

  /**
   * Get responseSummary
   *
   * @return responseSummary
   */
  @NotNull
  @Valid
  @Schema(name = "responseSummary", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("responseSummary")
  public BeaconSummaryResponseSection getResponseSummary() {
    return responseSummary;
  }

  public void setResponseSummary(BeaconSummaryResponseSection responseSummary) {
    this.responseSummary = responseSummary;
  }

  /**
   * A container for additional, undeclared properties. This is a holder for any undeclared
   * properties as specified with the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value. If the property
   * does not already exist, create it otherwise replace it.
   */
  @JsonAnySetter
  public BeaconResultsetsResponse putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /** Return the additional (undeclared) property. */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /** Return the additional (undeclared) property with the specified name. */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
      return null;
    }
    return this.additionalProperties.get(key);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeaconResultsetsResponse beaconResultsetsResponse = (BeaconResultsetsResponse) o;
    return Objects.equals(this.beaconHandovers, beaconResultsetsResponse.beaconHandovers)
        && Objects.equals(this.info, beaconResultsetsResponse.info)
        && Objects.equals(this.meta, beaconResultsetsResponse.meta)
        && Objects.equals(this.response, beaconResultsetsResponse.response)
        && Objects.equals(this.responseSummary, beaconResultsetsResponse.responseSummary)
        && Objects.equals(this.additionalProperties, beaconResultsetsResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        beaconHandovers, info, meta, response, responseSummary, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeaconResultsetsResponse {\n");
    sb.append("    beaconHandovers: ").append(toIndentedString(beaconHandovers)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    responseSummary: ").append(toIndentedString(responseSummary)).append("\n");

    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
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