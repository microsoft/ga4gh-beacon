package com.microsoft.beacon.generated.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
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

/** Filtering terms and ontology resources utilised in this Beacon. */
@Schema(
    name = "beaconFilteringTermsResults",
    description = "Filtering terms and ontology resources utilised in this Beacon.")
@JsonTypeName("beaconFilteringTermsResults")
@Generated(
    value = "org.openapitools.codegen.languages.SpringCodegen",
    date = "2024-09-18T10:46:59.161413591-07:00[America/Los_Angeles]",
    comments = "Generator version: 7.8.0")
@SuppressWarnings("PMD")
public class BeaconFilteringTermsResults {

  @Valid private List<@Valid FilteringTerm1> filteringTerms = new ArrayList<>();

  @Valid private List<@Valid Resource> resources = new ArrayList<>();

  public BeaconFilteringTermsResults filteringTerms(List<@Valid FilteringTerm1> filteringTerms) {
    this.filteringTerms = filteringTerms;
    return this;
  }

  public BeaconFilteringTermsResults addFilteringTermsItem(FilteringTerm1 filteringTermsItem) {
    if (this.filteringTerms == null) {
      this.filteringTerms = new ArrayList<>();
    }
    this.filteringTerms.add(filteringTermsItem);
    return this;
  }

  /**
   * Get filteringTerms
   *
   * @return filteringTerms
   */
  @Valid
  @Schema(name = "filteringTerms", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filteringTerms")
  public List<@Valid FilteringTerm1> getFilteringTerms() {
    return filteringTerms;
  }

  public void setFilteringTerms(List<@Valid FilteringTerm1> filteringTerms) {
    this.filteringTerms = filteringTerms;
  }

  public BeaconFilteringTermsResults resources(List<@Valid Resource> resources) {
    this.resources = resources;
    return this;
  }

  public BeaconFilteringTermsResults addResourcesItem(Resource resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

  /**
   * Get resources
   *
   * @return resources
   */
  @Valid
  @Schema(name = "resources", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resources")
  public List<@Valid Resource> getResources() {
    return resources;
  }

  public void setResources(List<@Valid Resource> resources) {
    this.resources = resources;
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
  public BeaconFilteringTermsResults putAdditionalProperty(String key, Object value) {
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
    BeaconFilteringTermsResults beaconFilteringTermsResults = (BeaconFilteringTermsResults) o;
    return Objects.equals(this.filteringTerms, beaconFilteringTermsResults.filteringTerms)
        && Objects.equals(this.resources, beaconFilteringTermsResults.resources)
        && Objects.equals(
            this.additionalProperties, beaconFilteringTermsResults.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filteringTerms, resources, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeaconFilteringTermsResults {\n");
    sb.append("    filteringTerms: ").append(toIndentedString(filteringTerms)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");

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
