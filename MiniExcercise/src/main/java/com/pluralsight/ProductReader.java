package com.pluralsight;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductReader {

    public static Scanner reader = new Scanner(System.in);

    //Static = generic method that can be used for any CSV file
    //We expect back a list of products:
    //Write the return at the end
    public static List<Product> readProductFromCSV(String fileName) {

        //Method name: what do I return
        List<Product> productList = new ArrayList<>();

        //Pseudocode is braking a problem down in steps in plain English:

        //Step 0 -Try/catch necessary
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader reader = new BufferedReader(fileReader);

            // Skip the first line (it contains column names like id,name,price,stock)
            reader.readLine();
            String line;

            //Step 1 - Read the file

            // Read each remaining line in the file
            while ((line = reader.readLine()) != null) {
                // Split the line into parts, using comma as the separator
                String[] parts = line.split(",");
                // Check if the line has exactly 4 parts (id, name, price, stock)
                if (parts.length == 4) {

                    //Step 2 - Store the data internally into variables

                    int id = Integer.parseInt(parts[0]);        // Convert the first part to an integer (ID)
                    String name = parts[1];                     // Get the name as text
                    double price = Double.parseDouble(parts[2]); // Convert price to a decimal number
                    int stock = Integer.parseInt(parts[3]);     // Convert stock to an integer
                    // Create a new Product object using the parts (name it anything: p is fine)

                    //Step 3 - Create a product

                    Product p = new Product(id, name, price, stock);            //Parsing needs to happen BEFORE we store it
                    // Add the product to the list


                    productList.add(p);
                    System.out.println(p.getName() + " was added to the list");
                }


            }reader.close();

            //Display stack trace if there was an error
        } catch (IOException e) {
            System.out.println("Something went wrong while reading this file.");
            //You could also use e.printStackTrace(); to print out what the error was
        }
        return productList;

    }

}




