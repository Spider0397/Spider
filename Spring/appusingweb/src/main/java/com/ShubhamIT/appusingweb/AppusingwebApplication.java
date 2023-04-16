package com.ShubhamIT.appusingweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import studentcontrol.Stucontroller;

@SpringBootApplication
@ComponentScan(basePackages = {"studentcontrol","service","studentdao"})
public class AppusingwebApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(AppusingwebApplication.class, args);
		Stucontroller bean = configurableApplicationContext.getBean("stucontroller",Stucontroller.class);
		bean.savecontroller();
		

	}
		
}
