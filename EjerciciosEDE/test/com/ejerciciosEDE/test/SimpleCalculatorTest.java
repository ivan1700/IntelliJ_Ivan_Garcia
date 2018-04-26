package com.ejerciciosEDE.test;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
//EJERCICIO 2
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
        float n1=7;
        float n2=6;
        float expected=1;
        float actual=this.calculator.subtract(n1,n2);
        assertEquals(expected,actual,0.000);
    }

    @Test
    public void multiply() {
        float n1=7;
        float n2=6;
        float expected=42;
        float actual=this.calculator.multiply(n1,n2);
        assertEquals(expected,actual,0.000);
    }

    @Test
    public void divide() {
        float n1=7;
        float n2=6;
        float expected=(float)1.1666666269302368;
        float actual=this.calculator.divide(n1,n2);
        assertEquals(expected,actual,0.00);
    }

    //No se puede dividir por cero. Por lo que será siempre error.
    @Test
    public void divide2(){
        float n1=7;
        float n2=0;
        float expected=1;
        float actual=this.calculator.divide(n1,n2);
        assertEquals(expected,actual,0.00);
    }

    //Ejercicio 4
    @Test
    public void isEvenNumber(){
        int number=2;
        boolean actual=this.calculator.isEvenNumber(number);
        assertTrue("Es false debido a que el número es impar",actual);
    }
}