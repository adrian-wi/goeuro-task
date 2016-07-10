package com.goeuro.service;

import com.goeuro.domain.City;
import org.junit.Test;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class CityLocationServiceTest {

    private CityLocationService underTest = new CityLocationService();
    private RestTemplate restTemplate = mock(RestTemplate.class);

    {
        underTest.setRestTemplate(restTemplate);
    }

    @Test
    public void getCities() throws InterruptedException, ExecutionException, TimeoutException {
        //given
        String arg = "Berlin";
        City[] cities = new City[]{new City()};
        when(restTemplate.getForObject(anyString(), any())).thenReturn(cities);

        //when
        List<City> citieResponse = underTest.queryRemoteService(arg);

        //then
        assertNotNull(citieResponse);
        verify(restTemplate, times(1)).getForObject(anyString(), any());
    }

    @Test(expected = RestClientException.class)
    public void getCitiesWhenServiceIsUnavailable() throws InterruptedException, ExecutionException, TimeoutException {
        //given
        String arg = "Berlin";
        City[] cities = new City[]{new City()};
        when(restTemplate.getForObject(anyString(), any())).thenThrow(new RestClientException("Some problem with rest service"));

        //when
        underTest.queryRemoteService(arg);

        //then
    }
}