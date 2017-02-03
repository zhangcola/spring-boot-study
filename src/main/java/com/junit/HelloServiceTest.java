package com.junit;

import com.DemoApplication;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

/**
 * Created by cola on 2017/2/2.
 */
@RunWith(SpringJUnit4ClassRunner.class)
// 指定我们SpringBoot工程的Application启动类
@SpringApplicationConfiguration(DemoApplication.class)
@WebAppConfiguration
public class HelloServiceTest {

    @Resource
    private HelloService helloService;

    @Test
    public void testGetName(){
        System.out.print(helloService.getServiceName());
        Assert.assertEquals("hello",helloService.getServiceName());
    }
}
