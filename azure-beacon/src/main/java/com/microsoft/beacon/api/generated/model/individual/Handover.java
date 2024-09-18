package com.microsoft.beacon.api.generated.model.individual;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.util.Objects;

/**
 * A handover is a typed link for attaching actionable links to results, non purely informational,
 * requests. The goal of the handovers is to list the different actions available, e.g.: * a link to
 * a request access page * linking to a file for download, e.g. a VCF file Another common scenario
 * is to provide a fast summary response (e.g. BeconCountResponse) and to provide access to
 * different endpoints for the entities matched by the query using temporary access tokens in the
 * handover URLs.
 */
@Schema(
    name = "Handover",
    description =
        "A handover is a typed link for attaching actionable links to results, non purely informational, requests. The goal of the handovers is to list the different actions available, e.g.: * a link to a request access page * linking to a file for download, e.g. a VCF file Another common scenario is to provide a fast summary response (e.g. BeconCountResponse) and to provide access to different endpoints for the entities matched by the query using temporary access tokens in the handover URLs.")
@Generated(
    value = "org.openapitools.codegen.languages.SpringCodegen",
    date = "2024-09-18T10:46:59.161413591-07:00[America/Los_Angeles]",
    comments = "Generator version: 7.8.0")
@SuppressWarnings("PMD")
public class Handover {

  private OntologyTerm handoverType;

  private String note;

  private URI url;

  public Handover() {
    super();
  }

  /** Constructor with only required parameters */
  public Handover(OntologyTerm handoverType, URI url) {
    this.handoverType = handoverType;
    this.url = url;
  }

  public Handover handoverType(OntologyTerm handoverType) {
    this.handoverType = handoverType;
    return this;
  }

  /**
   * Get handoverType
   *
   * @return handoverType
   */
  @NotNull
  @Valid
  @Schema(name = "handoverType", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("handoverType")
  public OntologyTerm getHandoverType() {
    return handoverType;
  }

  public void setHandoverType(OntologyTerm handoverType) {
    this.handoverType = handoverType;
  }

  public Handover note(String note) {
    this.note = note;
    return this;
  }

  /**
   * An optional text including considerations on the handover link provided.
   *
   * @return note
   */
  @Schema(
      name = "note",
      example = "This handover link provides access to a summarized VCF.",
      description = "An optional text including considerations on the handover link provided.",
      requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("note")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public Handover url(URI url) {
    this.url = url;
    return this;
  }

  /**
   * URL endpoint to where the handover process could progress, in RFC3986 format
   *
   * @return url
   */
  @NotNull
  @Valid
  @Schema(
      name = "url",
      example = "https://api.mygenomeservice.org/Handover/9dcc48d7-fc88-11e8-9110-b0c592dbf8c0/",
      description = "URL endpoint to where the handover process could progress, in RFC3986 format",
      requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("url")
  public URI getUrl() {
    return url;
  }

  public void setUrl(URI url) {
    this.url = url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Handover handover = (Handover) o;
    return Objects.equals(this.handoverType, handover.handoverType)
        && Objects.equals(this.note, handover.note)
        && Objects.equals(this.url, handover.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(handoverType, note, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Handover {\n");
    sb.append("    handoverType: ").append(toIndentedString(handoverType)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
