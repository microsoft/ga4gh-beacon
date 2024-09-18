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

/** Meta information about the response. */
@Schema(
    name = "beaconInformationalResponseMeta",
    description = "Meta information about the response.")
@JsonTypeName("beaconInformationalResponseMeta")
@Generated(
    value = "org.openapitools.codegen.languages.SpringCodegen",
    date = "2024-09-18T10:46:59.161413591-07:00[America/Los_Angeles]",
    comments = "Generator version: 7.8.0")
@SuppressWarnings("PMD")
public class BeaconInformationalResponseMeta {

  private String apiVersion;

  private String beaconId;

  @Valid private List<@Valid SchemasPerEntity> returnedSchemas = new ArrayList<>();

  public BeaconInformationalResponseMeta() {
    super();
  }

  /** Constructor with only required parameters */
  public BeaconInformationalResponseMeta(
      String apiVersion, String beaconId, List<@Valid SchemasPerEntity> returnedSchemas) {
    this.apiVersion = apiVersion;
    this.beaconId = beaconId;
    this.returnedSchemas = returnedSchemas;
  }

  public BeaconInformationalResponseMeta apiVersion(String apiVersion) {
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

  public BeaconInformationalResponseMeta beaconId(String beaconId) {
    this.beaconId = beaconId;
    return this;
  }

  /**
   * The Id of a Beacon. Usually a reversed domain string, but any URI is acceptable. The purpose of
   * this attribute is, in the context of a Beacon network, to disambiguate responses coming from
   * different Beacons.
   *
   * @return beaconId
   */
  @NotNull
  @Schema(
      name = "beaconId",
      description =
          "The Id of a Beacon. Usually a reversed domain string, but any URI is acceptable. The purpose of this attribute is, in the context of a Beacon network, to disambiguate responses coming from different Beacons.",
      requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("beaconId")
  public String getBeaconId() {
    return beaconId;
  }

  public void setBeaconId(String beaconId) {
    this.beaconId = beaconId;
  }

  public BeaconInformationalResponseMeta returnedSchemas(
      List<@Valid SchemasPerEntity> returnedSchemas) {
    this.returnedSchemas = returnedSchemas;
    return this;
  }

  public BeaconInformationalResponseMeta addReturnedSchemasItem(
      SchemasPerEntity returnedSchemasItem) {
    if (this.returnedSchemas == null) {
      this.returnedSchemas = new ArrayList<>();
    }
    this.returnedSchemas.add(returnedSchemasItem);
    return this;
  }

  /**
   * Set of schemas to be used in the response to a request.
   *
   * @return returnedSchemas
   */
  @NotNull
  @Valid
  @Schema(
      name = "returnedSchemas",
      description = "Set of schemas to be used in the response to a request.",
      requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("returnedSchemas")
  public List<@Valid SchemasPerEntity> getReturnedSchemas() {
    return returnedSchemas;
  }

  public void setReturnedSchemas(List<@Valid SchemasPerEntity> returnedSchemas) {
    this.returnedSchemas = returnedSchemas;
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
  public BeaconInformationalResponseMeta putAdditionalProperty(String key, Object value) {
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
    BeaconInformationalResponseMeta beaconInformationalResponseMeta =
        (BeaconInformationalResponseMeta) o;
    return Objects.equals(this.apiVersion, beaconInformationalResponseMeta.apiVersion)
        && Objects.equals(this.beaconId, beaconInformationalResponseMeta.beaconId)
        && Objects.equals(this.returnedSchemas, beaconInformationalResponseMeta.returnedSchemas)
        && Objects.equals(
            this.additionalProperties, beaconInformationalResponseMeta.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, beaconId, returnedSchemas, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeaconInformationalResponseMeta {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    beaconId: ").append(toIndentedString(beaconId)).append("\n");
    sb.append("    returnedSchemas: ").append(toIndentedString(returnedSchemas)).append("\n");

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
