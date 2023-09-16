package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("12345", "Ali Gerami ", 5000, 20);
        Employee employee2 = new Employee("67890", "Jane Smith", 6000, 18);

        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);

        SalaryCalculator calculator = new SalaryCalculator();
        Map<String, Double> salaryMap = calculator.calculateSalary(employees);

        for (Map.Entry<String, Double> entry : salaryMap.entrySet()) {
            System.out.println("Employee ID: " + entry.getKey() + ", Net Salary: " + entry.getValue());
        }
    }
}

