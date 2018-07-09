package com.n26.transactions.statistics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan({"com.n26.transactions.statistics"})
public class Application {

	public static void main(String[] args)
	{
		SpringApplication.run(Application.class, args);
	}
}