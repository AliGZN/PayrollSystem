package org.example;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class SalaryCalculator {
    public double calculateSalary(Employee employee) {
        double taxAmount = calculateTax(employee);
        double netSalary = employee.getSalary() - taxAmount;
        return netSalary;
    }

    private double calculateTax(Employee employee) {
        double taxAmount = employee.getSalary() * (employee.getTaxRate() / 100);
        return taxAmount;
    }

    public Map<String, Double> calculateSalary(List<Employee> employees) {
        Map<String, Double> salaryMap = new HashMap<>();
        for (Employee employee : employees) {
            double netSalary = calculateSalary(employee);
            salaryMap.put(employee.getNationalId(), netSalary);
        }
        return salaryMap;
    }
}