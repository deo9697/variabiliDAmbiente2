package com.variabiliDAmbiente2.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${app.welcomeMsg}")
    private String welcomeMsg;

    @GetMapping("/")
    public String welcome() {
        return welcomeMsg;
    }
}