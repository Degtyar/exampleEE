package ru.degtyar.enterprise.servlet;

public class Product {
    private int price;
    private String name;

    public Product() {
        this.price = 100;
        this.name = "first";
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}