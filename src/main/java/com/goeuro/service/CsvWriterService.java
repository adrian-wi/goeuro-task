package com.goeuro.service;

import com.goeuro.domain.City;
import com.goeuro.domain.transfer.CityDto;
import com.goeuro.mapper.CityToCityDtoMapper;
import com.opencsv.CSVWriter;
import com.opencsv.bean.BeanToCsv;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CsvWriterService {

    @Autowired
    private CityToCityDtoMapper mapper;
    @Autowired
    private BeanToCsv<CityDto> beanToCsv;

    public void write(List<City> cities) throws IOException {

        CSVWriter writer = new CSVWriter(new FileWriter("cities.csv", false), ',');

        List<CityDto> cityDtos = mapToCityDto(cities);

        ColumnPositionMappingStrategy<CityDto> mappingStrategy = prepareColumnMappingStrategy();
        beanToCsv.write(mappingStrategy, writer, cityDtos);

        writer.close();
    }

    private List<CityDto> mapToCityDto(List<City> cities) {
        return cities.stream().map(el -> mapper.map(el)).collect(Collectors.toList());
    }

    private ColumnPositionMappingStrategy<CityDto> prepareColumnMappingStrategy() {
        ColumnPositionMappingStrategy<CityDto> mappingStrategy = new ColumnPositionMappingStrategy<>();
        mappingStrategy.setType(CityDto.class);
        String[] columns = new String[]{"id", "key", "name", "fullName", "iataAirportCode", "type", "country", "latitude", "longitude", "locationId", "inEurope", "countryCode", "coreCountry", "distance", "names", "alternativeNames"};
        mappingStrategy.setColumnMapping(columns);
        return mappingStrategy;
    }

    void setMapper(CityToCityDtoMapper mapper) {
        this.mapper = mapper;
    }

    public void setBeanToCsv(BeanToCsv<CityDto> beanToCsv) {
        this.beanToCsv = beanToCsv;
    }
}
