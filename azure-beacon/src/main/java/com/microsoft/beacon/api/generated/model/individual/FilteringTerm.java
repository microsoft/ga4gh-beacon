package com.microsoft.beacon.api.generated.model.individual;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.Objects;

/** FilteringTerm */
@Generated(
    value = "org.openapitools.codegen.languages.SpringCodegen",
    date = "2024-09-18T10:46:59.161413591-07:00[America/Los_Angeles]",
    comments = "Generator version: 7.8.0")
@SuppressWarnings("PMD")
public class FilteringTerm {

  private String id;

  private Boolean includeDescendantTerms = true;

  private String scope;

  /**
   * Allow the Beacon to return results which do not match the filter exactly, but do match to a
   * certain degree of similarity. The Beacon defines the semantic similarity model implemented and
   * how to apply the thresholds of 'high', 'medium' and 'low' similarity.
   */
  public enum SimilarityEnum {
    EXACT("exact"),

    HIGH("high"),

    MEDIUM("medium"),

    LOW("low");

    private String value;

    SimilarityEnum(String value) {
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
    public static SimilarityEnum fromValue(String value) {
      for (SimilarityEnum b : SimilarityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private SimilarityEnum similarity = SimilarityEnum.EXACT;

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

  private String value;

  public FilteringTerm() {
    super();
  }

  /** Constructor with only required parameters */
  public FilteringTerm(String id, OperatorEnum operator, String value) {
    this.id = id;
    this.operator = operator;
    this.value = value;
  }

  public FilteringTerm id(String id) {
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

  public FilteringTerm includeDescendantTerms(Boolean includeDescendantTerms) {
    this.includeDescendantTerms = includeDescendantTerms;
    return this;
  }

  /**
   * Define if the Beacon should implement the ontology hierarchy, thus query the descendant terms
   * of `id`.
   *
   * @return includeDescendantTerms
   */
  @Schema(
      name = "includeDescendantTerms",
      description =
          "Define if the Beacon should implement the ontology hierarchy, thus query the descendant terms of `id`.",
      requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("includeDescendantTerms")
  public Boolean getIncludeDescendantTerms() {
    return includeDescendantTerms;
  }

  public void setIncludeDescendantTerms(Boolean includeDescendantTerms) {
    this.includeDescendantTerms = includeDescendantTerms;
  }

  public FilteringTerm scope(String scope) {
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

  public FilteringTerm similarity(SimilarityEnum similarity) {
    this.similarity = similarity;
    return this;
  }

  /**
   * Allow the Beacon to return results which do not match the filter exactly, but do match to a
   * certain degree of similarity. The Beacon defines the semantic similarity model implemented and
   * how to apply the thresholds of 'high', 'medium' and 'low' similarity.
   *
   * @return similarity
   */
  @Schema(
      name = "similarity",
      description =
          "Allow the Beacon to return results which do not match the filter exactly, but do match to a certain degree of similarity. The Beacon defines the semantic similarity model implemented and how to apply the thresholds of 'high', 'medium' and 'low' similarity.",
      requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("similarity")
  public SimilarityEnum getSimilarity() {
    return similarity;
  }

  public void setSimilarity(SimilarityEnum similarity) {
    this.similarity = similarity;
  }

  public FilteringTerm operator(OperatorEnum operator) {
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

  public FilteringTerm value(String value) {
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
    FilteringTerm filteringTerm = (FilteringTerm) o;
    return Objects.equals(this.id, filteringTerm.id)
        && Objects.equals(this.includeDescendantTerms, filteringTerm.includeDescendantTerms)
        && Objects.equals(this.scope, filteringTerm.scope)
        && Objects.equals(this.similarity, filteringTerm.similarity)
        && Objects.equals(this.operator, filteringTerm.operator)
        && Objects.equals(this.value, filteringTerm.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, includeDescendantTerms, scope, similarity, operator, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilteringTerm {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    includeDescendantTerms: ")
        .append(toIndentedString(includeDescendantTerms))
        .append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    similarity: ").append(toIndentedString(similarity)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
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
