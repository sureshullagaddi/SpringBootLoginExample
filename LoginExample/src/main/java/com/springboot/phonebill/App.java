package com.springboot.phonebill;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Starting of the application
 *
 */
//@ComponentScan(value = "com.springboot.loginexample")
@SpringBootApplication
public class App {
	public static void main(String[] args) {
		// https://www.codejava.net/frameworks/spring-boot/spring-boot-crud-example-with-spring-mvc-spring-data-jpa-thymeleaf-hibernate-mysql

		SpringApplication.run(App.class, args);

	}

}
