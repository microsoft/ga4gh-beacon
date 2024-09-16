package com.microsoft.beacon.api.configuration.spring;

import com.microsoft.beacon.api.configuration.BeaconApiDatabaseConfiguration;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class AppConfig {

  @Bean("beaconDataSource")
  public DataSource getDataSource(BeaconApiDatabaseConfiguration config) {
    DriverManagerDataSource ds = new DriverManagerDataSource();
    ds.setDriverClassName("org.postgresql.Driver");
    ds.setUrl(config.getUri());
    ds.setUsername(config.getUserName());
    ds.setPassword(config.getPassword());
    return ds;
  }

  @Bean("beaconJdbcTemplate")
  public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate(DataSource dataSource) {
    return new NamedParameterJdbcTemplate(dataSource);
  }
}
