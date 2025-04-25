package com.pluralsight;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileWriter;

public class CSVExporter {

    //Section 2-1: Writing to Files - Exercise 1
    public static Scanner scanner = new Scanner(System.in);
    private List<Employee> employeeList = new ArrayList<>();
    private String inputFile;
    private String outputFile;


    public void run() {
        inputFileSelection();     // Ask user for input file
        outputFileName();         // Ask for output file
        exportNewCSV();           // Write to output file
    }

    //Populate employeeList
    public void setEmployeeList(List<Employee> employees) {
        this.employeeList = employees;
    }

    //Prompt user for file name to read from
    public void inputFileSelection() {

        while (true) {
            System.out.println("Enter the name of the file to process (must be a .csv file): ");
            inputFile = scanner.nextLine();

                if (!inputFile.endsWith(".csv")) {
                    System.out.println("Invalid file type. Please try again");
                    continue;
                }

                File file = new File(inputFile);
                if (!file.exists() || !file.isFile()) {
                    System.out.println("File does not exist. Plese try again");

                }else {
                    break;
                }

            }
        }


        //Prompt user for new file name to print out employee ID, Name, and Gross Pay
        public void outputFileName() {
            System.out.println("Enter the name of the payroll file to create: (ie: 'payroll-sept-2023.csv' ");
            outputFile = scanner.nextLine();

        }

        //Export information read to new .csv file
        public void exportNewCSV() {
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFile));
                bufferedWriter.write("Id|Name|Gross Pay\n");
                for (Employee e : employeeList){
                    bufferedWriter.write(String.format("%d|%s|%.2f\n", e.getEmployeeID(), e.getName(), e.getGrossPay()));
                }
                System.out.println("Payroll exported to new .csv file: " + outputFile);


            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

    }



