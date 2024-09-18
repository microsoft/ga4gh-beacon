package com.microsoft.beacon.generated.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/** Filter results based on operators and values applied to alphanumeric fields. */
@Schema(
    name = "AlphanumericFilter",
    description = "Filter results based on operators and values applied to alphanumeric fields.")
@Generated(
    value = "org.openapitools.codegen.languages.SpringCodegen",
    date = "2024-09-18T10:46:59.161413591-07:00[America/Los_Angeles]",
    comments = "Generator version: 7.8.0")
@SuppressWarnings("PMD")
public class AlphanumericFilter {

  private String id;

  /** Defines how the value relates to the field `id`. */
  public enum OperatorEnum {
    EQUAL("="),

    LESS_THAN("<"),

    GREATER_THAN(">"),

    EXCLAMATION("!"),

    GREATER_THAN_OR_EQUAL_TO(">="),

    LESS_THAN_OR_EQUAL_TO("<=");

    private String value;

    OperatorEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OperatorEnum fromValue(String value) {
      for (OperatorEnum b : OperatorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private OperatorEnum operator = OperatorEnum.EQUAL;

  private String scope;

  private String value;

  public AlphanumericFilter() {
    super();
  }

  /** Constructor with only required parameters */
  public AlphanumericFilter(String id, OperatorEnum operator, String value) {
    this.id = id;
    this.operator = operator;
    this.value = value;
  }

  public AlphanumericFilter id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Field identfier to be queried.
   *
   * @return id
   */
  @NotNull
  @Schema(
      name = "id",
      example = "ageOfOnset",
      description = "Field identfier to be queried.",
      requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AlphanumericFilter operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }

  /**
   * Defines how the value relates to the field `id`.
   *
   * @return operator
   */
  @NotNull
  @Schema(
      name = "operator",
      example = ">",
      description = "Defines how the value relates to the field `id`.",
      requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("operator")
  public OperatorEnum getOperator() {
    return operator;
  }

  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }

  public AlphanumericFilter scope(String scope) {
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

  public AlphanumericFilter value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Alphanumeric search term to be used within the query which can contain wildcard characters (%)
   * to denote any number of unknown characters. Values can be assocatied with units if applicable.
   *
   * @return value
   */
  @NotNull
  @Schema(
      name = "value",
      example = "P70Y",
      description =
          "Alphanumeric search term to be used within the query which can contain wildcard characters (%) to denote any number of unknown characters.  Values can be assocatied with units if applicable.",
      requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlphanumericFilter alphanumericFilter = (AlphanumericFilter) o;
    return Objects.equals(this.id, alphanumericFilter.id)
        && Objects.equals(this.operator, alphanumericFilter.operator)
        && Objects.equals(this.scope, alphanumericFilter.scope)
        && Objects.equals(this.value, alphanumericFilter.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, operator, scope, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlphanumericFilter {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
