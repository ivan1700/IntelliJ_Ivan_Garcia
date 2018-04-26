package com.ejerciciosEDE.test;

import java.util.HashMap;
import java.util.Map;

public class Employee {
    private String name;
    private int empId;
    private int salary;
    public Employee(int id, String name, int sal){
        this.empId = id;
        this.name = name;
        this.salary = sal;
    }
    public boolean equals(Object obj){
        Employee emp = (Employee) obj;
        boolean status = false;
        if(this.name.equalsIgnoreCase(emp.name)
                && this.empId == emp.empId
                && this.salary == emp.salary){
            status = true;
        }
        return status;
    }
    public static String getEmpNameWithHighestSalary(){
        return "Marina";
    }
    public static Employee getHighestPaidEmployee(){
        return new Employee(1, "Marina", 30000);
    }
    public int hashCode(){
        return this.empId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPropValue(final String key){
        Map appProps = new HashMap();
        appProps.put("key1", "engreido");
        appProps.put("key2", "humilde");
        appProps.put("key3", "honesto");
        appProps.put("key4", "humilde");
        return (String) appProps.get(key);
    }


}