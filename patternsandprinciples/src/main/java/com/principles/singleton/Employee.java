package com.principles.singleton;

public class Employee {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class SalaryCalculator {

    public void calculateSalary(Employee employee) {

    }

}

class EmployeeRepository{

    public void save(Employee employee) {

    }

}
