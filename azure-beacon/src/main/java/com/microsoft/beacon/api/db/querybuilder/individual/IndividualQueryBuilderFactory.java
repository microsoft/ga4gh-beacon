package com.microsoft.beacon.api.db.querybuilder.individual;

import com.microsoft.beacon.api.db.querybuilder.QueryBuilder;
import com.microsoft.beacon.api.db.querybuilder.QueryContext;

public class IndividualQueryBuilderFactory {
  public static QueryBuilder create(QueryContext queryContext) {
    return queryContext.getFilters().isEmpty()
        ? new NonFilteredIndividualListQueryBuilder(queryContext)
        : new FilteredIndividualListQueryBuilder(queryContext);
  }
}
