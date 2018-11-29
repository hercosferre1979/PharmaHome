package com.pharma.home.registerservice.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {

    @RequestMapping("/registerpharmacie")
    Boolean registerPharmacie(String name) {
        if (name.contains("bla")) {
            return true;
        } else {
            return false;
        }
    }

}
