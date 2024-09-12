package com.microsoft.beacon.api.configuration.spring;

import com.microsoft.beacon.api.StartupInitializer;
import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InitConfig {
  // This allows to do some initialization work before Spring application is ready to accept
  // request,
  // but after the Spring context is initialized.
  @Bean
  public SmartInitializingSingleton postContextInitialization(
      ApplicationContext applicationContext) {
    return () -> {
      StartupInitializer.init(applicationContext);
    };
  }
}
