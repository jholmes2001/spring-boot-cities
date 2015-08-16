package com.example.cities.resources;

import java.io.Serializable;

import org.springframework.hateoas.ResourceSupport;

public class CityResource extends ResourceSupport implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;

    private String county;

    private String stateCode;

    private String postalCode;

    private String latitude;

    private String longitude;

    public CityResource() {
    }

    public CityResource(String name, String stateCode, String postalCode) {
        this.name = name;
        this.stateCode = stateCode;
        this.postalCode = postalCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    
    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}
