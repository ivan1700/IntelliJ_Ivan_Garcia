package com.ejerciciosEDE.test;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeTest {
    private Employee Employee0 = new Employee(1,"Marina",30000);
    public void nopmbreConMayorSalario(){
        String s1="Marina";
        String expected="Marina";
    }
    //Ejercicio 3
    @Test
    public void getEmpNameWithHighestSalary(){
        String expected="Marina";
        String actual=Employee.getEmpNameWithHighestSalary();
        assertEquals(expected,actual);
    }
    @Test
    public void getHighestPaidEmployee(){
        assertEquals(Employee0,Employee.getHighestPaidEmployee());
    }

    @Test
    public void getName(){
        String nombre="Ivan";
        String expected=Employee0.getName();
        assertEquals(nombre,expected);
    }

    @Test
    public void getSalary(){
        int salario=1;
        int expected=Employee0.getSalary();
        assertEquals(salario,expected);
    }

    @Test
    public void getEmpId(){
        int id=0;
        int expected=Employee0.getEmpId();
        assertEquals(expected,id);
    }

    @Test
    @Ignore
    public void getEmpId2(){
        int id=0;
        int expected=Employee0.getEmpId();
        assertEquals(expected,id);
    }



    //Ejercicio 5
    @Test
    public void getPropValue0(){
        String key="key3";
        String expected="engreido";
        String actual=Employee0.getPropValue(key);
        assertNotNull("No existe esa key",actual);
    }

    @Test
    public void getPropValue1(){
        String key="key9";
        String actual=Employee0.getPropValue(key);
        assertNotNull("No existe esa key",actual);
    }

    @Test
    public void getPropValue2(){
        String key=Employee0.getPropValue("key2");
        String keyAComparar=Employee0.getPropValue("key1");
        assertEquals(key,keyAComparar);
    }

    @Test
    public void getPropValue3(){
        String key=Employee0.getPropValue("key4");
        String keyAComparar=Employee0.getPropValue("key2");
        assertEquals(key,keyAComparar);
    }
}