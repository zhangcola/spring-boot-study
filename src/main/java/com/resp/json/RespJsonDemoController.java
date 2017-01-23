package com.resp.json;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * Created by cola on 2017/1/22.
 */
@RestController
@RequestMapping(value = "/resp/json")
public class RespJsonDemoController {
    @RequestMapping(value = "/getDemo")
    public Demo getDemo() {

        Demo demo = new Demo();
        demo.setId(UUID.randomUUID().toString());
        demo.setName("test");

        return demo;
    }
}
