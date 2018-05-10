package com.ejerciciosEDE.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void MainTest0(){
        String cadena= "";
        List<String> esperado = Main.captureItemsBetweenDashes(cadena);
        List<String> actual= new ArrayList<>();
        assertEquals(esperado,actual);
    }

    @Test
    public void MainTest1(){
        String cadena= "-";
        List<String> esperado = Main.captureItemsBetweenDashes(cadena);
        List<String> actual= new ArrayList<>();
        assertEquals(esperado,actual);
    }
    @Test
    public void MainTest2(){
        String cadena= "--";
        List<String> esperado = Main.captureItemsBetweenDashes(cadena);
        List<String> actual= new ArrayList<>();
        assertEquals(esperado,actual);
    }
    @Test
    public void MainTest3(){
        String cadena= "-1-";
        List<String> esperado = Main.captureItemsBetweenDashes(cadena);
        List<String> actual= new ArrayList<>();
        actual.add("1");
        assertEquals(esperado,actual);
    }
    @Test
    public void MainTest4(){
        String cadena= "-1--";
        List<String> esperado = Main.captureItemsBetweenDashes(cadena);
        List<String> actual= new ArrayList<>();
        actual.add("1");
        assertEquals(esperado,actual);
    }
    @Test
    public void MainTest5(){
        String cadena= "1-aaa-3";
        List<String> esperado = Main.captureItemsBetweenDashes(cadena);
        List<String> actual= new ArrayList<>();
        actual.add("aaa");
        assertEquals(esperado,actual);
    }
    @Test
    public void MainTest6(){
        String cadena= "-1-aaa-3-";
        List<String> esperado = Main.captureItemsBetweenDashes(cadena);
        List<String> actual= new ArrayList<>();
        actual.add("1");
        actual.add("3");
        assertEquals(esperado,actual);
    }
}