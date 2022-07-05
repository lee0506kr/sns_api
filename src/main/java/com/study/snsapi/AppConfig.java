package com.study.snsapi;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class AppConfig implements CommandLineRunner, HealthIndicator {

    @Override
    public void run(String... args) throws Exception {

    }

    @Override
    public Health health() {
        return Health.up().build();
    }
}
