package org.example;

import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    // Schreibe einen Test für eine Methode, die die Summe von zwei ganzen Zahlen berechnet.
    @Test
    void sum() {
        //GIVEN
        int number1 = 10;
        int number2 = 20;
        int expect = 30;
        //WHEN
        int actual = Main.sum(number1,number2);
        //THEN
        assertEquals(expect,actual);
    }

    // Schreibe einen Test für eine Methode, die prüft, ob eine gegebene Zahl gerade ist (even).
    @Test
    void isEven() {
        //GIVEN
        int number = 4;
        boolean expect = true;
        //WHEN
        boolean actual = Main.isEven(number);
        //THEN
        assertEquals(expect,actual);
    }

    // Schreibe einen Test für eine Methode, die das Produkt zweier ganzer Zahlen berechnet.
    @Test
    void multiply() {
        int number1 = 15;
        int number2 = 16;
        int expect = 240;
        //WHEN
        int actual = Main.multiply(number1,number2);
        //THEN
        assertEquals(expect,actual);
    }

    // Schreibe einen Test für eine Methode, die eine gegebene Zeichenkette in Großbuchstaben umwandelt.
    @Test
    void textToUpperCase() {
        //GIVEN
        String letter= "hello";
        String expected= "HELLO";
        //WHEN
        String actual= Main.textToUpperCase(letter);
        //THEN
        assertEquals(expected,actual);
    }

    // Schreibe einen Test für eine Methode, die prüft, ob eine gegebene Zahl positiv ist.
    @Test
    void isNumberPositive() {
        //GIVEN
        int number = 6;
        boolean expected = true;
        //WHEN
        boolean actual = Main.isNumberPositive(number);
        //THEN
        assertEquals(expected,actual);
    }
}