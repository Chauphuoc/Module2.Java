package org.example;

import java.util.Locale;

public class Product {
    private String name;
    private int id;
    private double price;
    private int quantity;
    private int idCategory;
    public Product (){}

    public Product(String name, int id, double price, int quantity, int idCategory) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.quantity = quantity;
        this.idCategory = idCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public void updateProduct(Product product){
        this.setName(product.getName());
        this.setId(product.getId());
        this.setPrice(product.getPrice());
        this.setQuantity(product.getQuantity());
        this.setIdCategory(product.getIdCategory());
    }

    @Override
    public String toString() {
        Category c= CategoryService.findCategoryByID(this.idCategory);
        String getNameByIDcategory="";
        if (c!=null){
            getNameByIDcategory = c.getBrand();
        }
        return String.format("%10s %20s %10s %10s %10s",this.id, this.name, this.quantity, this.price,getNameByIDcategory);

    }
}
