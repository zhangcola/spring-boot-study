package com.junit;

import org.springframework.stereotype.Service;

/**
 * Created by cola on 2017/2/2.
 */
@Service
public class HelloService {

    public String getServiceName() {
        return "hello";
    }
}
