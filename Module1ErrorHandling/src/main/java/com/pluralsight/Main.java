package com.pluralsight;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Welcome message
        System.out.println("🎮🎉 ---------- Welcome player!! Let's play the number guessing game!! ---------- 🎉🎮\n");

        //Create a menu prompting user input:
        System.out.println("Choose an option: (1 or 2) ");
        System.out.println("1 - Easy");
        System.out.println("2 - Hard");
        System.out.println("Type option below: "); int choice = scanner.nextInt();

        if (choice == 1) {
            boolean success = false;
            int correctNumber = (int) (Math.random() * 10) + 1; //Generates random number between 1 - 100

            while (!success) {
                try {
                    System.out.print("Pick a number (between #1 - #10): ");
                    int guessedNumber = scanner.nextInt();
                        scanner.nextLine(); // clear newline
                    if (guessedNumber < 1 || guessedNumber > 10) {
                        System.out.println("\nNumber out of range. Pick between 1 and 10.\n");
                        continue;
                    }
                    if (guessedNumber != correctNumber) {
                        if (guessedNumber > correctNumber) {
                            System.out.println("It's to high");
                        }
                        if (guessedNumber < correctNumber) {
                            System.out.println("its to low");
                        }
                        System.out.println("Try it again\n");
                        continue;
                    }
                    System.out.println("\n🎉 You guessed it correct! 🥳🎯");
                    success = true;


                } catch (InputMismatchException e) {
                    System.out.println(" Not a valid number. Please enter digits only.");
                    scanner.nextLine(); // clear invalid input
                } catch (Exception e) {
                    System.out.println("\n⚠️ Something else went wrong: " + e.getMessage());
                    scanner.nextLine();
                }
            }scanner.close();

        }

        if (choice == 2) {
            boolean success = false;
            int correctNumber = (int) (Math.random() * 100) + 1;
            while (!success) {
                try {
                    System.out.print("Pick a number (between #1 - #100): ");
                    int guessedNumber = scanner.nextInt();
                    scanner.nextLine(); // clear newline
                    if (guessedNumber < 1 || guessedNumber > 100) {
                        System.out.println(" Number out of range. Pick between 1 and 100.");
                        continue;
                    }
                    if (guessedNumber != correctNumber) {
                        if (guessedNumber > correctNumber) {
                            System.out.println("It's to high");
                        }
                        if (guessedNumber < correctNumber) {
                            System.out.println("its to low");
                        }
                        System.out.println("Try it again\n");
                        continue;
                    }
                    System.out.println("\n🎉 You guessed it correct! 🥳🎯");
                    success = true;

                } catch (InputMismatchException e) {
                    System.out.println(" Not a valid number. Please enter digits only.");
                    scanner.nextLine(); // clear invalid input
                } catch (Exception e) {
                    System.out.println("\n⚠️ Something else went wrong: " + e.getMessage());
                    scanner.nextLine();
                }
            }scanner.close();
        }
    }
}

