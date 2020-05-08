package com.acme.keeper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class KeeperApplication {

    public static void main(String[] args) {

        SpringApplication.run(KeeperApplication.class, args);
    }

}
