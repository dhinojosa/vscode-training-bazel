package com.xyzcorp;

public class Employee extends Object {
    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString() {
        return String.format("Employee {firstName = %s, lastName = %s}", firstName, lastName);
    }

}
