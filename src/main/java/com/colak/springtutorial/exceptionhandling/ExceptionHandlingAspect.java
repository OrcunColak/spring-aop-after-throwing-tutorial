package com.colak.springtutorial.exceptionhandling;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class ExceptionHandlingAspect {

    @AfterThrowing(
            pointcut = "execution(* com.colak.springtutorial.controller.*.*(..))",
            throwing = "ex"
    )
    public void handleException(Exception exception) {
        log.error("An exception occurred: ", exception);
    }
}
