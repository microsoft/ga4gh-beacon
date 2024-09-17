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
  private String SELECT_INDIVIDUAL_QUERY = "select * from individual where id = :id";
  // no paging at this time.
  private String LIST_INDIVIDUALS_QUERY = "select * from individual";

  private static final RowMapper<Individual> individualRowMapper =
      (rs, num) -> new Individual(rs.getString("id"), rs.getString("sex"));

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

  public List<Individual> listIndividuals() {
    List<Individual> result = Collections.emptyList();
    try {
      result = jdbcTemplate.query(LIST_INDIVIDUALS_QUERY, individualRowMapper);
    } catch (DataAccessException e) {
      log.error("Error getting list of individual data. Error: {}", e.getMessage());
    }
    return result;
  }
}
