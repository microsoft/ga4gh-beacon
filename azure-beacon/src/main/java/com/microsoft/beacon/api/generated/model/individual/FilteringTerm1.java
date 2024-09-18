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

/** Entities can be filtered using this term. */
@Schema(name = "FilteringTerm_1", description = "Entities can be filtered using this term.")
@JsonTypeName("FilteringTerm_1")
@Generated(
    value = "org.openapitools.codegen.languages.SpringCodegen",
    date = "2024-09-18T10:46:59.161413591-07:00[America/Los_Angeles]",
    comments = "Generator version: 7.8.0")
@SuppressWarnings("PMD")
public class FilteringTerm1 {

  private String id;

  private String label;

  private String type;

  @Valid private List<String> scopes = new ArrayList<>();

  public FilteringTerm1() {
    super();
  }

  /** Constructor with only required parameters */
  public FilteringTerm1(String id, String type) {
    this.id = id;
    this.type = type;
  }

  public FilteringTerm1 id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The field id in the case of numeric or alphanumeric fields, or the term id in the case of
   * ontology or custom terms. CURIE syntax in the case of an ontology term.
   *
   * @return id
   */
  @NotNull
  @Schema(
      name = "id",
      description =
          "The field id in the case of numeric or alphanumeric fields, or the term id in the case of ontology or custom terms. CURIE syntax in the case of an ontology term.",
      requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FilteringTerm1 label(String label) {
    this.label = label;
    return this;
  }

  /**
   * This would be the \"preferred Label\" in the case of an ontology term.
   *
   * @return label
   */
  @Schema(
      name = "label",
      description = "This would be the \"preferred Label\" in the case of an ontology term.",
      requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public FilteringTerm1 type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Either \"custom\", \"alphanumeric\" or ontology/terminology full name. TODO: An ontology ...
   * with a registered prefix does not need a full name so one may better use CURIE to indicate that
   * the resource can be retrieved from the id. This also will allow to provide an enum here.
   *
   * @return type
   */
  @NotNull
  @Schema(
      name = "type",
      description =
          "Either \"custom\", \"alphanumeric\" or ontology/terminology full name. TODO: An ontology ... with a registered prefix does not need a full name so one may better use CURIE to indicate that the resource can be retrieved from the id. This also will allow to provide an enum here.",
      requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public FilteringTerm1 scopes(List<String> scopes) {
    this.scopes = scopes;
    return this;
  }

  public FilteringTerm1 addScopesItem(String scopesItem) {
    if (this.scopes == null) {
      this.scopes = new ArrayList<>();
    }
    this.scopes.add(scopesItem);
    return this;
  }

  /**
   * Entry types affected by this filter.
   *
   * @return scopes
   */
  @Schema(
      name = "scopes",
      description = "Entry types affected by this filter.",
      requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scopes")
  public List<String> getScopes() {
    return scopes;
  }

  public void setScopes(List<String> scopes) {
    this.scopes = scopes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilteringTerm1 filteringTerm1 = (FilteringTerm1) o;
    return Objects.equals(this.id, filteringTerm1.id)
        && Objects.equals(this.label, filteringTerm1.label)
        && Objects.equals(this.type, filteringTerm1.type)
        && Objects.equals(this.scopes, filteringTerm1.scopes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, label, type, scopes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilteringTerm1 {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
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
