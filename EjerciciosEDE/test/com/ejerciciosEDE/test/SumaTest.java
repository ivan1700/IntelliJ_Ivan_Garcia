package com.ejerciciosEDE.test;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
//EJERCICIO 1
public class SumaTest {
    private Suma Sumar;

    @org.junit.Test
    public void sumarPositivos() {
        int n1 =1;
        int n2 = 2;
        int expected =3;
        this.Sumar=new Suma(n1,n2);
        int actual=this.Sumar.sumar();
        assertEquals(expected,actual);
    }
    @Test
     public void sumarNegativos(){
        int n1=-1;
        int n2=-2;
        int expected =-3;
        this.Sumar=new Suma(n1,n2);
        int actual=this.Sumar.sumar();
        assertEquals(expected,actual);
     }
    @Test
     public void sumarNegativoYPositivo(){
        int n1=3;
        int n2=-2;
        int expected =1;
        this.Sumar=new Suma(n1,n2);
        int actual=this.Sumar.sumar();
        assertEquals(expected,actual);
     }
}