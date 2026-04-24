package com.pluralsight;

public class Product {
    public String sku;

    public Product(String sku, String productName, double price, String department) {
        this.sku = sku;
        this.productName = productName;
        this.price = price;
        this.department = department;
    }

    public String productName;
    public double price;
    public String department;

    public String getSku() {
        return sku;
    }


    public String getProductName() {
        return productName;
    }


    public double getPrice() {
        return price;
    }


    public String getDepartment() {
        return department;
    }


}
