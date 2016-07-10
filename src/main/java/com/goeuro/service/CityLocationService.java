package com.goeuro.service;

import com.goeuro.domain.City;
import org.apache.log4j.Logger;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@Service
public class CityLocationService {

    private static final Logger LOGGER = Logger.getLogger(CityLocationService.class);
    private static final String SERVICE_URL = "http://api.goeuro.com/api/v2/position/suggest/en/";

    private RestTemplate restTemplate = new RestTemplate();

    public List<City> queryRemoteService(String arg) throws InterruptedException, ExecutionException, TimeoutException {
        Future<List<City>> listFuture = queryCity(arg);
        List<City> cities = listFuture.get(10, TimeUnit.SECONDS);
        LOGGER.info("Fetched cities: " + cities);
        return cities;
    }

    @Async
    private Future<List<City>> queryCity(String city) {

        City[] cityArray = restTemplate.getForObject(SERVICE_URL + city, City[].class);
        List<City> parsedCities = Arrays.asList(cityArray);

        return new AsyncResult<>(parsedCities);
    }

    void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
}
