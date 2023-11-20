package com.xyzcorp;

/**
 * Runner Application
 * @author Daniel Hinojosa
 */
public class Runner extends Object {
    public static void main(String[] args) {
        System.out.println("Creating an Employee");
        Employee employee = new Employee("Carlos", "Esquivel");
        System.out.printf("Created Employee: %s%n", employee);
    }
}