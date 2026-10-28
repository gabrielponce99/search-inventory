package com.pluralsight;

import java.util.ArrayList;

public class InventoryApp {
    public static void main(String[] args) {
        ArrayList<Product> inventory = InventoryApp.getInventory();
        printInventory(inventory);
        inventory.add(new Product(4569, "Sausage", 50.77));

        printInventory(inventory);
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
