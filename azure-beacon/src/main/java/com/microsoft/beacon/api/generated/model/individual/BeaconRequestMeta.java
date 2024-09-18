package com.microsoft.beacon.api.generated.model.individual;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Meta section of the Beacon request. It includes request context details relevant for the Beacon
 * server when processing the request.
 */
@Schema(
    name = "beaconRequestMeta",
    description =
        "Meta section of the Beacon request. It includes request context details relevant for the Beacon server when processing the request.")
@JsonTypeName("beaconRequestMeta")
@Generated(
    value = "org.openapitools.codegen.languages.SpringCodegen",
    date = "2024-09-18T10:46:59.161413591-07:00[America/Los_Angeles]",
    comments = "Generator version: 7.8.0")
@SuppressWarnings("PMD")
public class BeaconRequestMeta {

  private String $schema;

  private String apiVersion;

  @Valid private List<@Valid SchemasPerEntity> requestedSchemas = new ArrayList<>();

  public BeaconRequestMeta() {
    super();
  }

  /** Constructor with only required parameters */
  public BeaconRequestMeta(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public BeaconRequestMeta $schema(String $schema) {
    this.$schema = $schema;
    return this;
  }

  /**
   * Refers to the JSON Schema which describes the set of valid attributes for this particular
   * document type. This attribute is mostly used in schemas that should be tested in Beacon
   * implementations.
   *
   * @return $schema
   */
  @Schema(
      name = "$schema",
      description =
          "Refers to the JSON Schema which describes the set of valid attributes for this particular document type. This attribute is mostly used in schemas that should be tested in Beacon implementations.",
      requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("$schema")
  public String get$Schema() {
    return $schema;
  }

  public void set$Schema(String $schema) {
    this.$schema = $schema;
  }

  public BeaconRequestMeta apiVersion(String apiVersion) {
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

  public BeaconRequestMeta requestedSchemas(List<@Valid SchemasPerEntity> requestedSchemas) {
    this.requestedSchemas = requestedSchemas;
    return this;
  }

  public BeaconRequestMeta addRequestedSchemasItem(SchemasPerEntity requestedSchemasItem) {
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
  @Valid
  @Schema(
      name = "requestedSchemas",
      description = "Set of schemas to be used in the response to a request.",
      requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requestedSchemas")
  public List<@Valid SchemasPerEntity> getRequestedSchemas() {
    return requestedSchemas;
  }

  public void setRequestedSchemas(List<@Valid SchemasPerEntity> requestedSchemas) {
    this.requestedSchemas = requestedSchemas;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeaconRequestMeta beaconRequestMeta = (BeaconRequestMeta) o;
    return Objects.equals(this.$schema, beaconRequestMeta.$schema)
        && Objects.equals(this.apiVersion, beaconRequestMeta.apiVersion)
        && Objects.equals(this.requestedSchemas, beaconRequestMeta.requestedSchemas);
  }

  @Override
  public int hashCode() {
    return Objects.hash($schema, apiVersion, requestedSchemas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeaconRequestMeta {\n");
    sb.append("    $schema: ").append(toIndentedString($schema)).append("\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    requestedSchemas: ").append(toIndentedString(requestedSchemas)).append("\n");
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
