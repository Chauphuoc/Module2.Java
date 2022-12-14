package com.example;

public class Customer {
    private String name;
    private String phoneNumber;
    private int id;
    private String address;
    public Customer (){
        super();
    }

    public Customer(String name, String phoneNumber, int id, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", id=" + id +
                ", address='" + address + '\'' +
                '}';
    }
    //    private String name;
//    private String phoneNumber;
//    private int ID;
//    private String address;
//    public Customer (){}
//
//    public Customer(String name, String phoneNumber, int ID, String address) {
//        this.name = name;
//        this.phoneNumber = phoneNumber;
//        this.ID = ID;
//        this.address = address;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public void setPhoneNumber(String phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//
//    public int getID() {
//        return ID;
//    }
//
//    public void setID(int ID) {
//        this.ID = ID;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    @Override
//    public String toString() {
//        return "Customer Infor{" +
//                "name='" + name + '\'' +
//                ", phoneNumber='" + phoneNumber + '\'' +
//                ", ID=" + ID +
//                ", address='" + address + '\'' +
//                '}';
//    }
}
