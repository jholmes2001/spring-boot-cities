package com.example.cities;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

import com.example.cities.controller.CitiesController;
import com.example.cities.resources.CityResource;
import com.example.cities.resources.CityResourceAssembler;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@EnableSpringDataWebSupport
@EnableJpaRepositories
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
    @Bean
    public CityResourceAssembler cityResourceAssembler() {
    	return new CityResourceAssembler(CitiesController.class, CityResource.class);
	}

}
