package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {
    private UserValidator userValidator = new UserValidator();
    @ParameterizedTest
    @ValueSource (strings = {"Andy","aaaaaa", "blabla","...","A00","A-a",".-_"})
    public void shouldReturnTrueIfUserNameIsOK(String userName){
        boolean result = userValidator.validateUserName(userName);
        assertTrue(result);
    }
    @ParameterizedTest
    @ValueSource (strings = {"A","", "^%^","   ","//","Andy?","A&a","(0)","/Aa"})
    public void shouldReturnFalseIfUserNameIsNotOK(String userName){
        boolean result = userValidator.validateUserName(userName);
        assertFalse(result);
    }
    @ParameterizedTest
    @ValueSource (strings = {"andrzej@gmail.com","user@mail.eu","user@work.biz","user@work.aa"})
    public void shouldReturnTrueIfMailIsValid(String mail){
        boolean result = userValidator.validateEmail(mail);
        assertTrue(result);
    }
    @ParameterizedTest
    @ValueSource (strings = {"andrzej@gmail,com","andrzej$mail.com","andrzejmailcom","andrzej@mail","user@biz"})
    public void shouldReturnFalseIfMailIsInvalid(String mail){
        boolean result = userValidator.validateEmail(mail);
        assertFalse(result);
    }
}