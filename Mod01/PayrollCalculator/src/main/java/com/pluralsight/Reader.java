package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reader {

    public static Scanner read = new Scanner(System.in);

    //1. Load the file using a FileReader object
    public static List<Employee> readEmployeeListCSV(String fileName) {
        List<Employee> employeeList = new ArrayList<>();

        System.out.println("-------------------All Employees added to the Employee List-------------------");

        try {
            BufferedReader bufReader = new BufferedReader(new FileReader("employees.csv"));
            bufReader.readLine(); //skip header
            String line;

            //2. Read each line of text
            while ((line = bufReader.readLine()) != null) {
                //3. Split it into individual fields using the | character as the delimiter
                String[] parts = line.split("\\|");

                //4. Copy the values from the tokens array into variables that match the data
                if (parts.length == 4) {
                    int employeeID = Integer.parseInt(parts[0]);
                    String name = parts[1];
                    double hoursWorked = Double.parseDouble(parts[2]);
                    double payRate = Double.parseDouble(parts[3]);

                    // and then use them to create a new Employee object
                // 6. Repeat for each line in the input file
                    Employee e = new Employee(employeeID, name, hoursWorked, payRate);
                    employeeList.add(e);
                    System.out.println(e.getName() + " was added to the list.");
                }
            }

        }

        catch (IOException e) {
            throw new RuntimeException(e);
        }
        return employeeList;
    }

}

