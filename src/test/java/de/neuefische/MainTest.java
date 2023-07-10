package de.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void shouldReturnFalseWhenPasswordIsShorterThan8(){
        //GIVEN
        String password = "zuKurz";
        //WHEN
        boolean actual = Main.checkLength(password);
        //THEN
        assertFalse(actual);
    }

    @Test
    void shouldReturnTrueWhenPasswordIsLongerThan7(){
        //GIVEN
        String password = "NichtZuKurz";
        //WHEN
        boolean actual = Main.checkLength(password);
        //THEN
        assertTrue(actual);
    }


    @Test
    void shouldReturnTrueWhenPasswordContainsNumber(){
        //GIVEN
        String password = "zuKurz88";
        //WHEN
        boolean actual = Main.containsNumber(password);
        //THEN
        assertTrue(actual);
    }

    @Test
    void shouldReturnFalseWhenPasswordDidntContainsNumber(){
        //GIVEN
        String password = "zuKurz";
        //WHEN
        boolean actual = Main.containsNumber(password);
        //THEN
        assertFalse(actual);
    }

    @Test
    void shouldReturnFalseWhenPasswordDidntContainsUppercaseLetter(){
        //GIVEN
        String password = "z";
        //WHEN
        boolean actual = Main.containsUppercase(password);
        //THEN
        assertFalse(actual);
    }

    @Test
    void shouldReturnTrueWhenPasswordContainsUppercaseLetter(){
        //GIVEN
        String password = "Z";
        //WHEN
        boolean actual = Main.containsUppercase(password);
        //THEN
        assertTrue(actual);
    }

    @Test
    void shouldReturnFalseWhenPasswordContainsOnlyNumbers(){
        //GIVEN
        String password = "6514547";
        //WHEN
        boolean actual = Main.containsUppercase(password);
        //THEN
        assertFalse(actual);
    }

    @Test
    void shouldReturnTrueWhenPasswordContainsLowercaseLetter(){
        //GIVEN
        String password = "z";
        //WHEN
        boolean actual = Main.containsLowercase(password);
        //THEN
        assertTrue(actual);
    }

    @Test
    void shouldReturnFalseWhenPasswordContainsNoLowercaseLetter(){
        //GIVEN
        String password = "Z";
        //WHEN
        boolean actual = Main.containsLowercase(password);
        //THEN
        assertFalse(actual);
    }

    @Test
    void shouldReturnTrueWhenPasswordIsOnForbiddenList(){
        //GIVEN
        String password = "aD12345678";
        //WHEN
        boolean actual = Main.isForbidden(password);
        //THEN
        assertTrue(actual);
    }
    @Test
    void shouldReturnFalseWhenPasswordIsNotOnForbiddenList(){
        //GIVEN
        String password = "Hl<jksefhlesdhlsohfgolsd1";
        //WHEN
        boolean actual = Main.isForbidden(password);
        //THEN
        assertFalse(actual);
    }


    @Test
    void shouldValidateWhenPasswordIsLongerThan7AndContainsADigitAndContainsUpperCaseAndLowerCaseAndIsNotOnForbiddenList(){
        //GIVEN
        String password = "NichtZuKurz8";
        //WHEN
        boolean actual = Main.validatePassword(password);
        //THEN
        assertTrue(actual);
    }

    @Test
    void shouldNotValidateWhenPasswordIsLongerThan7AndContainsADigitAndContainsUpperCaseAndLowerCaseAndIsOnForbiddenList(){
        //GIVEN
        String password = "Passwort123";
        //WHEN
        boolean actual = Main.validatePassword(password);
        //THEN
        assertFalse(actual);
    }
    @Test
    void shouldNotValidateWhenPasswordIsLongerThan7AndContainsADigitAndContainsUpperCaseAndNoLowerCaseAndIsNotOnForbiddenList(){
        //GIVEN
        String password = "NICHTZUKURZ8";
        //WHEN
        boolean actual = Main.validatePassword(password);
        //THEN
        assertFalse(actual);
    }

    @Test
    void shouldNotValidateWhenPasswordIsLongerThan7AndContainsADigitAndContainsNoUpperCaseAndLowerCaseAndIsNotOnForbiddenList(){
        //GIVEN
        String password = "nichtzukurz8";
        //WHEN
        boolean actual = Main.validatePassword(password);
        //THEN
        assertFalse(actual);
    }
    @Test
    void shouldNotValidateWhenPasswordIsLongerThan7AndContainsNoDigitAndContainsUpperCaseAndLowerCaseAndIsNotOnForbiddenList(){
        //GIVEN
        String password = "nichtzuKurz";
        //WHEN
        boolean actual = Main.validatePassword(password);
        //THEN
        assertFalse(actual);
    }

    @Test
    void shouldNotValidateWhenPasswordIsShorterThan7AndContainsDigitAndContainsUpperCaseAndLowerCaseAndIsNotOnForbiddenList(){
        //GIVEN
        String password = "nI8";
        //WHEN
        boolean actual = Main.validatePassword(password);
        //THEN
        assertFalse(actual);
    }


}