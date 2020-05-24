package com.example.rm.movieDB.config;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.mongodb.ConnectionString;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;


@Configuration
public class AppConfig { 
	
	public @Bean MongoClient mongoClient() {
		return MongoClients.create(new ConnectionString("mongodb://localhost:27017"));
	}
	
	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
}
