package com.colak.springtutorial.exceptionhandling;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

// This is an aspect that uses annotation as pointcut
@Aspect
@Component
@Slf4j
public class ExceptionHandlingAspect2 {

    @Pointcut("@annotation(com.colak.springtutorial.exceptionhandling.ErrorHandler)")
    public void handleException() {
    }

    @AfterThrowing(pointcut = "handleException()", throwing = "ex")
    public void afterThrowing(Exception exception) {
        log.error("An exception occurred: ", exception);
    }
}