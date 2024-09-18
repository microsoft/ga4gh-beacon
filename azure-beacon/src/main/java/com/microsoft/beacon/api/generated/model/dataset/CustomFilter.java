package com.microsoft.beacon.generated.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/** Filter results to include records that contain a custom term defined by this Beacon. */
@Schema(
    name = "CustomFilter",
    description =
        "Filter results to include records that contain a custom term defined by this Beacon.")
@Generated(
    value = "org.openapitools.codegen.languages.SpringCodegen",
    date = "2024-09-17T11:51:47.952858147-07:00[America/Los_Angeles]",
    comments = "Generator version: 7.8.0")
@SuppressWarnings("PMD")
public class CustomFilter {

  private String id;

  private String scope;

  public CustomFilter() {
    super();
  }

  /** Constructor with only required parameters */
  public CustomFilter(String id) {
    this.id = id;
  }

  public CustomFilter id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Custom filter terms should contain a unique identifier.
   *
   * @return id
   */
  @NotNull
  @Schema(
      name = "id",
      example = "demographic.ethnicity:asian",
      description = "Custom filter terms should contain a unique identifier.",
      requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CustomFilter scope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * The entry type to which the filter applies
   *
   * @return scope
   */
  @Schema(
      name = "scope",
      example = "individuals",
      description = "The entry type to which the filter applies",
      requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scope")
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFilter customFilter = (CustomFilter) o;
    return Objects.equals(this.id, customFilter.id)
        && Objects.equals(this.scope, customFilter.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, scope);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFilter {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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
