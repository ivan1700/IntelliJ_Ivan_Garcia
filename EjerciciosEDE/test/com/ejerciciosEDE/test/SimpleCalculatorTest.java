package com.ejerciciosEDE.test;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleCalculatorTest {
    private SimpleCalculator calculator;
    @Before
    public void setUp(){this.calculator= new SimpleCalculator();}
    @Test
    public void add() {
        float n1=7;
        float n2=6;
        float expected=13;
        float actual=this.calculator.add(n1,n2);
        assertEquals(expected,actual,0.000);
    }

    @Test
    public void subtract() {
    }

    @Test
    public void multiply() {
    }

    @Test
    public void divide() {
    }
}