package com.pluralsight;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {

            ArrayList<Product> inventory = new ArrayList<>();

                Product p0 = new Product(1000, "Headphones", 150.00f);
                Product p1 = new Product(1001, "Bicycle", 75.00f);
                Product p2 = new Product(1002, "Lamp", 25.00f);
                Product p3 = new Product(1003, "Lenovo Laptop", 550.00f);
                Product p4 = new Product(1004, "Desk Chair", 280.00f);

                inventory.add(p0);
                inventory.add(p1);
                inventory.add(p2);
                inventory.add(p3);
                inventory.add(p4);

        System.out.println("We carry the following inventory:\n ");

        for (int i = 0; i < inventory.size(); i++){
            Product p = inventory.get(i);
            System.out.printf("ID: %d|Name: %s|Price: $.2f\n",
                    p.getId(), p.getProductName(), p.getPrice());
        }
    }
}
