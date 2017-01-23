package com;

import com.spring.bean.SpringUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//@EnableScheduling //开启定时任务
@ServletComponentScan  //开启扫描自定义的servlet 和filiter
public class DemoApplication {

//	@Bean
//	public SpringUtil getSpringUtils() {
//		return new SpringUtil();
//	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
