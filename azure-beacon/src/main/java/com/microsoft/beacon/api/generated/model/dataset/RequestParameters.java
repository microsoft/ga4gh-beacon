package com.microsoft.beacon.api.generated.model.dataset;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * The schema below is a placeholder for a dictionary &#39;key&#39;:&#39;object&#39;. The individual
 * definitions depend on the model (e.g. beacon-v2-default-model) and entity (e.g.
 * &#x60;genomicVariant&#x60;).
 */
@Schema(
    name = "requestParameters",
    description =
        "The schema below is a placeholder for a dictionary 'key':'object'. The individual definitions depend on the model (e.g. beacon-v2-default-model) and entity (e.g. `genomicVariant`).")
@JsonTypeName("requestParameters")
@Generated(
    value = "org.openapitools.codegen.languages.SpringCodegen",
    date = "2024-09-17T11:51:47.952858147-07:00[America/Los_Angeles]",
    comments = "Generator version: 7.8.0")
@SuppressWarnings("PMD")
public class RequestParameters {

  private String $schema;

  public RequestParameters $schema(String $schema) {
    this.$schema = $schema;
    return this;
  }

  /**
   * Added here to allow proper validation of the documents w/o providing specific values.
   *
   * @return $schema
   */
  @Schema(
      name = "$schema",
      description =
          "Added here to allow proper validation of the documents w/o providing specific values.",
      requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("$schema")
  public String get$Schema() {
    return $schema;
  }

  public void set$Schema(String $schema) {
    this.$schema = $schema;
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
  public RequestParameters putAdditionalProperty(String key, Object value) {
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
    RequestParameters requestParameters = (RequestParameters) o;
    return Objects.equals(this.$schema, requestParameters.$schema)
        && Objects.equals(this.additionalProperties, requestParameters.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash($schema, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestParameters {\n");
    sb.append("    $schema: ").append(toIndentedString($schema)).append("\n");

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
