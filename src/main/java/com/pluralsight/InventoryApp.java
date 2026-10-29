package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Pattern;

public class InventoryApp {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Product> inventory = loadInventory();

        // Add another product
//        inventory.add(new Product(4569, "Sausage", 50.77));
//        printInventory(inventory);
//
//        printInventory(getInventory());
//
//        printInventory(inventory);

        displayMenu();
    }

    private static void displayMenu() {
        int command = 0;

        while (command != 5) {
            System.out.println("""
                    What do you want to do?: 
                        1 - List all products
                        2 - Lookup a product by its ID
                        3 - Find all products within a price range
                        4 - Add a new product
                        5 - Quit the application
                    Enter command: """);
            command = scanner.nextInt();
            scanner.nextLine();

            switch (command) {
                case 1:
                    System.out.println(loadInventory());
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    printInventory(getInventory());
                    break;
                case 5:
                    break;
                default:
                    break;
            }

        }



    }

    private static ArrayList<Product> loadInventory() {
        ArrayList<Product> inventory = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("inventory.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // read a line into line, then check it isn't null, all in one step
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                //Split it into individual fields using the | character as the delimiter
                String[] fields = line.split(Pattern.quote("|"));

                //fill data into employee object and add to list
                int id = Integer.parseInt(fields[0]);
                String name = fields[1];
                double price = Double.parseDouble(fields[2]);
                Product product = new Product(id, name, price);
                inventory.add(product);
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("There was an error reading the product file. Check the location of the file.");
        }
        return inventory;
    }

    private static void printInventory(ArrayList<Product> inventory) {
        for (Product product : inventory) {
            System.out.println("--------------");
            System.out.println(product);
        }
    }

    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<>();

        inventory.add(new Product(1214, "Butter", 15.99));
        inventory.add(new Product(4561, "Cereal", 100.99));
        inventory.add(new Product(4875, "Beef", 1.99));
        inventory.add(new Product(5226, "Chicken", 9.77));
        inventory.add(new Product(2699, "Bleach", 4.55));

        return inventory;
    }
}
