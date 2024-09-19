package com.microsoft.beacon.api.generated.model.individual;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.Objects;

/** Boolean (true/false) response section. */
@Schema(
    name = "beaconBooleanResponseSection",
    description = "Boolean (true/false) response section.")
@JsonTypeName("beaconBooleanResponseSection")
@Generated(
    value = "org.openapitools.codegen.languages.SpringCodegen",
    date = "2024-09-18T10:46:59.161413591-07:00[America/Los_Angeles]",
    comments = "Generator version: 7.8.0")
@SuppressWarnings("PMD")
public class BeaconBooleanResponseSection {

  private Boolean exists;

  public BeaconBooleanResponseSection() {
    super();
  }

  /** Constructor with only required parameters */
  public BeaconBooleanResponseSection(Boolean exists) {
    this.exists = exists;
  }

  public BeaconBooleanResponseSection exists(Boolean exists) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeaconBooleanResponseSection beaconBooleanResponseSection = (BeaconBooleanResponseSection) o;
    return Objects.equals(this.exists, beaconBooleanResponseSection.exists);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exists);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeaconBooleanResponseSection {\n");
    sb.append("    exists: ").append(toIndentedString(exists)).append("\n");
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