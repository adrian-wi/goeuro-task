package com.goeuro.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class InputValidatorTest {

    @Test
    public void testCorrectInputValidation(){
        //given
        InputValidator underTest = new InputValidator();
        String[] input = new String[] {"Berlin"};

        //when
        underTest.validateInput(input);

        //then
        assertTrue(true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIncorrectInputValidation(){
        //given
        InputValidator underTest = new InputValidator();
        String[] input = new String[] {"Berlin","Waraszawa"};

        //when
        underTest.validateInput(input);

        //then
    }
}