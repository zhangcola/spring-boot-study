package com.global.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by cola on 2017/1/22.
 */
@ControllerAdvice
public class GolbalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public void handleException(HttpServletRequest req, Exception e) {

        e.printStackTrace();
        System.out.println("Exception occure" + e.getMessage());
    }
}

