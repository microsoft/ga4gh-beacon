package com.microsoft.beacon.generated.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/** Pagination to apply or that has been applied on the results. */
@Schema(
    name = "Pagination",
    description = "Pagination to apply or that has been applied on the results.")
@Generated(
    value = "org.openapitools.codegen.languages.SpringCodegen",
    date = "2024-09-17T11:51:47.952858147-07:00[America/Los_Angeles]",
    comments = "Generator version: 7.8.0")
public class Pagination {

  private String currentPage;

  private Integer limit = 10;

  private String nextPage;

  private String previousPage;

  private Integer skip = 0;

  public Pagination currentPage(String currentPage) {
    this.currentPage = currentPage;
    return this;
  }

  /**
   * A hash or similar that allows the server to retrieve a \"page\", e.g. (a subset of) a query
   * response.
   *
   * @return currentPage
   */
  @Schema(
      name = "currentPage",
      example = "ab0sc&fe1dd",
      description =
          "A hash or similar that allows the server to retrieve a \"page\", e.g. (a subset of) a query response.",
      requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currentPage")
  public String getCurrentPage() {
    return currentPage;
  }

  public void setCurrentPage(String currentPage) {
    this.currentPage = currentPage;
  }

  public Pagination limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Size of the page. Use `0` to return all the results or the maximum allowed by the Beacon, if
   * there is any. minimum: 0
   *
   * @return limit
   */
  @Min(0)
  @Schema(
      name = "limit",
      example = "10",
      description =
          "Size of the page. Use `0` to return all the results or the maximum allowed by the Beacon, if there is any.",
      requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("limit")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public Pagination nextPage(String nextPage) {
    this.nextPage = nextPage;
    return this;
  }

  /**
   * A hash or similar that allows the server to retrieve a \"page\", e.g. (a subset of) a query
   * response.
   *
   * @return nextPage
   */
  @Schema(
      name = "nextPage",
      example = "ab0sc&fe1dd",
      description =
          "A hash or similar that allows the server to retrieve a \"page\", e.g. (a subset of) a query response.",
      requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nextPage")
  public String getNextPage() {
    return nextPage;
  }

  public void setNextPage(String nextPage) {
    this.nextPage = nextPage;
  }

  public Pagination previousPage(String previousPage) {
    this.previousPage = previousPage;
    return this;
  }

  /**
   * A hash or similar that allows the server to retrieve a \"page\", e.g. (a subset of) a query
   * response.
   *
   * @return previousPage
   */
  @Schema(
      name = "previousPage",
      example = "ab0sc&fe1dd",
      description =
          "A hash or similar that allows the server to retrieve a \"page\", e.g. (a subset of) a query response.",
      requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("previousPage")
  public String getPreviousPage() {
    return previousPage;
  }

  public void setPreviousPage(String previousPage) {
    this.previousPage = previousPage;
  }

  public Pagination skip(Integer skip) {
    this.skip = skip;
    return this;
  }

  /**
   * * In the request: number of pages to skip * In the response: number of pages that has been
   * skipped minimum: 0
   *
   * @return skip
   */
  @Min(0)
  @Schema(
      name = "skip",
      example = "0",
      description =
          "* In the request: number of pages to skip * In the response: number of pages that has been skipped",
      requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("skip")
  public Integer getSkip() {
    return skip;
  }

  public void setSkip(Integer skip) {
    this.skip = skip;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pagination pagination = (Pagination) o;
    return Objects.equals(this.currentPage, pagination.currentPage)
        && Objects.equals(this.limit, pagination.limit)
        && Objects.equals(this.nextPage, pagination.nextPage)
        && Objects.equals(this.previousPage, pagination.previousPage)
        && Objects.equals(this.skip, pagination.skip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentPage, limit, nextPage, previousPage, skip);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pagination {\n");
    sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    nextPage: ").append(toIndentedString(nextPage)).append("\n");
    sb.append("    previousPage: ").append(toIndentedString(previousPage)).append("\n");
    sb.append("    skip: ").append(toIndentedString(skip)).append("\n");
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
