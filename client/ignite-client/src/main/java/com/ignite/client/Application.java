package com.ignite.client;

import com.ignite.client.config.EnableIgnite;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableIgnite
public class Application {
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
