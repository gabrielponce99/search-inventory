package com.pluralsight;

public class Product {
    private int id;
    private String product;
    private double price;

    public Product(int id, String product, double price) {
        this.id = id;
        this.product = product;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getProduct() {
        return product;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product:     " + product + "\n"
                + "Price:    $" + String.format("%.2f", price) + "\n"
                + "ID: " + id + "\n";
    }
}
