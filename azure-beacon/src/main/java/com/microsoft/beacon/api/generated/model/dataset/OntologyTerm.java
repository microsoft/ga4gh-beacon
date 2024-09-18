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

/** Definition of an ontology term. */
@Schema(name = "ontologyTerm", description = "Definition of an ontology term.")
@JsonTypeName("ontologyTerm")
@Generated(
    value = "org.openapitools.codegen.languages.SpringCodegen",
    date = "2024-09-17T11:51:47.952858147-07:00[America/Los_Angeles]",
    comments = "Generator version: 7.8.0")
@SuppressWarnings("PMD")
public class OntologyTerm {

  private String id;

  private String label;

  public OntologyTerm() {
    super();
  }

  /** Constructor with only required parameters */
  public OntologyTerm(String id) {
    this.id = id;
  }

  public OntologyTerm id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Definition of an identifier in the CURIE `prefix:local-part` format which is the default type
   * of e.g. ontology term `id` values (used e.g. for filters or external identifiers).
   *
   * @return id
   */
  @NotNull
  @Pattern(regexp = "^\\w[^:]+:.+$")
  @Schema(
      name = "id",
      description =
          "Definition of an identifier in the CURIE `prefix:local-part` format which is the default type of e.g. ontology term `id` values (used e.g. for filters or external identifiers).",
      requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OntologyTerm label(String label) {
    this.label = label;
    return this;
  }

  /**
   * The text that describes the term. By default it could be the preferred text of the term, but is
   * it acceptable to customize it for a clearer description and understanding of the term in an
   * specific context.
   *
   * @return label
   */
  @Schema(
      name = "label",
      description =
          "The text that describes the term. By default it could be the preferred text of the term, but is it acceptable to customize it for a clearer description and understanding of the term in an specific context.",
      requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
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
  public OntologyTerm putAdditionalProperty(String key, Object value) {
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
    OntologyTerm ontologyTerm = (OntologyTerm) o;
    return Objects.equals(this.id, ontologyTerm.id)
        && Objects.equals(this.label, ontologyTerm.label)
        && Objects.equals(this.additionalProperties, ontologyTerm.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, label, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OntologyTerm {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");

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
