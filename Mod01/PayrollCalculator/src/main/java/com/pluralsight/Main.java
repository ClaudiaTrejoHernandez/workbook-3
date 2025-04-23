package com.pluralsight;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = Reader.readEmployeeListCSV("employees.csv");

        for (Employee e : employees) {

            //5. Display the employee using a printf and by calling the employee's methods
            System.out.println("----------------------------------------------------------------------------");
            System.out.printf("Employee name: %s\nEmployee ID: %d\nEmployee Gross Pay: %.2f\n",
                    e.getName(), e.getEmployeeID(), e.getGrossPay());
        }
    }
}