package com.pluralsight;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("---------- Welcome to Bedtime Stories! ----------\n");
        System.out.println("Choose a book to read: ");
        System.out.println("Goldilocks and The Three Bears");
        System.out.println("Hansel and Gretel");
        System.out.println("Mary had a Little Lamb\n");
        System.out.println("Type the title below: ");
        String bookChoice = read.nextLine();

        int command = 0;

            if (bookChoice.equalsIgnoreCase("goldilocks and the three bears")) {
                MenuOptions.readGoldilocks();
            }
            if (bookChoice.equalsIgnoreCase("hansel and gretel")) {
                MenuOptions.readHansel();
            }
            if (bookChoice.equalsIgnoreCase("mary had a little lamb")) {
                MenuOptions.readMary();
            }

        }
    }


    //BufferedReader is much faster than using Scanner(fis)
    //BufferedReader and Scanner are used to read txt. and files
    //BufferedReader MUST have \n or \r at the end of it!!!