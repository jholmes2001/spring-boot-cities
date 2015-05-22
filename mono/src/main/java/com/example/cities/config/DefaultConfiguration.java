package com.example.cities.config;

import com.example.cities.repositories.CityRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("default")
public class DefaultConfiguration {
	
	@Autowired
	CityRepository cityRepository;
	
    @Bean
    public CityRepository cityRepository() {
        return cityRepository;
    }
}
