package com.microsoft.beacon.api.service;

import com.microsoft.beacon.api.db.IndividualDao;
import com.microsoft.beacon.api.db.model.Individual;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class IndividualService {
  private final IndividualDao individualDao;

  public IndividualService(IndividualDao individualDao) {
    this.individualDao = individualDao;
  }

  public Optional<Individual> getIndividual(String id) {
    return individualDao.getIndividual(id);
  }

  public List<Individual> getIndividuals(/*hardcoded limit now is on DAO level*/ ) {
    return individualDao.listIndividuals();
  }
}
