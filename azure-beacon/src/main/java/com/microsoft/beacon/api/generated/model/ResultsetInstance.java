package com.microsoft.beacon.generated.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** ResultsetInstance */
@Generated(
    value = "org.openapitools.codegen.languages.SpringCodegen",
    date = "2024-09-17T11:51:47.952858147-07:00[America/Los_Angeles]",
    comments = "Generator version: 7.8.0")
public class ResultsetInstance {

  private Boolean exists;

  private String id;

  private Object info;

  @Valid private List<Object> results = new ArrayList<>();

  private Integer resultsCount;

  @Valid private List<@Valid Handover> resultsHandovers = new ArrayList<>();

  private String setType = "dataset";

  public ResultsetInstance() {
    super();
  }

  /** Constructor with only required parameters */
  public ResultsetInstance(
      Boolean exists, String id, List<Object> results, Integer resultsCount, String setType) {
    this.exists = exists;
    this.id = id;
    this.results = results;
    this.resultsCount = resultsCount;
    this.setType = setType;
  }

  public ResultsetInstance exists(Boolean exists) {
    this.exists = exists;
    return this;
  }

  /**
   * Get exists
   *
   * @return exists
   */
  @NotNull
  @Schema(name = "exists", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("exists")
  public Boolean getExists() {
    return exists;
  }

  public void setExists(Boolean exists) {
    this.exists = exists;
  }

  public ResultsetInstance id(String id) {
    this.id = id;
    return this;
  }

  /**
   * id of the resultset
   *
   * @return id
   */
  @NotNull
  @Schema(
      name = "id",
      example = "datasetA",
      description = "id of the resultset",
      requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ResultsetInstance info(Object info) {
    this.info = info;
    return this;
  }

  /**
   * Additional details that could be of interest about the Resultset. Provided to clearly enclose
   * any attribute that is not part of the Beacon specification.
   *
   * @return info
   */
  @Schema(
      name = "info",
      description =
          "Additional details that could be of interest about the Resultset. Provided to clearly enclose any attribute that is not part of the Beacon specification.",
      requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("info")
  public Object getInfo() {
    return info;
  }

  public void setInfo(Object info) {
    this.info = info;
  }

  public ResultsetInstance results(List<Object> results) {
    this.results = results;
    return this;
  }

  public ResultsetInstance addResultsItem(Object resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

  /**
   * Get results
   *
   * @return results
   */
  @NotNull
  @Size(min = 0)
  @Schema(name = "results", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("results")
  public List<Object> getResults() {
    return results;
  }

  public void setResults(List<Object> results) {
    this.results = results;
  }

  public ResultsetInstance resultsCount(Integer resultsCount) {
    this.resultsCount = resultsCount;
    return this;
  }

  /**
   * Number of results in this Resultset.
   *
   * @return resultsCount
   */
  @NotNull
  @Schema(
      name = "resultsCount",
      description = "Number of results in this Resultset.",
      requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("resultsCount")
  public Integer getResultsCount() {
    return resultsCount;
  }

  public void setResultsCount(Integer resultsCount) {
    this.resultsCount = resultsCount;
  }

  public ResultsetInstance resultsHandovers(List<@Valid Handover> resultsHandovers) {
    this.resultsHandovers = resultsHandovers;
    return this;
  }

  public ResultsetInstance addResultsHandoversItem(Handover resultsHandoversItem) {
    if (this.resultsHandovers == null) {
      this.resultsHandovers = new ArrayList<>();
    }
    this.resultsHandovers.add(resultsHandoversItem);
    return this;
  }

  /**
   * Set of handovers to be added in one section the response.
   *
   * @return resultsHandovers
   */
  @Valid
  @Schema(
      name = "resultsHandovers",
      description = "Set of handovers to be added in one section the response.",
      requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resultsHandovers")
  public List<@Valid Handover> getResultsHandovers() {
    return resultsHandovers;
  }

  public void setResultsHandovers(List<@Valid Handover> resultsHandovers) {
    this.resultsHandovers = resultsHandovers;
  }

  public ResultsetInstance setType(String setType) {
    this.setType = setType;
    return this;
  }

  /**
   * Entry type of resultSet. It SHOULD MATCH an entry type declared as collection in the Beacon
   * configuration.
   *
   * @return setType
   */
  @NotNull
  @Schema(
      name = "setType",
      description =
          "Entry type of resultSet. It SHOULD MATCH an entry type declared as collection in the Beacon configuration.",
      requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("setType")
  public String getSetType() {
    return setType;
  }

  public void setSetType(String setType) {
    this.setType = setType;
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
  public ResultsetInstance putAdditionalProperty(String key, Object value) {
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
    ResultsetInstance resultsetInstance = (ResultsetInstance) o;
    return Objects.equals(this.exists, resultsetInstance.exists)
        && Objects.equals(this.id, resultsetInstance.id)
        && Objects.equals(this.info, resultsetInstance.info)
        && Objects.equals(this.results, resultsetInstance.results)
        && Objects.equals(this.resultsCount, resultsetInstance.resultsCount)
        && Objects.equals(this.resultsHandovers, resultsetInstance.resultsHandovers)
        && Objects.equals(this.setType, resultsetInstance.setType)
        && Objects.equals(this.additionalProperties, resultsetInstance.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        exists, id, info, results, resultsCount, resultsHandovers, setType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultsetInstance {\n");
    sb.append("    exists: ").append(toIndentedString(exists)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    resultsCount: ").append(toIndentedString(resultsCount)).append("\n");
    sb.append("    resultsHandovers: ").append(toIndentedString(resultsHandovers)).append("\n");
    sb.append("    setType: ").append(toIndentedString(setType)).append("\n");

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
