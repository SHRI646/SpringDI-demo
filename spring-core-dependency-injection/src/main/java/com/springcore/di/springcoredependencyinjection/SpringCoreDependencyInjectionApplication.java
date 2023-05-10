package com.springcore.di.springcoredependencyinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringCoreDependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringCoreDependencyInjectionApplication.class, args);

		Car	car=context.getBean(Car.class);
		car.start();
	}

}
