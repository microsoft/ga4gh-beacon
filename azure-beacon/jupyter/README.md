# Overview
This readme file goes over the instructions to set up the end to end demo of beacon api components implemented in this repo using a Jupyter notebook. 

# 1. Start the postgres container
In one terminal window run the following command, leave this terminal window open. 

`./scripts/local-dev/postgres.sh start`

# 2. Start the beacon service
In a different terminal windo run the following command: 

`./gradlew bootRun`

# 3. Load test data
In the terminal window used in step 1, run the following commands to load data. You can get the postgres password [here](https://github.com/microsoft/ga4gh-beacon/blob/main/azure-beacon/scripts/local-dev/init-db.sql#L2). 

Make sure update the FULL_PATH with your path

`psql -h 127.0.0.1 -p 5433 -U beaconapiuser -d beacon_api`

`\COPY dataset FROM '[FULL_PATH]/dataset_table.csv' DELIMITER ',' CSV`

`\COPY individual(id, sex, ethnicity, dataset_id, url) FROM '[FULL_PATH]/individual_table.csv' DELIMITER ',' CSV`

# 4. Open the jupyter notebook and execute! 
