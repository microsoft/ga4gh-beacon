package com.microsoft.beacon.generated.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * Description of an ontology resource defined externally to this beacon implementation, such as
 * MeSH or EFO, based on the phenopackets resource object
 * (https://phenopacket-schema.readthedocs.io/en/latest/resource.html)
 */
@Schema(
    name = "Resource",
    description =
        "Description of an ontology resource defined externally to this beacon implementation, such as MeSH or EFO, based on the phenopackets resource object (https://phenopacket-schema.readthedocs.io/en/latest/resource.html)")
@Generated(
    value = "org.openapitools.codegen.languages.SpringCodegen",
    date = "2024-09-17T11:51:47.952858147-07:00[America/Los_Angeles]",
    comments = "Generator version: 7.8.0")
@SuppressWarnings("PMD")
public class Resource {

  private String id;

  private String iriPrefix;

  private String name;

  private String nameSpacePrefix;

  private String url;

  private String version;

  public Resource() {
    super();
  }

  /** Constructor with only required parameters */
  public Resource(String id) {
    this.id = id;
  }

  public Resource id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Preferably OBO ID representing the resource; alternatively a URI pointing towards the
   * definitions may be used if not in OBO.
   *
   * @return id
   */
  @NotNull
  @Schema(
      name = "id",
      description =
          "Preferably OBO ID representing the resource; alternatively a URI pointing towards the definitions may be used if not in OBO.",
      requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Resource iriPrefix(String iriPrefix) {
    this.iriPrefix = iriPrefix;
    return this;
  }

  /**
   * The full Internationalized Resource Identifier (IRI) prefix
   *
   * @return iriPrefix
   */
  @Schema(
      name = "iriPrefix",
      description = "The full Internationalized Resource Identifier (IRI) prefix",
      requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("iriPrefix")
  public String getIriPrefix() {
    return iriPrefix;
  }

  public void setIriPrefix(String iriPrefix) {
    this.iriPrefix = iriPrefix;
  }

  public Resource name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the ontology referred to by the id element
   *
   * @return name
   */
  @Schema(
      name = "name",
      description = "The name of the ontology referred to by the id element",
      requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Resource nameSpacePrefix(String nameSpacePrefix) {
    this.nameSpacePrefix = nameSpacePrefix;
    return this;
  }

  /**
   * The prefix used in the CURIE of an OntologyClass
   *
   * @return nameSpacePrefix
   */
  @Schema(
      name = "nameSpacePrefix",
      description = "The prefix used in the CURIE of an OntologyClass",
      requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nameSpacePrefix")
  public String getNameSpacePrefix() {
    return nameSpacePrefix;
  }

  public void setNameSpacePrefix(String nameSpacePrefix) {
    this.nameSpacePrefix = nameSpacePrefix;
  }

  public Resource url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Uniform Resource Locator of the resource
   *
   * @return url
   */
  @Schema(
      name = "url",
      description = "Uniform Resource Locator of the resource",
      requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Resource version(String version) {
    this.version = version;
    return this;
  }

  /**
   * The version of the resource or ontology used to make the annotation
   *
   * @return version
   */
  @Schema(
      name = "version",
      description = "The version of the resource or ontology used to make the annotation",
      requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Resource resource = (Resource) o;
    return Objects.equals(this.id, resource.id)
        && Objects.equals(this.iriPrefix, resource.iriPrefix)
        && Objects.equals(this.name, resource.name)
        && Objects.equals(this.nameSpacePrefix, resource.nameSpacePrefix)
        && Objects.equals(this.url, resource.url)
        && Objects.equals(this.version, resource.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, iriPrefix, name, nameSpacePrefix, url, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Resource {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    iriPrefix: ").append(toIndentedString(iriPrefix)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameSpacePrefix: ").append(toIndentedString(nameSpacePrefix)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
