package com.ruloans.springbootbackend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping
    public String demo() {
        return "RULOANS Backend CI/CD Hosting (Static Page from controller in getmapping method)";
    }
}
