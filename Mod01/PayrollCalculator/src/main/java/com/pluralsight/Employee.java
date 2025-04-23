package com.pluralsight;

public class Employee {

    //Private data members (attributes)
    private int employeeID;
    private String name;
    private double hoursWorked;
    private double payRate;

    public double grossPay;


    //Methods

    //Parameterized constructor
    public Employee(int employeeID, String name, double hoursWorked, double payRate) {
        this.employeeID = employeeID;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;

    }
    //Getter for EmployeeID:
    public int getEmployeeID() {
        return employeeID;
    }

    //Getters and Setters for attributes

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getGrossPay(){
        return grossPay = this.hoursWorked * this.payRate;

    }

}
