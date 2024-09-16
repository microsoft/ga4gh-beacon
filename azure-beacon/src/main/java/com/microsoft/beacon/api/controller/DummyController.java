package com.microsoft.beacon.api.controller;

import com.microsoft.beacon.api.db.model.Dummy;
import com.microsoft.beacon.api.service.DummyService;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController {

  private final DummyService dummyService;

  static class DummyData {
    private String dummyId;
    private String data;

    public DummyData() {}

    public void setDummyId(String value) {
      dummyId = value;
    }

    public void setDataString(String value) {
      data = value;
    }

    public String getDummyId() {
      return dummyId;
    }

    public String getData() {
      return data;
    }
  }

  @Autowired
  public DummyController(DummyService dummyService) {
    this.dummyService = dummyService;
  }

  @GetMapping("/")
  public String greetings() {
    return dummyService.getGreetingsMessage();
  }

  @GetMapping("/api/dummy")
  public List<Dummy> getDummy() {
    return dummyService.getDummyData();
  }

  @PostMapping("api/dummy")
  public HttpStatus insertDummy(@RequestBody DummyData dummyData) {
    dummyService.insertDummyData(UUID.fromString(dummyData.getDummyId()), dummyData.getData());
    return HttpStatus.CREATED;
  }
}
