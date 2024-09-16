package com.microsoft.beacon.api.db.liquibase;

public class DatabaseMigrationException extends RuntimeException {
  private static final long serialVersionUID = 1L;

  public DatabaseMigrationException(String message) {
    super(message);
  }

  public DatabaseMigrationException(String message, Throwable cause) {
    super(message, cause);
  }
}
