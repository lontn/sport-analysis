package com.sport.ball.application.sportanalysis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SportAnalysisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SportAnalysisApplication.class, args);
    }

}
