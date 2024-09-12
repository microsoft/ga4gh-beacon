CREATE DATABASE beacon_api;
CREATE ROLE beaconapiuser WITH LOGIN ENCRYPTED PASSWORD 'beaconuserpassword';

--https://www.postgresql.org/about/news/postgresql-15-released-2526/
-- PostgreSQL 15 also revokes the CREATE permission from all users except a database owner from the public (or default) schema.
ALTER DATABASE beacon_api OWNER TO beaconapiuser;