package com.example.cities.resources;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import com.example.cities.domain.City;

public class CityResourceAssembler extends ResourceAssemblerSupport<City, CityResource> { 
	
	public CityResourceAssembler(Class<?> controllerClass,
			Class<CityResource> resourceType) {
		super(controllerClass, resourceType);
	}

	@Override
	public CityResource toResource(City city) {
		CityResource cityResource = new CityResource();
		cityResource.setCounty(city.getCounty());
		cityResource.setLatitude(city.getLatitude());
		cityResource.setLongitude(city.getLongitude());
		cityResource.setName(city.getName());
		cityResource.setPostalCode(city.getPostalCode());
		cityResource.setStateCode(city.getStateCode());
		return cityResource;
	}
}
