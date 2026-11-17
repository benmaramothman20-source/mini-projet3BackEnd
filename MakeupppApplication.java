package com.maram.Makeuppp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import com.maram.Makeuppp.entities.makeuppp;

@SpringBootApplication
public class MakeupppApplication {

    public static void main(String[] args) {
        SpringApplication.run(MakeupppApplication.class, args);
    }

    @Bean
    public RepositoryRestConfigurer repositoryRestConfigurer() {
        return RepositoryRestConfigurer.withConfig(config -> {
            config.exposeIdsFor(makeuppp.class);
        });
    }
}