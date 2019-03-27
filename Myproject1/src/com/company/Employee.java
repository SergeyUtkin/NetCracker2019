package com.company;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }


    public String getName() {
        return firstName + " " + lastName;
    }


    public int getID() {
        return id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }

    public int raiseSalary(int percent) {
        return salary * (100 + percent) / 100;
    }

    @Override
    public String toString() {
        String a = "Employee[ID = " + this.id + " , name = " + this.firstName + " " + this.lastName + " , salary = " + this.salary + " ]";
        return a;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + id;
        result = 31 * result + firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + salary;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null) return false;
        if (obj.getClass() != this.getClass()) return false;
        Employee employee = (Employee) obj;
        return employee.getID() == id && employee.getLastName().equals(lastName) && employee.getFirstName().equals(firstName) && employee.getSalary() == salary;

    }
}
