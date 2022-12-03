package FeatureApp;


import view.ProductManagement;

public class EventApp {
    ProductManagement productManagement = new ProductManagement();
    public void returnEvent (String option){
        if (option.equals("Return-sorting-menu")){
            productManagement.sortProduct();
        }
    }
}
