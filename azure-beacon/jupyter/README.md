# Overview
This readme file goes over the instructions to set up the end to end demo of beacon api components implemented in this repo using a Jupyter notebook. 

# 1. Start the postgres container
In one terminal window run the following command, leave this terminal window open ((make sure you are inside of azure-beacon directory). 

`./scripts/local-dev/postgres.sh start`

# 2. Start the beacon service
In a different terminal window run the following command (make sure you are inside of azure-beacon directory): 

`./gradlew bootRun`

# 3. Load test data
In the terminal window used in step 1, run the following commands to load data. You can get the postgres password [here](https://github.com/microsoft/ga4gh-beacon/blob/main/azure-beacon/scripts/local-dev/init-db.sql#L2). 

Make sure update the FULL_PATH with your path

`psql -h 127.0.0.1 -p 5433 -U beaconapiuser -d beacon_api`

`\COPY dataset FROM '[FULL_PATH]/ga4gh-beacon/azure-beacon/src/main/resources/db/test_data/dataset_table.csv' DELIMITER ',' CSV`

`\COPY individual(id, sex, ethnicity, dataset_id, url) FROM '[FULL_PATH]/ga4gh-beacon/azure-beacon/src/main/resources/db/test_data/individual_table.csv' DELIMITER ',' CSV`

`\COPY disease FROM '[FULL_PATH]/ga4gh-beacon/azure-beacon/src/main/resources/db/test_data//disease_table.csv' DELIMITER '>' CSV`

`\COPY individual_disease FROM '[FULL_PATH]/ga4gh-beacon/azure-beacon/src/main/resources/db/test_data//individual_disease_table.csv' DELIMITER ',' CSV`

# 4. Open the jupyter notebook and execute! 

To do this you need to have jupyter lab or notebook installed.
