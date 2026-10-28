package com.pluralsight;

public class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String product, double price) {
        this.id = id;
        this.name = product;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product:     " + name + "\n"
                + "Price:    $" + String.format("%.2f", price) + "\n"
                + "ID: " + id + "\n";
    }
}
