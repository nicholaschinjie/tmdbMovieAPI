package com.example.rm.movieDB.web.feign;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

import feign.Contract;
import feign.Logger;


@Configuration
public class tMDBFeignConfig {
    
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.HEADERS;
    }


}