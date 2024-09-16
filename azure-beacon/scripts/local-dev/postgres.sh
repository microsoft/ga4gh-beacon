#!/usr/bin/env bash

POSTGRES_VERSION=15

start() {
  #https://hub.docker.com/_/postgres

  echo "Creating PostgreSQL container..."
  #default 'postgres' superuser will be created with password defined below
  docker create --name beacon-api-postgres \
  -e POSTGRES_PASSWORD=postgres \
  -p "5432:5432" \
  postgres:$POSTGRES_VERSION

  #script to initialize beacon-api database
  echo "Copying database initialization script..."
  docker cp scripts/local-dev/init-db.sql beacon-api-postgres:/docker-entrypoint-initdb.d/

  echo "Starting PostgreSQL container..."
  docker start beacon-api-postgres
}

stop() {
  echo "Stopping PostgreSQL container..."
  docker stop beacon-api-postgres
  echo "Deleting PostgreSQL container..."
  docker rm -f beacon-api-postgres
}

usage() {
  echo "Usage: $0 start|stop"
  echo "Run postgres database locally."
}

if [ $# -eq 0 ]; then
  usage
elif [ $1 = "start" ]; then
  start
elif [ $1 = "stop" ]; then
  stop
else
  echo "Only start/stop commands supported."
  exit 1
fi