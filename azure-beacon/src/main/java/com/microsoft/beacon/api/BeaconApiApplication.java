package com.microsoft.beacon.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class BeaconApiApplication {

  public static void main(String[] args) {
    SpringApplication.run(BeaconApiApplication.class, args);
  }
}
