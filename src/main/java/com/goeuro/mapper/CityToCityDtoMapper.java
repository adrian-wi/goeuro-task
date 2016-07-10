package com.goeuro.mapper;

import com.goeuro.domain.City;
import com.goeuro.domain.transfer.CityDto;
import com.goeuro.domain.transfer.CityDtoBuilder;
import org.springframework.stereotype.Service;

@Service
public class CityToCityDtoMapper {

    public CityDto map(City city) {

        return CityDtoBuilder.create()
                .withId(city.getId())
                .withKey(city.getKey())
                .withName(city.getName())
                .withFullName(city.getFullName())
                .withIataAirportCode(city.getIataAirportCode())
                .withType(city.getType())
                .withCountry(city.getCountry())
                .withLongitude(city.getGeoPosition() != null ? city.getGeoPosition().getLongitude() : null)
                .withLatitude(city.getGeoPosition() != null ? city.getGeoPosition().getLatitude(): null)
                .withLocationId(city.getLocationId())
                .withInEurope(city.getInEurope())
                .withCountryId(city.getCountryId())
                .withCountryCode(city.getCountryCode())
                .withCoreCountry(city.getCoreCountry())
                .withDistance(city.getDistance())
                .withNames(city.getNames())
                .withAlternativeNames(city.getAlternativeNames())
                .build();
    }
}
