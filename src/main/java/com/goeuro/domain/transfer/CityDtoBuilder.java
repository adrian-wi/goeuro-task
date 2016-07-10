package com.goeuro.domain.transfer;

import java.util.Map;

public class CityDtoBuilder {

    private final CityDto cityDto;

    private CityDtoBuilder(CityDto cityDto) {
        this.cityDto = cityDto;
    }

    public static CityDtoBuilder create() {
        return new CityDtoBuilder(new CityDto());
    }

    public CityDtoBuilder withId(Long id) {
        cityDto.setId(id);
        return this;
    }

    public CityDtoBuilder withKey(String key) {
        cityDto.setKey(key);
        return this;
    }

    public CityDtoBuilder withName(String name) {
        cityDto.setName(name);
        return this;
    }

    public CityDtoBuilder withFullName(String fullName) {
        cityDto.setFullName(fullName);
        return this;
    }

    public CityDtoBuilder withIataAirportCode(String iataAirportCode) {
        cityDto.setIataAirportCode(iataAirportCode);
        return this;
    }

    public CityDtoBuilder withType(String type) {
        cityDto.setType(type);
        return this;
    }

    public CityDtoBuilder withCountry(String country) {
        cityDto.setCountry(country);
        return this;
    }

    public CityDtoBuilder withLatitude(String latitude) {
        cityDto.setLatitude(latitude);
        return this;
    }

    public CityDtoBuilder withLongitude(String longitude) {
        cityDto.setLongitude(longitude);
        return this;
    }

    public CityDtoBuilder withLocationId(Long locationId) {
        cityDto.setLocationId(locationId);
        return this;
    }

    public CityDtoBuilder withInEurope(Boolean inEurope) {
        cityDto.setInEurope(inEurope);
        return this;
    }

    public CityDtoBuilder withCountryId(Long countryId) {
        cityDto.setCountryId(countryId);
        return this;
    }

    public CityDtoBuilder withCountryCode(String countryCode) {
        cityDto.setCountryCode(countryCode);
        return this;
    }

    public CityDtoBuilder withCoreCountry(Boolean coreCountry) {
        cityDto.setCoreCountry(coreCountry);
        return this;
    }

    public CityDtoBuilder withDistance(String distance) {
        cityDto.setDistance(distance);
        return this;
    }

    public CityDtoBuilder withNames(Map<String, String> names) {
        cityDto.setNames(names);
        return this;
    }

    public CityDtoBuilder withAlternativeNames(Map<String, String> alternativeNames) {
        cityDto.setAlternativeNames(alternativeNames);
        return this;
    }

    public CityDto build() {
        return cityDto;
    }

}
