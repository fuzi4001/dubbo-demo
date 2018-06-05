package com.example.demo.demoproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//@CrossOrigin//允许跨越访问
@SpringBootApplication//springBoot项目入口
public class DemoProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoProducerApplication.class, args);
		System.out.println("start: producer");
	}
}
