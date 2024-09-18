package com.microsoft.beacon.api.db;

import com.microsoft.beacon.api.db.model.Dataset;
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
public class DatasetDao {
  private String SELECT_DATASET_QUERY = "select * from dataset where id = :id";
  // no paging at this time.
  private String LIST_DATASET_QUERY = "select * from dataset";

  private static final RowMapper<Dataset> datasetRowMapper =
      (rs, num) ->
          new Dataset(rs.getString("id"), rs.getString("name"), rs.getString("externalUrl"));

  private final NamedParameterJdbcTemplate jdbcTemplate;

  public DatasetDao(NamedParameterJdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  public Optional<Dataset> getDataset(String id) {
    try {
      Dataset result =
          jdbcTemplate.queryForObject(SELECT_DATASET_QUERY, Map.of("id", id), datasetRowMapper);
      return Optional.ofNullable(result);
    } catch (DataAccessException e) {
      log.error("Error getting dataset data with id={}. Error: {}", id, e.getMessage());
      throw e;
    }
  }

  public List<Dataset> listDatasets() {
    List<Dataset> result = Collections.emptyList();
    try {
      result = jdbcTemplate.query(LIST_DATASET_QUERY, datasetRowMapper);
    } catch (DataAccessException e) {
      log.error("Error getting list of dataset data. Error: {}", e.getMessage());
    }
    return result;
  }
}
