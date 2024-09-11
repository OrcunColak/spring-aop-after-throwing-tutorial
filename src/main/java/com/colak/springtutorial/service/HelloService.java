package com.colak.springtutorial.service;

import com.colak.springtutorial.exceptionhandling.ErrorHandler;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    @ErrorHandler
    public String getResource() {
        throw new RuntimeException("Resource exception");
    }
}
