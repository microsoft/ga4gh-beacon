package com.microsoft.beacon.api.db.querybuilder.individual;

import com.microsoft.beacon.api.db.querybuilder.QueryBuilder;
import com.microsoft.beacon.api.db.querybuilder.QueryContext;
import java.util.Objects;

public class NonFilteredIndividualListQueryBuilder implements QueryBuilder {
  private String QUERY = "select * from individual order by id limit :limit offset :offset";

  private final QueryContext queryContext;

  public NonFilteredIndividualListQueryBuilder(QueryContext queryContext) {
    this.queryContext = Objects.requireNonNull(queryContext, "queryContext must be not null");
  }

  public String build() {
    return QUERY;
  }
}
