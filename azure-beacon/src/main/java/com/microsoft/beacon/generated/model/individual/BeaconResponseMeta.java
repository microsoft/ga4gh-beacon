package com.microsoft.beacon.generated.model.individual;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Information about the response that could be relevant for the Beacon client in order to interpret
 * the results.
 */
@Schema(
    name = "beaconResponseMeta",
    description =
        "Information about the response that could be relevant for the Beacon client in order to interpret the results.")
@JsonTypeName("beaconResponseMeta")
@Generated(
    value = "org.openapitools.codegen.languages.SpringCodegen",
    date = "2024-09-18T10:46:59.161413591-07:00[America/Los_Angeles]",
    comments = "Generator version: 7.8.0")
@SuppressWarnings("PMD")
public class BeaconResponseMeta {

  private String apiVersion;

  private String beaconId;

  private BeaconReceivedRequestSummary receivedRequestSummary;

  private Granularity returnedGranularity = Granularity.BOOLEAN;

  @Valid private List<@Valid SchemasPerEntity> returnedSchemas = new ArrayList<>();

  private Boolean testMode = false;

  public BeaconResponseMeta() {
    super();
  }

  /** Constructor with only required parameters */
  public BeaconResponseMeta(
      String apiVersion,
      String beaconId,
      BeaconReceivedRequestSummary receivedRequestSummary,
      Granularity returnedGranularity,
      List<@Valid SchemasPerEntity> returnedSchemas) {
    this.apiVersion = apiVersion;
    this.beaconId = beaconId;
    this.receivedRequestSummary = receivedRequestSummary;
    this.returnedGranularity = returnedGranularity;
    this.returnedSchemas = returnedSchemas;
  }

  public BeaconResponseMeta apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * Version of API, e.g. in request or response. Beacon uses a Github-style, \"v\"-prefixed
   * semantic versioning format.
   *
   * @return apiVersion
   */
  @NotNull
  @Schema(
      name = "apiVersion",
      description =
          "Version of API, e.g. in request or response. Beacon uses a Github-style, \"v\"-prefixed semantic versioning format.",
      requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("apiVersion")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public BeaconResponseMeta beaconId(String beaconId) {
    this.beaconId = beaconId;
    return this;
  }

  /**
   * The Id of a Beacon. Usually a reversed domain string, but any URI is acceptable. The purpose of
   * this attribute is, in the context of a Beacon network, to disambiguate responses coming from
   * different Beacons.
   *
   * @return beaconId
   */
  @NotNull
  @Schema(
      name = "beaconId",
      description =
          "The Id of a Beacon. Usually a reversed domain string, but any URI is acceptable. The purpose of this attribute is, in the context of a Beacon network, to disambiguate responses coming from different Beacons.",
      requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("beaconId")
  public String getBeaconId() {
    return beaconId;
  }

  public void setBeaconId(String beaconId) {
    this.beaconId = beaconId;
  }

  public BeaconResponseMeta receivedRequestSummary(
      BeaconReceivedRequestSummary receivedRequestSummary) {
    this.receivedRequestSummary = receivedRequestSummary;
    return this;
  }

  /**
   * Get receivedRequestSummary
   *
   * @return receivedRequestSummary
   */
  @NotNull
  @Valid
  @Schema(name = "receivedRequestSummary", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("receivedRequestSummary")
  public BeaconReceivedRequestSummary getReceivedRequestSummary() {
    return receivedRequestSummary;
  }

  public void setReceivedRequestSummary(BeaconReceivedRequestSummary receivedRequestSummary) {
    this.receivedRequestSummary = receivedRequestSummary;
  }

  public BeaconResponseMeta returnedGranularity(Granularity returnedGranularity) {
    this.returnedGranularity = returnedGranularity;
    return this;
  }

  /**
   * Get returnedGranularity
   *
   * @return returnedGranularity
   */
  @NotNull
  @Valid
  @Schema(name = "returnedGranularity", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("returnedGranularity")
  public Granularity getReturnedGranularity() {
    return returnedGranularity;
  }

  public void setReturnedGranularity(Granularity returnedGranularity) {
    this.returnedGranularity = returnedGranularity;
  }

  public BeaconResponseMeta returnedSchemas(List<@Valid SchemasPerEntity> returnedSchemas) {
    this.returnedSchemas = returnedSchemas;
    return this;
  }

  public BeaconResponseMeta addReturnedSchemasItem(SchemasPerEntity returnedSchemasItem) {
    if (this.returnedSchemas == null) {
      this.returnedSchemas = new ArrayList<>();
    }
    this.returnedSchemas.add(returnedSchemasItem);
    return this;
  }

  /**
   * Set of schemas to be used in the response to a request.
   *
   * @return returnedSchemas
   */
  @NotNull
  @Valid
  @Schema(
      name = "returnedSchemas",
      description = "Set of schemas to be used in the response to a request.",
      requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("returnedSchemas")
  public List<@Valid SchemasPerEntity> getReturnedSchemas() {
    return returnedSchemas;
  }

  public void setReturnedSchemas(List<@Valid SchemasPerEntity> returnedSchemas) {
    this.returnedSchemas = returnedSchemas;
  }

  public BeaconResponseMeta testMode(Boolean testMode) {
    this.testMode = testMode;
    return this;
  }

  /**
   * Used for indicating that a request or response is done in a test context e.g. for compliance
   * testing i.e. to evaluate the acceptance/understanding of a request and the structure of the
   * returned response by the Beacon instance. A TRUE `testMode` parameter DOES NOT require that the
   * Beacon instance is a test instance, but that this specific request-response cycle is a testing
   * one. When `true` the Beacon instance MUST respond the request but it SHOULD use virtual or
   * non-sensitive data. Here, what is being evaluated is the acceptance/understanding of a request
   * and the structure of the returned response by the Beacon instance.
   *
   * @return testMode
   */
  @Schema(
      name = "testMode",
      description =
          "Used for indicating that a request or response is done in a test context e.g. for compliance testing i.e. to evaluate the acceptance/understanding of a request and the structure of the returned response by the Beacon instance. A TRUE `testMode` parameter DOES NOT require that the Beacon instance is a test instance, but that this specific request-response cycle is a testing one. When `true` the Beacon instance MUST respond the request but it SHOULD use virtual or non-sensitive data. Here, what is being evaluated is the acceptance/understanding of a request and the structure of the returned response by the Beacon instance.",
      requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("testMode")
  public Boolean getTestMode() {
    return testMode;
  }

  public void setTestMode(Boolean testMode) {
    this.testMode = testMode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeaconResponseMeta beaconResponseMeta = (BeaconResponseMeta) o;
    return Objects.equals(this.apiVersion, beaconResponseMeta.apiVersion)
        && Objects.equals(this.beaconId, beaconResponseMeta.beaconId)
        && Objects.equals(this.receivedRequestSummary, beaconResponseMeta.receivedRequestSummary)
        && Objects.equals(this.returnedGranularity, beaconResponseMeta.returnedGranularity)
        && Objects.equals(this.returnedSchemas, beaconResponseMeta.returnedSchemas)
        && Objects.equals(this.testMode, beaconResponseMeta.testMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        apiVersion,
        beaconId,
        receivedRequestSummary,
        returnedGranularity,
        returnedSchemas,
        testMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeaconResponseMeta {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    beaconId: ").append(toIndentedString(beaconId)).append("\n");
    sb.append("    receivedRequestSummary: ")
        .append(toIndentedString(receivedRequestSummary))
        .append("\n");
    sb.append("    returnedGranularity: ")
        .append(toIndentedString(returnedGranularity))
        .append("\n");
    sb.append("    returnedSchemas: ").append(toIndentedString(returnedSchemas)).append("\n");
    sb.append("    testMode: ").append(toIndentedString(testMode)).append("\n");
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
