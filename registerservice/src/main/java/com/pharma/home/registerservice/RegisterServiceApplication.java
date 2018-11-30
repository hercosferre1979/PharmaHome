package com.pharma.home.registerservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class RegisterServiceApplication {

    private final Logger logger = LoggerFactory.getLogger(RegisterServiceApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(RegisterServiceApplication.class, args);
    }

    @RequestMapping("/registerpharmacie")
    Boolean registerPharmacie(String name) {

        for (int i = 0; i < 2; i++) {
            logger.info("Name {} iteration {} this {}", name, i, this);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (name.contains("bla")) {
            return true;
        } else {
            return false;
        }
    }

}
