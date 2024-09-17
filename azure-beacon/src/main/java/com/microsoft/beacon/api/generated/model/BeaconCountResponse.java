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
 * Complete definition for a response that does not include record level details but provides
 * &#x60;Boolean&#x60; and &#x60;count&#x60; information.
 */
@Schema(
    name = "beaconCountResponse",
    description =
        "Complete definition for a response that does not include record level details but provides `Boolean` and `count` information.")
@JsonTypeName("beaconCountResponse")
@Generated(
    value = "org.openapitools.codegen.languages.SpringCodegen",
    date = "2024-09-17T11:51:47.952858147-07:00[America/Los_Angeles]",
    comments = "Generator version: 7.8.0")
public class BeaconCountResponse implements GetDatasets200Response, GetOneDataset200Response {

  @Valid private List<@Valid Handover> beaconHandovers = new ArrayList<>();

  private Object info;

  private BeaconResponseMeta meta;

  private BeaconCountResponseSection responseSummary;

  public BeaconCountResponse() {
    super();
  }

  /** Constructor with only required parameters */
  public BeaconCountResponse(BeaconResponseMeta meta, BeaconCountResponseSection responseSummary) {
    this.meta = meta;
    this.responseSummary = responseSummary;
  }

  public BeaconCountResponse beaconHandovers(List<@Valid Handover> beaconHandovers) {
    this.beaconHandovers = beaconHandovers;
    return this;
  }

  public BeaconCountResponse addBeaconHandoversItem(Handover beaconHandoversItem) {
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

  public BeaconCountResponse info(Object info) {
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

  public BeaconCountResponse meta(BeaconResponseMeta meta) {
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

  public BeaconCountResponse responseSummary(BeaconCountResponseSection responseSummary) {
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
  public BeaconCountResponseSection getResponseSummary() {
    return responseSummary;
  }

  public void setResponseSummary(BeaconCountResponseSection responseSummary) {
    this.responseSummary = responseSummary;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeaconCountResponse beaconCountResponse = (BeaconCountResponse) o;
    return Objects.equals(this.beaconHandovers, beaconCountResponse.beaconHandovers)
        && Objects.equals(this.info, beaconCountResponse.info)
        && Objects.equals(this.meta, beaconCountResponse.meta)
        && Objects.equals(this.responseSummary, beaconCountResponse.responseSummary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beaconHandovers, info, meta, responseSummary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeaconCountResponse {\n");
    sb.append("    beaconHandovers: ").append(toIndentedString(beaconHandovers)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    responseSummary: ").append(toIndentedString(responseSummary)).append("\n");
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