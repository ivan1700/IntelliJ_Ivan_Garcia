package com.JUnit.intellij.test;

import org.junit.*;
import sun.java2d.pipe.SpanShapeRenderer;

import static org.junit.Assert.*;

public class SimpleCalculatorTest {
    private SimpleCalculator calculator;
    @Before
    public void setUp() throws Exception {
        this.calculator=new SimpleCalculator();
    }

    @Test
    public void add() {

    }

    @Test
    public void subtract() {

    }
    @BeforeClass
    public static void antes(){
        System.out.println("c comenzó");

    }
    @AfterClass
    public static void despues(){
        System.out.println("c acavó");
    }

    @Test
    public void testCompararStringArray() {
        String[] arrayEsperado = {"uno", "dos", "tres"};
        String[] arrayPrueba = {"uno", "dos", "tres"};
        Assert.assertArrayEquals(arrayEsperado, arrayPrueba);
    }

    @Test
    public void testComprarIgual() {
        Assert.assertEquals(1, Integer.parseInt("1"));
    }
    @Test(timeout=100)
    public void nombreTest (){
        Integer i = 0;
        while(100000 > i){
            i ++;
        }
        System.out.println("Termino");
    }

    @Test
    public void divide() {
    }

    @Test(expected = Exception.class)
    public void testExcepcion(){
        Integer.parseInt("s");
    }
}