package com.microsoft.beacon.api.db.liquibase;

import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
import liquibase.Liquibase;
import liquibase.database.jvm.JdbcConnection;
import liquibase.exception.LiquibaseException;
import liquibase.resource.ClassLoaderResourceAccessor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LiquibaseMigrator {
  private static final String CHANGE_LOG = "db/changelog.xml";

  @SuppressWarnings("PMD.CloseResource")
  public static void migrate(DataSource dataSource) {
    log.info("Starting beacon database migration...");
    try (Connection connection = dataSource.getConnection()) {
      Liquibase liquibase =
          new Liquibase(
              CHANGE_LOG, new ClassLoaderResourceAccessor(), new JdbcConnection(connection));
      liquibase.update();
      log.info("Beacon database migration completed.");
    } catch (LiquibaseException | SQLException e) {
      throw new DatabaseMigrationException("Liquibase migration failed", e);
    }
  }
}
