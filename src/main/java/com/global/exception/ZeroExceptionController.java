package com.global.exception;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cola on 2017/1/22.
 */
@RestController
@RequestMapping(value = "/exception")
public class ZeroExceptionController {

    @RequestMapping(value = "/zero")
    public void zero() {
        int a = 100/0;
    }
}
