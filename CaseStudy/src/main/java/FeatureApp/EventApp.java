package FeatureApp;


import view.ProductView;

public class EventApp {
    ProductView productManagement = new ProductView();
    public void returnEvent (String option){
        if (option.equals("Return-sorting-menu")){
            productManagement.sortProduct();
        }
    }
}
