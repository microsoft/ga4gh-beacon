package com.microsoft.beacon.api.db;

import com.microsoft.beacon.api.db.model.Individual;
import com.microsoft.beacon.api.db.model.IndividualExtended;
import com.microsoft.beacon.api.db.querybuilder.FilterKeys;
import com.microsoft.beacon.api.db.querybuilder.QueryContext;
import com.microsoft.beacon.api.db.querybuilder.individual.IndividualQueryBuilderFactory;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@Slf4j
public class IndividualDao {
  // keep this here for simplicity
  private String SELECT_INDIVIDUAL_QUERY = "select * from individual where id = :id";

  private static final RowMapper<Individual> nonFilteredIndividualRowMapper =
      (rs, num) ->
          new Individual(
              rs.getString("id"),
              rs.getString("sex"),
              rs.getInt("dataset_id"),
              rs.getString("ethnicity"),
              rs.getString("url"));

  private static final RowMapper<IndividualExtended> filteredIndividualRowMapper =
      (rs, num) ->
          new IndividualExtended(
              rs.getString("id"),
              rs.getString("sex"),
              rs.getInt("dataset_id"),
              rs.getString("ethnicity"),
              rs.getString("url"),
              rs.getString("disease_id_sum"),
              rs.getString("disease_str_sum"));

  private final NamedParameterJdbcTemplate jdbcTemplate;

  public IndividualDao(NamedParameterJdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  public Optional<Individual> getIndividual(String id) {
    try {
      Individual result =
          jdbcTemplate.queryForObject(
              SELECT_INDIVIDUAL_QUERY, Map.of("id", id), nonFilteredIndividualRowMapper);
      return Optional.ofNullable(result);
    } catch (DataAccessException e) {
      log.error("Error getting individual data with id={}. Error: {}", id, e.getMessage());
      throw e;
    }
  }

  public List<IndividualExtended> listIndividuals(
      int skip, int limit, Map<String, String> filters) {
    List<IndividualExtended> result = Collections.emptyList();
    try {
      var queryContext = new QueryContext(limit, skip, filters);
      String queryString = IndividualQueryBuilderFactory.create(queryContext).build();
      var mapSqlParameterSource = new MapSqlParameterSource();
      mapSqlParameterSource.addValue("limit", limit);
      mapSqlParameterSource.addValue("offset", skip);
      if (!filters.isEmpty()) {
        for (Map.Entry<String, String> kvp : filters.entrySet()) {
          if (kvp.getKey().equals(FilterKeys.ETHNICITY_FILTER_KEY)
              || kvp.getKey().equals(FilterKeys.DISEASE_FILTER_KEY)) {
            mapSqlParameterSource.addValue(kvp.getKey(), "%" + kvp.getValue() + "%");
          } else {
            mapSqlParameterSource.addValue(kvp.getKey(), kvp.getValue());
          }
        }
      }
      result = jdbcTemplate.query(queryString, mapSqlParameterSource, filteredIndividualRowMapper);
    } catch (DataAccessException e) {
      log.error("Error getting list of individual data. Error: {}", e.getMessage());
    }
    return result;
  }
}
