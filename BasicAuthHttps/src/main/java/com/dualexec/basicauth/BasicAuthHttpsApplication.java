package com.dualexec.basicauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.dualexec.basicauth.identity", "com.dualexec.basicauth.api" })
public class BasicAuthHttpsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicAuthHttpsApplication.class, args);
	}
}
