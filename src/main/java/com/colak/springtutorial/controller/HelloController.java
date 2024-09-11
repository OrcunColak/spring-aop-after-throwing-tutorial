package com.colak.springtutorial.controller;

import com.colak.springtutorial.service.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HelloController {

    private final HelloService service;

    // http://localhost:8080/resource
    @GetMapping("/resource")

    public String getResource() {
        String result = "Result";
        try {
            result = service.getResource();
        } catch (Exception exception) {
        }
        return result;
    }
}
