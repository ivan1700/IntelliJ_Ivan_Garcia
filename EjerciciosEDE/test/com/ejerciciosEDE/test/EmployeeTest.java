package com.ejerciciosEDE.test;

import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTest {
    private Employee Employee = new Employee(1700,"Ivan",1800);
    public void nopmbreConMayorSalario(){
        String s1="Marina";
        String expected="Marina";
    }
    @Test
    public void getPropValue0(){
        String key="key3";
        String expected="engreido";
        String actual=Employee.getPropValue(key);
        assertNotNull("No existe esa key",actual);
    }

    @Test
    public void getPropValue1(){
        String key="key9";
        String actual=Employee.getPropValue(key);
        assertNotNull("No existe esa key",actual);
    }

    @Test
    public void getPropValue2(){
        String key=Employee.getPropValue("key2");
        String keyAComparar=Employee.getPropValue("key1");
        assertEquals(key,keyAComparar);
    }

    @Test
    public void getPropValue3(){
        String key=Employee.getPropValue("key4");
        String keyAComparar=Employee.getPropValue("key2");
        assertEquals(key,keyAComparar);
    }
}