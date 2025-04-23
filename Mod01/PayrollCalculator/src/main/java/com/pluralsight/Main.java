package com.pluralsight;
import java.io.PrintStream;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = Reader.readEmployeeListCSV("employees.csv");

        for (Employee e : employees) {

            System.out.println("----------------------------------------------------------------------");
            System.out.printf("Employee name: %s\nEmployee ID: %d\nEmployee Gross Pay: %2f\n",
                    e.getName(), e.getEmployeeID(), e.getGrossPay());
        }
    }
}