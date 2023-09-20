package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    // Schreibe einen Test für eine Methode, die die Summe von zwei ganzen Zahlen berechnet.
    @Test
    void sum() {
        //GIVEN
        int number1 = 10;
        int number2 = 20;
        int expect = number1 + number2;
        //WHEN
        int actual = Main.sum(number1,number2);
        //THEN
        assertEquals(expect,actual);
    }

    // Schreibe einen Test für eine Methode, die prüft, ob eine gegebene Zahl gerade ist (even).
    @Test
    void isEven() {
    }

    // Schreibe einen Test für eine Methode, die das Produkt zweier ganzer Zahlen berechnet.
    @Test
    void multiply() {
    }

    // Schreibe einen Test für eine Methode, die eine gegebene Zeichenkette in Großbuchstaben umwandelt.
    @Test
    void textToUpperCase() {
    }

    // Schreibe einen Test für eine Methode, die prüft, ob eine gegebene Zahl positiv ist.
    @Test
    void isNumberPositive() {
    }
}