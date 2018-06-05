package com.example.demo.democonsumers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

//@CrossOrigin//允许跨越访问
@SpringBootApplication//springBoot项目入口
public class DemoConsumersApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoConsumersApplication.class, args);
		System.out.println("start: consumers");
	}
}
