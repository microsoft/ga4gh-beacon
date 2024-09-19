package com.microsoft.beacon.api.db;

import com.microsoft.beacon.api.db.model.Individual;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@Slf4j
public class IndividualDao {
  // define default in case paging parameters are available
  private static final int LIST_INDIVIDUALS_LIMIT = 25;
  private static final int LIST_INDIVIDUALS_SKIP = 0;

  private String SELECT_INDIVIDUAL_QUERY = "select * from individual where id = :id";
  // no paging at this time.
  private String LIST_INDIVIDUALS_QUERY =
      "select * from individual order by id limit :limit offset :offset";

  private static final RowMapper<Individual> individualRowMapper =
      (rs, num) ->
          new Individual(
              rs.getString("id"),
              rs.getString("sex"),
              rs.getInt("dataset_id"),
              rs.getString("ethnicity"),
              rs.getString("url"));

  private final NamedParameterJdbcTemplate jdbcTemplate;

  public IndividualDao(NamedParameterJdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  public Optional<Individual> getIndividual(String id) {
    try {
      Individual result =
          jdbcTemplate.queryForObject(
              SELECT_INDIVIDUAL_QUERY, Map.of("id", id), individualRowMapper);
      return Optional.ofNullable(result);
    } catch (DataAccessException e) {
      log.error("Error getting individual data with id={}. Error: {}", id, e.getMessage());
      throw e;
    }
  }

  public List<Individual> listIndividuals(Optional<Integer> skip, Optional<Integer> limit) {
    List<Individual> result = Collections.emptyList();
    try {
      result =
          jdbcTemplate.query(
              LIST_INDIVIDUALS_QUERY,
              Map.of(
                  "limit",
                  limit.orElse(LIST_INDIVIDUALS_LIMIT),
                  "offset",
                  skip.orElse(LIST_INDIVIDUALS_SKIP)),
              individualRowMapper);
    } catch (DataAccessException e) {
      log.error("Error getting list of individual data. Error: {}", e.getMessage());
    }
    return result;
  }
}
