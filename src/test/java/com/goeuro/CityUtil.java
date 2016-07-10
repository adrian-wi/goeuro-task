package com.goeuro;

import com.goeuro.domain.City;
import com.goeuro.domain.Coordinates;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CityUtil {

    public static List<City> prepareCities() {
        return Arrays.asList(prepareCity(),prepareCity());
    }

    public static City prepareCity() {
        return createCity();
    }

    private static City createCity() {
        Map<String,String> names = new HashMap<>();
        names.put("ru", "Берлин");
        names.put("it", "Berlino");
        names.put("is", "Berlín");
        names.put("fi", "Berliini");
        names.put("es", "Berlín");
        names.put("zh", "柏林");
        names.put("cs", "Berlín");
        names.put("ca", "Berlín");
        names.put("nl", "Berlijn");

        Coordinates coordinates = new Coordinates();
        coordinates.setLatitude("52.52437");
        coordinates.setLongitude("13.41053");

        City city = new City();
        city.setId(376217L);
        city.setKey("testKey");
        city.setName("Berlin");
        city.setFullName("Berlin, Germany");
        city.setGeoPosition(coordinates);
        city.setLocationId(8384L);
        city.setInEurope(true);
        city.setCountryId(56L);
        city.setCountryCode("DE");
        city.setCoreCountry(true);
        city.setDistance("53538");
        city.setNames(names);
        city.setAlternativeNames(names);

        return city;
    }
}
