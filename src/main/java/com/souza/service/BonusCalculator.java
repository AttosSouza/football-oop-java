package main.java.com.souza.service;

import main.java.com.souza.model.Employee;

public class BonusCalculator {
    public static void calculateBonus(Employee employee) {
        double bonus  = employee.bonusCalculator();
        System.out.println("Person: " + employee.getName());
        System.out.println("Salary: " + "$" + employee.getSalary());
        System.out.println("The salary with the bonus added: " + "$" + bonus);
    }
}
