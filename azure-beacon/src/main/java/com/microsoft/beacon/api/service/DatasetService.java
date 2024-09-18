package com.microsoft.beacon.api.service;

import com.microsoft.beacon.api.db.DatasetDao;
import com.microsoft.beacon.api.db.model.Dataset;
import java.util.List;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DatasetService {

  private final DatasetDao datasetDao;

  public DatasetService(DatasetDao datasetDao) {
    this.datasetDao = datasetDao;
  }

  public List<Dataset> getDatasets() {
    return datasetDao.listDatasets();
  }

  public Optional<Dataset> getDataset(String datasetId) {
    return datasetDao.getDataset(datasetId);
  }
}
