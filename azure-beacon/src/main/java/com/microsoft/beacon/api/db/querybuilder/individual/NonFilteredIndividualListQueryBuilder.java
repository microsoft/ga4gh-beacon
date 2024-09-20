package com.microsoft.beacon.api.db.querybuilder.individual;

import com.microsoft.beacon.api.db.querybuilder.QueryBuilder;
import com.microsoft.beacon.api.db.querybuilder.QueryContext;
import java.util.Objects;

public class NonFilteredIndividualListQueryBuilder implements QueryBuilder {
  private String QUERY =
      """
    select i.id, i.sex, i.dataset_id, i.ethnicity, i.url, ind_dis_summary.disease_id_sum, ind_dis_summary.disease_str_sum
    from
        individual i
        inner join
        (
            select i_d.individual_id, string_agg(d.id, ',') as disease_id_sum, string_agg(d.label, ',') as disease_str_sum
            from
                individual_disease i_d
                inner join disease d on d.id = i_d.disease_id
            group by i_d.individual_id
        ) as ind_dis_summary on i.id = ind_dis_summary.individual_id
    order by i.id asc limit :limit offset :offset
    """;

  private final QueryContext queryContext;

  public NonFilteredIndividualListQueryBuilder(QueryContext queryContext) {
    this.queryContext = Objects.requireNonNull(queryContext, "queryContext must be not null");
  }

  public String build() {
    return QUERY;
  }
}
