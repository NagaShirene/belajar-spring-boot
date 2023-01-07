package com.Fadhil.LatihanTerori.spring.core;

import com.Fadhil.LatihanTerori.spring.core.LifeCycleConfiguration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.Fadhil.LatihanTerori.spring.core.data.Connection;
import com.Fadhil.LatihanTerori.spring.core.data.Server;

public class LifeCycleTest {

  private ConfigurableApplicationContext applicationContext;

  @BeforeEach
  void setUp() {
    applicationContext = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);
    applicationContext.registerShutdownHook();
  }

  @AfterEach
  void tearDown() {
    // applicationContext.close();
  }

  @Test
  void testConnection() {

    Connection connection = applicationContext.getBean(Connection.class);

  }

  @Test
  void testServer() {
    Server server = applicationContext.getBean(Server.class);
  }
}
