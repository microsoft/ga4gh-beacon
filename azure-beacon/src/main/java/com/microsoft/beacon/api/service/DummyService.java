package com.microsoft.beacon.api.service;

import com.microsoft.beacon.api.db.DummyDao;
import com.microsoft.beacon.api.db.model.Dummy;
import java.util.List;
import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DummyService {

  private final DummyDao dummyDao;

  public DummyService(DummyDao dummyDao) {
    this.dummyDao = dummyDao;
  }

  public String getGreetingsMessage() {
    log.info("Info message.");
    return "Beacon API welcomes you!";
  }

  public void insertDummyData(UUID dummyId, String data) {
    dummyDao.insertDummyData(dummyId, data);
  }

  public List<Dummy> getDummyData() {
    return dummyDao.getDummyData();
  }
}
