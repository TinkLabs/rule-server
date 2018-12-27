package com.tinklabs;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication(scanBasePackages = {"com.tinklabs"}, exclude = {})
@Slf4j
public class RuleserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(RuleserverApplication.class, args);
    }

}

