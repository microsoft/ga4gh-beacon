package com.microsoft.beacon.api.db;

import com.microsoft.beacon.api.db.model.Dummy;
import java.util.List;
import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@Slf4j
public class DummyDao {
  private static final String DUMMY_ID_PARAM_NAME = "dummy_id";
  private static final String DATA_PARAM_NAME = "data";

  private static final String GET_DUMMY_SQL = "select dummy_id, data from dummy";
  private static final String UPDATE_DUMMY_SQL =
      "insert into dummy(dummy_id, data) values (:dummy_id, :data)";

  private final NamedParameterJdbcTemplate jdbcTemplate;

  private static final RowMapper<Dummy> dummyRowMapper =
      (rs, num) -> new Dummy(UUID.fromString(rs.getString("dummy_id")), rs.getString("data"));

  public DummyDao(NamedParameterJdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  public void insertDummyData(UUID dummyId, String data) {
    try {
      MapSqlParameterSource params =
          new MapSqlParameterSource()
              .addValue(DUMMY_ID_PARAM_NAME, dummyId)
              .addValue(DATA_PARAM_NAME, data);
      jdbcTemplate.update(UPDATE_DUMMY_SQL, params);
    } catch (DataAccessException e) {
      log.error("Cannot get dummy data. Error: {}", e.getMessage());
      throw e;
    }
  }

  public List<Dummy> getDummyData() {
    List<Dummy> result;
    try {
      result = jdbcTemplate.query(GET_DUMMY_SQL, dummyRowMapper);
      log.debug("Dummy data received from db.");
      return result;
    } catch (DataAccessException e) {
      log.error("Cannot get dummy data. Error: {}", e.getMessage());
      throw e;
    }
  }
}
