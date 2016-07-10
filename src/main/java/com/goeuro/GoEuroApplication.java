package com.goeuro;

import com.goeuro.domain.City;
import com.goeuro.service.CityLocationService;
import com.goeuro.service.CsvWriterService;
import com.goeuro.service.InputValidator;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.List;

@SpringBootApplication
@EnableAsync
public class GoEuroApplication implements CommandLineRunner {

    private static final Logger LOGGER = Logger.getLogger(GoEuroApplication.class);
    @Autowired
    private CityLocationService cityLocationService;
    @Autowired
    private CsvWriterService csvWriterService;
    @Autowired
    private InputValidator inputValidator;

    @Override
    public void run(String... args) {
        try {
            inputValidator.validateInput(args);
            List<City> cities = cityLocationService.queryRemoteService(args[0]);
            csvWriterService.write(cities);
        } catch (Exception ex) {
            LOGGER.info("The following problem occurred:" + ex.getMessage(), ex);
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(GoEuroApplication.class, args);
    }
}
