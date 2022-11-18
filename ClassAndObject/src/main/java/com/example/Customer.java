package com.example;

public class Customer {
    private String name;
    private String phoneNumber;
    private int ID;
    private String address;
    public Customer (){}

    public Customer(String name, String phoneNumber, int ID, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.ID = ID;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer Infor{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", ID=" + ID +
                ", address='" + address + '\'' +
                '}';
    }
}
