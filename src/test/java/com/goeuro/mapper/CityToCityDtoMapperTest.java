package com.goeuro.mapper;

import com.goeuro.domain.City;
import com.goeuro.domain.transfer.CityDto;
import org.junit.Test;

import static com.goeuro.CityUtil.prepareCity;
import static org.junit.Assert.*;

public class CityToCityDtoMapperTest {

    @Test
    public void testMapping() {
        //given
        CityToCityDtoMapper underTest = new CityToCityDtoMapper();
        City city = prepareCity();
        //when
        CityDto cityDto = underTest.map(city);

        //then
        assertNotNull(cityDto);
        assertEquals(376217L, cityDto.getId().longValue());
        assertEquals("testKey", cityDto.getKey());
        assertEquals("Berlin", cityDto.getName());
        assertEquals("Berlin, Germany", cityDto.getFullName());
        assertEquals("52.52437", cityDto.getLatitude());
        assertEquals("13.41053", cityDto.getLongitude());
        assertEquals(8384L, cityDto.getLocationId().longValue());
        assertTrue(cityDto.getInEurope());
        assertEquals(56L, cityDto.getCountryId().longValue());
        assertEquals("DE", cityDto.getCountryCode());
        assertTrue(cityDto.getCoreCountry());
        assertEquals("53538", cityDto.getDistance());
        assertNotNull(cityDto.getNames());
        assertNotNull(cityDto.getAlternativeNames());
        assertEquals(9, cityDto.getNames().size());
        assertEquals("Берлин", cityDto.getNames().get("ru"));
        assertEquals("Berlino", cityDto.getNames().get("it"));
        assertEquals("Berlín", cityDto.getNames().get("is"));
        assertEquals("Berliini", cityDto.getNames().get("fi"));
        assertEquals("Berlín", cityDto.getNames().get("es"));
        assertEquals("柏林", cityDto.getNames().get("zh"));
        assertEquals("Berlín", cityDto.getNames().get("cs"));
        assertEquals("Berlín", cityDto.getNames().get("ca"));
        assertEquals("Berlijn", cityDto.getNames().get("nl"));
    }
}