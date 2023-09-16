package org.example;

class Employee {
    private String nationalId;
    private String name;
    private double salary;
    private double taxRate;

    public Employee(String nationalId, String name, double salary, double taxRate) {
        this.nationalId = nationalId;
        this.name = name;
        this.salary = salary;
        this.taxRate = taxRate;
    }

    public String getNationalId() {
        return nationalId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public double getTaxRate() {
        return taxRate;
    }
}