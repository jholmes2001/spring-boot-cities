package com.example.cities.controller;


import com.example.cities.domain.City;
import com.example.cities.repositories.CityRepository;
import com.example.cities.resources.CityResource;
import com.example.cities.resources.CityResourceAssembler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.hateoas.PagedResources;

@RestController
@RequestMapping("/cities")
public class CitiesController {
	
    @Autowired
    private CityResourceAssembler assembler;

    private CityRepository repository;

    @Autowired
    public CitiesController(CityRepository repository) {
        this.repository = repository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public PagedResources<CityResource> list(@PageableDefault Pageable pageable,
    		PagedResourcesAssembler<City> pagedAssembler) {
        Page<City> cities = repository.findAll(pageable);
        return pagedAssembler.toResource(cities, assembler);
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public PagedResources<CityResource> search(@RequestParam("name") String name, @PageableDefault Pageable pageable,
    		PagedResourcesAssembler<City> pagedAssembler) {
    	 Page<City> cities = repository.findByNameContainsIgnoreCase(name, pageable);
         return pagedAssembler.toResource(cities, assembler);	 
    }

    @RequestMapping(value = "/version", method = RequestMethod.GET)
    public String version() {
        return System.getenv("VERSION");
    }
}
