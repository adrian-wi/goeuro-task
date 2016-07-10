package com.goeuro.service;

import com.goeuro.domain.City;
import com.goeuro.domain.transfer.CityDto;
import com.goeuro.mapper.CityToCityDtoMapper;
import com.opencsv.bean.BeanToCsv;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static com.goeuro.CityUtil.prepareCities;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;

public class CsvWriterServiceTest {

    private CsvWriterService underTest = new CsvWriterService();
    private CityToCityDtoMapper mapper = mock(CityToCityDtoMapper.class);
    private BeanToCsv beanToCsv = mock(BeanToCsv.class);

    @Test
    public void testCsvWrite() throws IOException {
        //given
        underTest.setMapper(mapper);
        underTest.setBeanToCsv(beanToCsv);
        List<City> cities = prepareCities();


        //when
        when(mapper.map(any())).thenReturn(new CityDto());
        underTest.write(cities);

        //then
        verify(mapper, times(2)).map(any());
        verify(beanToCsv,times(1));
    }
}