package com.example.rm.movieDB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.web.client.RestTemplate;

import com.example.rm.movieDB.config.AppConfig;


@Import(AppConfig.class)
@SpringBootApplication(scanBasePackages= {"com.example.rm.movieDB"})
@EnableFeignClients
public class MainApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}

}
