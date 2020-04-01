package com.example.calculation;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator cal = new Calculator();

    @Test
    public void add() {
        int result = cal.add(3,1);
        assertEquals(4, result);
    }

    @Test
    public void subtract(){
        int result = cal.subtract(2,1);
        assertEquals(1, result);
    }
}