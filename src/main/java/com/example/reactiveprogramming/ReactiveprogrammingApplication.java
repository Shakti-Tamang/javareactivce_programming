package com.example.reactiveprogramming;

import java.util.Objects;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableAsync  
@EnableScheduling
// @EnableAspectJAutoProxy(proxyTargetClass = true)
public class ReactiveprogrammingApplication {
		public static void main(String[] args) {
		SpringApplication.run(ReactiveprogrammingApplication.class, args);

		String a="shakti";

	}

}
