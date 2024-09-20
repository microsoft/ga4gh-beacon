package com.microsoft.beacon.api.db.querybuilder.individual;

import com.microsoft.beacon.api.db.querybuilder.FilterKeys;
import com.microsoft.beacon.api.db.querybuilder.QueryBuilder;
import com.microsoft.beacon.api.db.querybuilder.QueryContext;
import java.util.Objects;
import org.springframework.util.StringUtils;

public class FilteredIndividualListQueryBuilder implements QueryBuilder {
  // :disease, :sex, :ethnicity are part of filter statement
  private static final String WHERE_CLAUSE = "where %s";
  private static final String SEX_WHERE_CLAUSE_FILTER = "i.sex = :sex";
  private static final String ETHNICITY_WHERE_CLAUSE_FILTER = "i.ethnicity like :ethnicity";
  private static final String DISEASE_WHERE_CLAUSE_FILTER =
      "(d.label like :disease) or (d.id like :disease)";

  private static final String QUERY =
      """
            select  i.id, i.sex, i.dataset_id, i.ethnicity, i.url, ind_dis_summary.disease_id_sum, ind_dis_summary.disease_str_sum
            from
                individual i
                inner join
                (
                    select i_d.individual_id, string_agg(d.id, ',') as disease_id_sum, string_agg(d.label, ',') as disease_str_sum
                    from
                        individual_disease i_d
                        inner join disease d on d.id = i_d.disease_id
                    %s /*where label like :disease*/
                    group by i_d.individual_id
                ) as ind_dis_summary on i.id = ind_dis_summary.individual_id
            %s /*where i.sex = :sex and i.ethnicity = :ethnicity*/
            order by i.id asc limit :limit offset :offset
            """;
  private final QueryContext queryContext;

  public FilteredIndividualListQueryBuilder(QueryContext queryContext) {
    this.queryContext = Objects.requireNonNull(queryContext, "queryContext must be not null");
  }

  @Override
  public String build() {
    String diseaseStatement = "";
    if (queryContext.getFilters().containsKey(FilterKeys.DISEASE_FILTER_KEY)) {
      diseaseStatement = WHERE_CLAUSE.formatted(DISEASE_WHERE_CLAUSE_FILTER);
    }
    String sexEthnicityStatement = "";
    if (queryContext.getFilters().containsKey(FilterKeys.SEX_FILTER_KEY)) {
      sexEthnicityStatement += SEX_WHERE_CLAUSE_FILTER;
    }
    if (queryContext.getFilters().containsKey(FilterKeys.ETHNICITY_FILTER_KEY)) {
      sexEthnicityStatement +=
          StringUtils.hasLength(sexEthnicityStatement)
              ? " and " + ETHNICITY_WHERE_CLAUSE_FILTER
              : ETHNICITY_WHERE_CLAUSE_FILTER;
    }
    if (StringUtils.hasLength(sexEthnicityStatement)) {
      sexEthnicityStatement = String.format(WHERE_CLAUSE, sexEthnicityStatement);
    }
    return QUERY.formatted(diseaseStatement, sexEthnicityStatement);
  }
}
