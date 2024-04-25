package com.spring.transaction.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
public class SpringTransactionManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTransactionManagementApplication.class, args);
	}

}
