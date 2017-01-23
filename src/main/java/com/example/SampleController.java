package com.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cola on 2017/1/18.
 */
//@SpringBootApplication
@RestController
public class SampleController {

    @RequestMapping(value = "/")
    public String index() {
        return "Hello spring boot";
    }
}
