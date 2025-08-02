package com.example.simpleWebApp.model;



public class Product {

    private int prodId;
    private String prodName;
    private int price;

    public Product(int prodId, String prodName, int price) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.price = price;
    }

    public Product() {
    }

    public int getProdId() {
        return prodId;
    }

    public int getPrice() {
        return price;
    }

    public String getProdName() {
        return prodName;
    }


    @Override
    public String toString() {
        return "Product{" +
                "prodId=" + prodId +
                ", prodName='" + prodName + '\'' +
                ", price=" + price +
                '}';
    }
}
