package com.ejerciciosEDE.test;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
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

    //Ejercicio 6
    @Test
    public void povOf2_0(){
        int number=0;
        int expected=1;
        String actual=(calculator.povOf2(number));
        assertEquals(expected,Integer.parseInt(actual));
    }

    @Test
    public void povOf2_1(){
        int number=1;
        int expected=2;
        String actual=(calculator.povOf2(number));
        assertSame(expected,Integer.parseInt(actual));
    }

    @Test
    public void povOf2_2(){
        int number=5;
        int expected=34342;
        String actual=(calculator.povOf2(number));
        assertNotSame(expected,Integer.parseInt(actual));
    }

    @Test
    public void povOf2_3(){
        int number=6;
        int expected=64;
        String actual=(calculator.povOf2(number));
        assertThat(Integer.parseInt(actual), is(expected));
    }

    @Test
    public void povOf2_4(){
        int number=100;
        int expected=0;
        String actual=(calculator.povOf2(number));
        assertNotEquals(expected,actual);
    }

}