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

    // throwing and method parameters must have the same name
    @AfterThrowing(pointcut = "handleException()", throwing = "exception")
    public void afterThrowing(Exception exception) {
        log.error("An exception caught in ExceptionHandlingAspect2: ", exception);
    }
}