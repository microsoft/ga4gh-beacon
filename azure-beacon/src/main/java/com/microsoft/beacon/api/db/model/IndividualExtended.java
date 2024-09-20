package com.microsoft.beacon.api.db.model;

public record IndividualExtended(
    String id,
    String sex,
    int datasetId,
    String ethnicity,
    String url,
    String diseaseCode,
    String disease) {}
