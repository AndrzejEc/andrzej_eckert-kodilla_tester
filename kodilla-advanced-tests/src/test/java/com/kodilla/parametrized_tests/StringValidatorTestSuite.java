package com.kodilla.parametrized_tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class StringValidatorTestSuite {
    private StringValidator validator = new StringValidator();
    @Test
    public void shouldReturnFalseIfStrinfIsNotEmpty(){
        assertFalse(validator.isBlank("test"));
    }
    @Test
    public void shouldReturnTrueIfStringIsEmpty(){
        assertTrue(validator.isBlank(""));
    }
    @Test
    public void shouldReturnTrueIfStringHasOnlySpaces(){
        assertTrue(validator.isBlank("   "));
    }
    @Test
    public void shouldReturnTrueIfStringIsNull(){
        assertTrue(validator.isBlank(null));
    }
    @ParameterizedTest
    @ValueSource(strings = {"","   "})
    public void shouldReturnTrueIfStringIsEmpty(String text){
        assertTrue(validator.isBlank(text));
    }
    @ParameterizedTest
    @NullAndEmptySource
    public void shouldTrueIfStringIsEmpty(String text){
        System.out.println("|" + text + "|");
        assertTrue(validator.isBlank(text));
    }
}