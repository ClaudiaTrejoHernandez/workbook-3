package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.time.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String timeStamp = now.format(formatter);
        boolean isExited = false;
        String log = "logs.txt";

        System.out.println("Welcome to the Search Engine Logger.\n");

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("log.txt", true));

            bufferedWriter.write(timeStamp + " Launch\n");

            while (!isExited) {

                System.out.println("Please enter your search term ('x' to exit): ");             //prompt user for a search term they wish to search:
                String searchTerm = read.nextLine();

                if (searchTerm.equalsIgnoreCase("x")) {
                    bufferedWriter.write(timeStamp + " Exit\n");
                    isExited = true;
                } else {
                    bufferedWriter.write(timeStamp + " Search: " + searchTerm + "\n");
                }
            }
            bufferedWriter.close();

        } catch (Exception e) {
            String errorTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            System.out.println(errorTime + " Unexpected error occurred: " + e.getMessage());
        }

    }

}