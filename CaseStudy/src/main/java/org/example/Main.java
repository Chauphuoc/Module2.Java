package org.example;

import FeatureApp.AlertApp;
import FeatureApp.InitApp;
import Model.ActionType;
import Model.Product;
import Service.CategoryService;
import Service.ProductService;
import view.MainMenuView;

import java.lang.reflect.InaccessibleObjectException;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    CategoryService categoryService;
    ProductService productService;
    AlertApp alertApp1;
    MainMenuView appMainMenu = new MainMenuView();
    public Main(){
        categoryService = new CategoryService();
        productService = new ProductService();
        categoryService.initiate();
        productService.initiate();
    }

    public static void main(String[] args) {
        Main appmain = new Main();
        appmain.appMainMenu.mainMenuView();
    }
}