package com.example.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringAopEx {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringAopEx.class, args);
		AspectConfigAop ac=context.getBean(AspectConfigAop.class);
		ClassExample a=context.getBean(ClassExample.class);
		a.printHello();
		a.getSum(a.getNum(),a.getNum());

	}
}
