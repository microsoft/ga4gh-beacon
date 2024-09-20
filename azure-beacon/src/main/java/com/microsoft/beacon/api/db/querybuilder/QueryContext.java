package com.microsoft.beacon.api.db.querybuilder;

import java.util.Map;

public class QueryContext {
  private int limit;
  private int skip;
  private final Map<String, String> filters;

  public QueryContext(int limit, int skip, Map<String, String> filters) {
    this.limit = limit;
    this.skip = skip;
    this.filters = filters;
  }

  public int getLimit() {
    return limit;
  }

  public int getSkip() {
    return skip;
  }

  public Map<String, String> getFilters() {
    return filters;
  }
}
