package com.rain.day.pharma.clientpharma;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient("register-service")
public interface RegisterService {

    @RequestMapping(
            method = RequestMethod.GET,
            value = "/registerpharmacie"
    )
    Boolean registerPharmacie(@RequestParam("name") String name);

}
