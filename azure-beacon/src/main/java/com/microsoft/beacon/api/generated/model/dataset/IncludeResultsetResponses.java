package com.microsoft.beacon.generated.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;

/**
 * Indicator of whether responses from every Resultset should be included in the response to this
 * request or just the ones with positive, negative results or no details at all. If null (not
 * specified), the default value of 'HIT' is assumed. This parameter allows for returning
 * boolean/counting results although the Beacon instance is capable to return record level details.
 */
@Generated(
    value = "org.openapitools.codegen.languages.SpringCodegen",
    date = "2024-09-17T11:51:47.952858147-07:00[America/Los_Angeles]",
    comments = "Generator version: 7.8.0")
public enum IncludeResultsetResponses {
  ALL("ALL"),

  HIT("HIT"),

  MISS("MISS"),

  NONE("NONE");

  private String value;

  IncludeResultsetResponses(String value) {
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
  public static IncludeResultsetResponses fromValue(String value) {
    for (IncludeResultsetResponses b : IncludeResultsetResponses.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
