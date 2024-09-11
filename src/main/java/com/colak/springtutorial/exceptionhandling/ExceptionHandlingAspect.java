package com.colak.springtutorial.exceptionhandling;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

// This is an aspect that uses package name as pointcut
@Aspect
@Component
@Slf4j
public class ExceptionHandlingAspect {

    // throwing and method parameters must have the same name
    @AfterThrowing(
            pointcut = "execution(* com.colak.springtutorial.service.*.*(..))",
            throwing = "exception"
    )
    public void handleException(Exception exception) {
        log.error("An exception caught in ExceptionHandlingAspect: ", exception);
    }
}
