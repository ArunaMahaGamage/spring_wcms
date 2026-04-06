package com.aruna.wcms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class WcmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(WcmsApplication.class, args);
	}

}
