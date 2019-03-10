package com.company;

public class Employee {
    private int id ;
    private  String firstName;
    private  String lastName;
    private  int salary;

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

    public int getAnnualSalary(){
        return salary*12;
    }
    public int raiseSalary(int percent){
        return salary*(100+percent)/100;
    }
    @Override
    public String toString(){
        String a="Employee[ID = " + this.id + " , name = " + this.firstName + " " + this.lastName+ " , salary = " + this.salary +  " ]";
        return a;
    }
}
