package com.example.hiphip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan(basePackages= "com.example.hiphip")//添加扫包@ComponentScan(basePackages= "")
//@EnableAutoConfiguration
@SpringBootApplication
public class HiphipApplication {

	public static void main(String[] args) {

		SpringApplication.run(HiphipApplication.class, args);
	}

}

