package com.microsoft.beacon.generated.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/** Filter results to include records that contain a specific ontology term. */
@Schema(
    name = "OntologyFilter",
    description = "Filter results to include records that contain a specific ontology term.")
@Generated(
    value = "org.openapitools.codegen.languages.SpringCodegen",
    date = "2024-09-17T11:51:47.952858147-07:00[America/Los_Angeles]",
    comments = "Generator version: 7.8.0")
@SuppressWarnings("PMD")
public class OntologyFilter {

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

  public OntologyFilter() {
    super();
  }

  /** Constructor with only required parameters */
  public OntologyFilter(String id) {
    this.id = id;
  }

  public OntologyFilter id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Term ID to be queried, using CURIE syntax where possible.
   *
   * @return id
   */
  @NotNull
  @Schema(
      name = "id",
      example = "HP:0002664",
      description = "Term ID to be queried, using CURIE syntax where possible.",
      requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OntologyFilter includeDescendantTerms(Boolean includeDescendantTerms) {
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

  public OntologyFilter scope(String scope) {
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
      example = "biosamples",
      description = "The entry type to which the filter applies",
      requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scope")
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public OntologyFilter similarity(SimilarityEnum similarity) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OntologyFilter ontologyFilter = (OntologyFilter) o;
    return Objects.equals(this.id, ontologyFilter.id)
        && Objects.equals(this.includeDescendantTerms, ontologyFilter.includeDescendantTerms)
        && Objects.equals(this.scope, ontologyFilter.scope)
        && Objects.equals(this.similarity, ontologyFilter.similarity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, includeDescendantTerms, scope, similarity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OntologyFilter {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    includeDescendantTerms: ")
        .append(toIndentedString(includeDescendantTerms))
        .append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    similarity: ").append(toIndentedString(similarity)).append("\n");
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
