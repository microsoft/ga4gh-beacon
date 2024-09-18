package com.microsoft.beacon.api.generated.model.dataset;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;

/**
 * Level of detail of the response: * `boolean`: returns true/false' responses * `count`: adds the
 * total number of positive results found * `record`: returns details for every row. In cases where
 * a Beacon prefers to return records with fewer than allattributes, different strategies have to be
 * considered w/o adding them to the current design, e.g.: - keeping non-mandatory attributes empty
 * - Beacon to provide a minimal record definition
 */
@Generated(
    value = "org.openapitools.codegen.languages.SpringCodegen",
    date = "2024-09-17T11:51:47.952858147-07:00[America/Los_Angeles]",
    comments = "Generator version: 7.8.0")
@SuppressWarnings("PMD")
public enum Granularity {
  BOOLEAN("boolean"),

  COUNT("count"),

  RECORD("record");

  private String value;

  Granularity(String value) {
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
  public static Granularity fromValue(String value) {
    for (Granularity b : Granularity.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
