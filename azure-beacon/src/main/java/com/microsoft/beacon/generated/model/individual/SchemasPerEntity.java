package com.microsoft.beacon.generated.model.individual;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Objects;

/** Schema to be used for the requested entry type in the response. */
@Schema(
    name = "SchemasPerEntity",
    description = "Schema to be used for the requested entry type in the response.")
@Generated(
    value = "org.openapitools.codegen.languages.SpringCodegen",
    date = "2024-09-18T10:46:59.161413591-07:00[America/Los_Angeles]",
    comments = "Generator version: 7.8.0")
@SuppressWarnings("PMD")
public class SchemasPerEntity {

  private String entityType;

  private String schema;

  public SchemasPerEntity entityType(String entityType) {
    this.entityType = entityType;
    return this;
  }

  /**
   * Get entityType
   *
   * @return entityType
   */
  @Schema(
      name = "entityType",
      example = "Individual",
      requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("entityType")
  public String getEntityType() {
    return entityType;
  }

  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }

  public SchemasPerEntity schema(String schema) {
    this.schema = schema;
    return this;
  }

  /**
   * Get schema
   *
   * @return schema
   */
  @Schema(name = "schema", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("schema")
  public String getSchema() {
    return schema;
  }

  public void setSchema(String schema) {
    this.schema = schema;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchemasPerEntity schemasPerEntity = (SchemasPerEntity) o;
    return Objects.equals(this.entityType, schemasPerEntity.entityType)
        && Objects.equals(this.schema, schemasPerEntity.schema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityType, schema);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchemasPerEntity {\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
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
