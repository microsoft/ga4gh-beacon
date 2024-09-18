package com.microsoft.beacon.api.generated.model.dataset;

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

/** Returning the Beacon Collections list, filtered or unfiltered. */
@Schema(
    name = "beaconCollectionsResponse_response",
    description = "Returning the Beacon Collections list, filtered or unfiltered.")
@JsonTypeName("beaconCollectionsResponse_response")
@Generated(
    value = "org.openapitools.codegen.languages.SpringCodegen",
    date = "2024-09-17T11:51:47.952858147-07:00[America/Los_Angeles]",
    comments = "Generator version: 7.8.0")
@SuppressWarnings("PMD")
public class BeaconCollectionsResponseResponse {

  @Valid private List<Object> collections = new ArrayList<>();

  public BeaconCollectionsResponseResponse() {
    super();
  }

  /** Constructor with only required parameters */
  public BeaconCollectionsResponseResponse(List<Object> collections) {
    this.collections = collections;
  }

  public BeaconCollectionsResponseResponse collections(List<Object> collections) {
    this.collections = collections;
    return this;
  }

  public BeaconCollectionsResponseResponse addCollectionsItem(Object collectionsItem) {
    if (this.collections == null) {
      this.collections = new ArrayList<>();
    }
    this.collections.add(collectionsItem);
    return this;
  }

  /**
   * Get collections
   *
   * @return collections
   */
  @NotNull
  @Size(min = 0)
  @Schema(name = "collections", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("collections")
  public List<Object> getCollections() {
    return collections;
  }

  public void setCollections(List<Object> collections) {
    this.collections = collections;
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
  public BeaconCollectionsResponseResponse putAdditionalProperty(String key, Object value) {
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
    BeaconCollectionsResponseResponse beaconCollectionsResponseResponse =
        (BeaconCollectionsResponseResponse) o;
    return Objects.equals(this.collections, beaconCollectionsResponseResponse.collections)
        && Objects.equals(
            this.additionalProperties, beaconCollectionsResponseResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collections, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeaconCollectionsResponseResponse {\n");
    sb.append("    collections: ").append(toIndentedString(collections)).append("\n");

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
