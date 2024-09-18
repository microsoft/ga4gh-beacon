package com.microsoft.beacon.api.generated.model.individual;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Sets of results to be returned as query response. */
@Schema(
    name = "beaconResultsets",
    description = "Sets of results to be returned as query response.")
@JsonTypeName("beaconResultsets")
@Generated(
    value = "org.openapitools.codegen.languages.SpringCodegen",
    date = "2024-09-18T10:46:59.161413591-07:00[America/Los_Angeles]",
    comments = "Generator version: 7.8.0")
@SuppressWarnings("PMD")
public class BeaconResultsets {

  private String $schema;

  @Valid private List<ResultsetInstance> resultSets = new ArrayList<>();

  public BeaconResultsets() {
    super();
  }

  /** Constructor with only required parameters */
  public BeaconResultsets(List<ResultsetInstance> resultSets) {
    this.resultSets = resultSets;
  }

  public BeaconResultsets $schema(String $schema) {
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

  public BeaconResultsets resultSets(List<ResultsetInstance> resultSets) {
    this.resultSets = resultSets;
    return this;
  }

  public BeaconResultsets addResultSetsItem(ResultsetInstance resultSetsItem) {
    if (this.resultSets == null) {
      this.resultSets = new ArrayList<>();
    }
    this.resultSets.add(resultSetsItem);
    return this;
  }

  /**
   * Get resultSets
   *
   * @return resultSets
   */
  @NotNull
  @Valid
  @Size(min = 0)
  @Schema(name = "resultSets", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("resultSets")
  public List<ResultsetInstance> getResultSets() {
    return resultSets;
  }

  public void setResultSets(List<ResultsetInstance> resultSets) {
    this.resultSets = resultSets;
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
  public BeaconResultsets putAdditionalProperty(String key, Object value) {
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
    BeaconResultsets beaconResultsets = (BeaconResultsets) o;
    return Objects.equals(this.$schema, beaconResultsets.$schema)
        && Objects.equals(this.resultSets, beaconResultsets.resultSets)
        && Objects.equals(this.additionalProperties, beaconResultsets.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash($schema, resultSets, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeaconResultsets {\n");
    sb.append("    $schema: ").append(toIndentedString($schema)).append("\n");
    sb.append("    resultSets: ").append(toIndentedString(resultSets)).append("\n");

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
