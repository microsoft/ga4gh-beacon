package com.microsoft.beacon.generated.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/** Payload definition for the \&quot;count\&quot; response. */
@Schema(
    name = "beaconCountResponseSection",
    description = "Payload definition for the \"count\" response.")
@JsonTypeName("beaconCountResponseSection")
@Generated(
    value = "org.openapitools.codegen.languages.SpringCodegen",
    date = "2024-09-18T10:46:59.161413591-07:00[America/Los_Angeles]",
    comments = "Generator version: 7.8.0")
@SuppressWarnings("PMD")
public class BeaconCountResponseSection {

  private Boolean exists;

  private Integer numTotalResults;

  public BeaconCountResponseSection() {
    super();
  }

  /** Constructor with only required parameters */
  public BeaconCountResponseSection(Boolean exists, Integer numTotalResults) {
    this.exists = exists;
    this.numTotalResults = numTotalResults;
  }

  public BeaconCountResponseSection exists(Boolean exists) {
    this.exists = exists;
    return this;
  }

  /**
   * Indicator of whether any record was observed in any of the collections queried. This should be
   * non-null.
   *
   * @return exists
   */
  @NotNull
  @Schema(
      name = "exists",
      description =
          "Indicator of whether any record was observed in any of the collections queried. This should be non-null.",
      requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("exists")
  public Boolean getExists() {
    return exists;
  }

  public void setExists(Boolean exists) {
    this.exists = exists;
  }

  public BeaconCountResponseSection numTotalResults(Integer numTotalResults) {
    this.numTotalResults = numTotalResults;
    return this;
  }

  /**
   * Total number of results. NOT the number of results returned in this batch (after pagination)
   * but the total obtained by the query. minimum: 0
   *
   * @return numTotalResults
   */
  @NotNull
  @Min(0)
  @Schema(
      name = "numTotalResults",
      description =
          "Total number of results. NOT the number of results returned in this batch (after pagination) but the total obtained by the query.",
      requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("numTotalResults")
  public Integer getNumTotalResults() {
    return numTotalResults;
  }

  public void setNumTotalResults(Integer numTotalResults) {
    this.numTotalResults = numTotalResults;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeaconCountResponseSection beaconCountResponseSection = (BeaconCountResponseSection) o;
    return Objects.equals(this.exists, beaconCountResponseSection.exists)
        && Objects.equals(this.numTotalResults, beaconCountResponseSection.numTotalResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exists, numTotalResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeaconCountResponseSection {\n");
    sb.append("    exists: ").append(toIndentedString(exists)).append("\n");
    sb.append("    numTotalResults: ").append(toIndentedString(numTotalResults)).append("\n");
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
