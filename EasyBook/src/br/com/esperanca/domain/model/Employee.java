package br.com.esperanca.domain.model;

import br.com.esperanca.domain.Enums.EmployeeType;

public abstract class Employee {


    private String id;
    private String name;
    private double salary;
    private EmployeeType employeeType;

    public Employee() {
    }

    public Employee(String id, String name, double salary, EmployeeType employeeType) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.employeeType = employeeType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
