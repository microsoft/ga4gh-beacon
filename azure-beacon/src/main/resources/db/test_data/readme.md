### Use following command to load test data locally.
#### 1. Use psql to open postgres console. It asks for password. Use password from application.yml
```psql -h 127.0.0.1 -p 5433 -U beaconapiuser -d beacon_api```

#### 2. Use copy command to load data. PLEASE Fix path to the csv file depending on your configuration.

###### 2.a load data into dataset table ("\" before COPY is required!). FULL_PATH should full path. Something like ~/your-folder/project/...
```\COPY dataset(id, name, createDateTime, updateDateTime, description, version, info) FROM '[FULL_PATH]/dataset_table.csv' DELIMITER ',' CSV```
###### 2.b load data into individual table
```\COPY individual(id, sex, ethnicity, dataset_id, url) FROM '[FULL_PATH]/individual_table.csv' DELIMITER ',' CSV```
