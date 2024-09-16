package com.microsoft.beacon.api;

import com.microsoft.beacon.api.db.liquibase.LiquibaseMigrator;
import javax.sql.DataSource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;

@Slf4j
public class StartupInitializer {
  public static void init(ApplicationContext applicationContext) {
    DataSource dataSource = (DataSource) applicationContext.getBean("beaconDataSource");
    LiquibaseMigrator.migrate(dataSource);
  }
}
