package com.goeuro.service;

import org.springframework.stereotype.Service;

@Service
public class InputValidator {

    public void validateInput(String[] args) {
        if(args.length != 1){
            throw new IllegalArgumentException("Please provide city name. For example: Berlin");
        }
    }
}
