package com.pluralsight;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class MenuOptions {

    public static void readGoldilocks() {
        try {
            FileInputStream fis = new FileInputStream("goldilocks.txt");
            System.out.println("\nPress Enter to begin reading...");
            new Scanner(System.in).nextLine();
            Scanner read = new Scanner(fis);

            String input;
            int lineNumber = 1;

            while (read.hasNextLine()) {
                input = read.nextLine();
                if (input.isEmpty()) {
                    System.out.println(lineNumber++ + ". ");
                    continue;
                }
                System.out.println(lineNumber + ". " + input);
                lineNumber++;

            }read.close();

        } catch (
                IOException e) {
            e.printStackTrace();
        }

    }

    public static void readHansel() {
        try {
            FileInputStream fis = new FileInputStream("hansel_and_gretel.txt");
            System.out.println("\nPress Enter to begin reading...");
            new Scanner(System.in).nextLine();
            Scanner read = new Scanner(fis);

            String input;
            int lineNumber = 1;

            while (read.hasNextLine()) {
                input = read.nextLine();
                if (input.isEmpty()) {
                    System.out.println(lineNumber++ + ". ");
                    continue;
                }
                System.out.println(lineNumber + ". " + input);
                lineNumber++;
            }read.close();

        } catch (
                IOException e) {
            e.printStackTrace();
        }

    }

    public static void readMary() {
        try {
            FileInputStream fis = new FileInputStream("mary_had_a_little_lamb.txt");
            System.out.println("\nPress Enter to begin reading...");
            new Scanner(System.in).nextLine();
            Scanner read = new Scanner(fis);

            String input;
            int lineNumber = 1;

            while (read.hasNextLine()) {
                input = read.nextLine();
                if (input.isEmpty()) {
                    System.out.println(lineNumber++ + ". ");
                    continue;
                }
                System.out.println(lineNumber + ". " + input);
                lineNumber++;
            }
            read.close();
        } catch (
                IOException e) {
            e.printStackTrace();
        }

    }
}
