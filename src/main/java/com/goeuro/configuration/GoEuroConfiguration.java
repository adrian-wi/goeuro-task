package com.goeuro.configuration;

import com.opencsv.bean.BeanToCsv;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GoEuroConfiguration {
    @Bean
    public BeanToCsv beanToCsvService() {
        return new BeanToCsv<>();
    }
}
