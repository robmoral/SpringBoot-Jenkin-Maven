package com.example.myself.myself;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MyselfApplication {

	private static final Logger log = LoggerFactory.getLogger(MyselfApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MyselfApplication.class);
	}

        @Bean
        public RestTemplate getRestTemplate() {
          return new RestTemplate();
        }
}