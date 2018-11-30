package com.pharma.rain.day.pharma.clientpharma;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@RestController
public class ClientpharmaApplication {

    private final Logger logger = LoggerFactory.getLogger(ClientpharmaApplication.class);

    @Autowired
    private RegisterService registerService;

    public static void main(String[] args) {
        SpringApplication.run(ClientpharmaApplication.class, args);
    }

    @RequestMapping(
            method = RequestMethod.GET,
            path = "/clientRegisterPharma"
    )
    public Boolean registerPharmacie(@RequestParam("pharmacieName") String pharmacieName) {
        logger.info("New request!!!!!!!!!!!!!!!!");
        return registerService.registerPharmacie(pharmacieName);
    }
}