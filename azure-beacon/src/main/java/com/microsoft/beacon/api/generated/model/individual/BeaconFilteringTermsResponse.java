package com.microsoft.beacon.api.generated.model.individual;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * The filtering terms response provides information about available individual filters for a
 * beacon&#39;s entry types as well as optional information about the ontologies the filters belong
 * to.
 */
@Schema(
    name = "beaconFilteringTermsResponse",
    description =
        "The filtering terms response provides information about available individual filters for a beacon's entry types as well as optional information about the ontologies the filters belong to.")
@JsonTypeName("beaconFilteringTermsResponse")
@Generated(
    value = "org.openapitools.codegen.languages.SpringCodegen",
    date = "2024-09-18T10:46:59.161413591-07:00[America/Los_Angeles]",
    comments = "Generator version: 7.8.0")
@SuppressWarnings("PMD")
public class BeaconFilteringTermsResponse {

  private BeaconInformationalResponseMeta meta;

  private BeaconFilteringTermsResults response;

  public BeaconFilteringTermsResponse() {
    super();
  }

  /** Constructor with only required parameters */
  public BeaconFilteringTermsResponse(
      BeaconInformationalResponseMeta meta, BeaconFilteringTermsResults response) {
    this.meta = meta;
    this.response = response;
  }

  public BeaconFilteringTermsResponse meta(BeaconInformationalResponseMeta meta) {
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
  public BeaconInformationalResponseMeta getMeta() {
    return meta;
  }

  public void setMeta(BeaconInformationalResponseMeta meta) {
    this.meta = meta;
  }

  public BeaconFilteringTermsResponse response(BeaconFilteringTermsResults response) {
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
  public BeaconFilteringTermsResults getResponse() {
    return response;
  }

  public void setResponse(BeaconFilteringTermsResults response) {
    this.response = response;
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
  public BeaconFilteringTermsResponse putAdditionalProperty(String key, Object value) {
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
    BeaconFilteringTermsResponse beaconFilteringTermsResponse = (BeaconFilteringTermsResponse) o;
    return Objects.equals(this.meta, beaconFilteringTermsResponse.meta)
        && Objects.equals(this.response, beaconFilteringTermsResponse.response)
        && Objects.equals(
            this.additionalProperties, beaconFilteringTermsResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, response, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeaconFilteringTermsResponse {\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");

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
