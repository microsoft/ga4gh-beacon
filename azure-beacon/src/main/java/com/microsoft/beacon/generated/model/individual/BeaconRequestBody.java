package com.microsoft.beacon.generated.model.individual;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.Objects;

/**
 * Schema for the Beacon request. It is named &#x60;RequestBody&#x60; to keep the same nomenclature
 * used by OpenAPI v3, but it actually contains the definition of the whole HTTP POST request
 * payload.
 */
@Schema(
    name = "beaconRequestBody",
    description =
        "Schema for the Beacon request. It is named `RequestBody` to keep the same nomenclature used by OpenAPI v3, but it actually contains the definition of the whole HTTP POST request payload.")
@JsonTypeName("beaconRequestBody")
@Generated(
    value = "org.openapitools.codegen.languages.SpringCodegen",
    date = "2024-09-18T10:46:59.161413591-07:00[America/Los_Angeles]",
    comments = "Generator version: 7.8.0")
@SuppressWarnings("PMD")
public class BeaconRequestBody {

  private String $schema;

  private BeaconRequestMeta meta;

  private BeaconQuery query;

  public BeaconRequestBody() {
    super();
  }

  /** Constructor with only required parameters */
  public BeaconRequestBody(BeaconRequestMeta meta) {
    this.meta = meta;
  }

  public BeaconRequestBody $schema(String $schema) {
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

  public BeaconRequestBody meta(BeaconRequestMeta meta) {
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
  public BeaconRequestMeta getMeta() {
    return meta;
  }

  public void setMeta(BeaconRequestMeta meta) {
    this.meta = meta;
  }

  public BeaconRequestBody query(BeaconQuery query) {
    this.query = query;
    return this;
  }

  /**
   * Get query
   *
   * @return query
   */
  @Valid
  @Schema(name = "query", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("query")
  public BeaconQuery getQuery() {
    return query;
  }

  public void setQuery(BeaconQuery query) {
    this.query = query;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeaconRequestBody beaconRequestBody = (BeaconRequestBody) o;
    return Objects.equals(this.$schema, beaconRequestBody.$schema)
        && Objects.equals(this.meta, beaconRequestBody.meta)
        && Objects.equals(this.query, beaconRequestBody.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash($schema, meta, query);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeaconRequestBody {\n");
    sb.append("    $schema: ").append(toIndentedString($schema)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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
