package com.example;

public class Store extends Customer {
    private String product;

    private double cost;
    private int IDproduct;
    private String color;
    private String system;
    private int quantity;
    private String date;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Store (){
        super();
    }
    public Store (String name, String phoneNumber, int ID, String address,String product, int cost, int IDproduct, String color, String system, int quantity){
        super(name, phoneNumber, ID, address);
        this.product = product;
        this.cost = cost;
        this.IDproduct = IDproduct;
        this.color = color;
        this.system = system;
        this.quantity = quantity;
    }

    public Store(String product, int cost, int IDproduct, String color, String system, int quantity) {
        super();
        this.product = product;
        this.cost = cost;
        this.IDproduct = IDproduct;
        this.color = color;
        this.system = system;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getIDproduct() {
        return IDproduct;
    }

    public void setIDproduct(int IDproduct) {
        this.IDproduct = IDproduct;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"Store{" +
                "product='" + product + '\'' +
                ", cost=" + cost +
                ", IDproduct=" + IDproduct +
                ", color='" + color + '\'' +
                ", system='" + system + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    public final double buying (){

        return this.cost = this.cost * this.quantity;
    }

}
