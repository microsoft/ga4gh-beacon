package com.microsoft.beacon.api.service;

import com.microsoft.beacon.api.db.IndividualDao;
import com.microsoft.beacon.api.db.model.Individual;
import com.microsoft.beacon.api.db.model.IndividualExtended;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class IndividualService {
  // define default in case paging parameters are available
  private static final int LIST_INDIVIDUALS_LIMIT = 25;
  private static final int LIST_INDIVIDUALS_SKIP = 0;

  private static final String FILTER_SEPARATOR = ":";

  private final IndividualDao individualDao;

  public IndividualService(IndividualDao individualDao) {
    this.individualDao = individualDao;
  }

  public Optional<Individual> getIndividual(String id) {
    return individualDao.getIndividual(id);
  }

  public List<IndividualExtended> getIndividuals(
      Integer skip, Integer limit, List<String> filters) {
    int limitValue = Optional.ofNullable(limit).orElse(LIST_INDIVIDUALS_LIMIT);
    int skipValue = Optional.ofNullable(skip).orElse(LIST_INDIVIDUALS_SKIP);

    Map<String, String> filtersMap = new HashMap<>();
    // no validation that all filter terms follows this pattern key:value
    if (filters != null) {
      filters.stream()
          .forEach(
              filter ->
                  filtersMap.put(
                      filter.split(FILTER_SEPARATOR)[0], filter.split(FILTER_SEPARATOR)[1]));
    }
    return individualDao.listIndividuals(skipValue, limitValue, filtersMap);
  }
}
