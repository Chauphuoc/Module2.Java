package org.example;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public Scanner scanner = new Scanner(System.in);

    public ProductService productService;
    public CategoryService categories;

    public Main(){
        productService = new ProductService();
        categories = new CategoryService();
        productService.initiate();
        categories.initiate();
    }

    public static void main(String[] args) {
     Main appMain = new Main();
     boolean checkMenuAction = false;
     Scanner scanner = new Scanner(System.in);
     do {
         checkMenuAction = false;
         System.out.println("--------MENU-------");
         System.out.println("1.Add Product");
         System.out.println("2.Edit Product");
         System.out.println("3.Remove Product");
         System.out.println("4.Printing list of Product");
         System.out.println("5.Sorting Products");
         System.out.println("6.Searching Product");
         System.out.println("0.Exit");
         System.out.println("Enter your choice:");
         int choice = Integer.parseInt(scanner.nextLine());
         switch (choice){
             case 0:
                 System.exit(3);
                 break;
             case 1:
                 appMain.addProductView();
                 checkMenuAction = appMain.checkContinueAction();
                 break;
             case 2:
                 appMain.editProductView();
                 appMain.showProductView(appMain.productService.getProducts());
                 checkMenuAction = appMain.checkContinueAction();
                 break;
             case 3:
                 appMain.removeProductView();
                 checkMenuAction = appMain.checkContinueAction();
                 break;
             case 4:
                 appMain.showProductView(appMain.productService.getProducts());
                 checkMenuAction = appMain.checkContinueAction();
                 break;
             case 5:
                 appMain.sortProductView();
                 checkMenuAction = appMain.checkContinueAction();
                 break;
             case 6:
                 appMain.searchingProductView();
                 checkMenuAction = appMain.checkContinueAction();
                 break;
         }
     }
     while (checkMenuAction);
    }

    private void searchingProductView() {
        boolean checkMunuAction = false;
        do {
            checkMunuAction=false;
            System.out.println("===Searching Product Menu===");
            System.out.println("1.Searching by ID");
            System.out.println("2.Searching by Name");
            System.out.println("-->Your choice");
            int choiceMenuAction = Integer.parseInt(scanner.nextLine());
            switch (choiceMenuAction){
                case 1:
                    System.out.println("Enter ID you choose");
                    int idChoosen = Integer.parseInt(scanner.nextLine());
                    System.out.println(productService.findProductByID(idChoosen));
                    break;
                case 2:
                    System.out.println("Enter Product you choose");
                    String nameChoosen = scanner.nextLine().toUpperCase();
                    System.out.println(productService.findProductByname(nameChoosen));
                    break;
                default:
                    System.out.println("Error value! Type again!");
                    checkMunuAction = true;
            }
        }
        while (checkMunuAction);

    }

    public void showProductView (List<Product> products){
        for (Product p : products){
            System.out.println(p);
        }
    }
    private void sortProductView() {
        boolean checkSortingMenu = false;
        int choiceSortingMenu;
        do {
           checkSortingMenu = false;
            System.out.println("====SORTING MENU====");
            System.out.println("1.Sorting by Name");
            System.out.println("2.Sorting by Price");
            System.out.println("3.Sorting by Quantity");
            System.out.println("===>Your choice:");
            choiceSortingMenu = Integer.parseInt(scanner.nextLine()) ;
            switch (choiceSortingMenu){
                case 1:
                    sortByName();
                    break;
                case 2:
                    sortByPrice();
                    break;
                case 3:
                    sortByQuantity();
                    break;
                default:
                    System.out.println("Error Value! Type again!");
                    checkSortingMenu = true;
                    break;
            }
        }
        while (checkSortingMenu);

    }

    private void sortByQuantity() {
        boolean checkMenuAction = false;
        List<Product> products = productService.getProducts();
        Comparator<Product> comparatorByIncreasingQuantity;
        Comparator<Product> comparatorByDecreasingQuantity;
        do {
            checkMenuAction = false;
            System.out.println("==Shorting Menu==");
            System.out.println("1.Shorting by Increasing Quantity");
            System.out.println("2.Shorting by Decreasing Quantity");
            System.out.println("==> Your choice:");
            int choiceMenuAction = Integer.parseInt(scanner.nextLine());
            switch (choiceMenuAction){
                case 1:
                    comparatorByIncreasingQuantity = new ComparatorByIncreasingQuantity ();
                    products.sort(comparatorByIncreasingQuantity);
                    break;
                case 2:
                    comparatorByDecreasingQuantity = new ComparatorByDecreasingQuantity();
                    products.sort(comparatorByDecreasingQuantity);
                    break;
                default:
                    System.out.println("Error Value! Type again");
                    checkMenuAction = true;
                    break;
            }
        }
        while (checkMenuAction);
    }

    private void sortByName() {
        List<Product> products = productService.getProducts();
        Comparator<Product> comparatorByDecreasingName;
        Comparator<Product> comparatorbyIncreasingName;
        boolean checkMenuSort = false;
        do {
            checkMenuSort = false;
            System.out.println("==Shorting Menu==");
            System.out.println("1.Shorting by Increasing Name");
            System.out.println("2.Shorting by Decreasing Name");
            System.out.println("==> Your choice:");
            int choiceMenuSort = Integer.parseInt(scanner.nextLine());
            switch (choiceMenuSort){
                case 1:
                    comparatorbyIncreasingName = new ComparatorByIncreasingName();
                    products.sort(comparatorbyIncreasingName);
                    break;
                case 2:
                    comparatorByDecreasingName = new ComparatorByDecreasingName();
                    products.sort(comparatorByDecreasingName);
                    break;
                default:
                    System.out.println("Error Value! Type again");
                    checkMenuSort = true;
                    break;
            }
        }
        while (checkMenuSort);
    }

    public void sortByPrice (){
        List<Product> products = productService.getProducts();
        boolean checkMenuSort = false;
        Comparator<Product> comparatorbyIncreasing;
        Comparator<Product> comparatorbyDecreasing;
        do {
            checkMenuSort = false;
            System.out.println("==Shorting Menu==");
            System.out.println("1.Shorting by Increasing");
            System.out.println("2.Shorting by Decreasing");
            System.out.println("==> Your choice:");
            int choiceMenuSort = Integer.parseInt(scanner.nextLine());
            switch (choiceMenuSort){
                case 1:
                    comparatorbyIncreasing = new ComparatorByIncreasingPrice();
                    products.sort(comparatorbyIncreasing);
                    break;
                case 2:
                    comparatorbyDecreasing = new ComparatorByDecreasingPrice();
                    products.sort(comparatorbyDecreasing);
                    break;
                default:
                    System.out.println("Error Value! Type again");
                    checkMenuSort = true;
                    break;
            }
        }
        while (checkMenuSort);
    }

    private void removeProductView() {
        System.out.println("Enter ID Product you want to remove");
        int idRemoveProduct = Integer.parseInt(scanner.next());
        productService.removeProduct(idRemoveProduct);
    }

    public void addProductView(){
        boolean checkEditingMenu = false;
        Product product = new Product();
        do {
            checkEditingMenu=false;
            System.out.println("-------Adding Product-------");
            System.out.println("1.Enter Name Product");
            System.out.println("2.Enter ID Product");
            System.out.println("3.Enter Price of Product");
            System.out.println("4.Enter quantity of Product");
            System.out.println("5.Enter ID of Category");
            System.out.println("0.Exit");
            System.out.println("Enter your choice:");
            int chooseEditMenu = Integer.parseInt(scanner.nextLine());
            switch (chooseEditMenu) {
                case 0:
                    break;
                case 1:
                    String name = scanner.nextLine();
                    product.setName(name);
                    checkEditingMenu = true;
                    break;
                case 2:
                    int idProduct = Integer.parseInt(scanner.nextLine());
                    product.setId(idProduct);
                    checkEditingMenu = true;
                    break;
                case 3:
                    product.setPrice(inputPrice(ActionInput.Add));
                    checkEditingMenu = true;
                    break;
                case 4:
                    int quantityProduct = Integer.parseInt(scanner.nextLine());
                    product.setQuantity(quantityProduct);
                    checkEditingMenu = true;
                    break;
                case 5:
                    int idCategory = Integer.parseInt(scanner.nextLine());
                    product.setIdCategory(idCategory);
                    checkEditingMenu = true;
                    break;
                default:
                    System.out.println("Error! Type again!");
                    checkEditingMenu = true;
                    break;
            }
        }
        while (checkEditingMenu) ;
        productService.addProduct(product);
    }


    public boolean checkContinueAction (){

        System.out.println("Do you want to continue: Yes(Y)/No(N)");
        String choiceCheckContinueAction =  scanner.nextLine();
        switch (choiceCheckContinueAction){
            case "y":
                return true;
            case "n":
                return false;
            default:
                System.out.println("Typing Error! Typing again!");
                return true;
        }
    }

    public double inputPrice (ActionInput type){
        double price;
        boolean checkInputPrice = false;
        do {
            checkInputPrice=false;
            switch (type){
                case Add:
                    System.out.println("Enter added value ");
                    break;
                case Edit:
                    System.out.println("Enter Edited value");
                    break;
            }
            System.out.println("Enter your price");
            price = Double.parseDouble(scanner.nextLine());
            if (price<0||price>100000){
                System.out.println("Value is error. Type again");
                checkInputPrice = true;
            }
        }
        while (checkInputPrice);
        return price;
    }



    public void editProductView (){
        System.out.println("Enter ID Product that you want to change");
        int idProduct = Integer.parseInt(scanner.nextLine());
        for (Product product: productService.getProducts()){
            if (product.getId()==idProduct){
                boolean checkEditProduct = false;
                do {
                    checkEditProduct = false;
                    System.out.println("--------Editing Product Menu-------");
                    System.out.println("1.Editing Name");
                    System.out.println("2.Editing ID");
                    System.out.println("3.Editing Price");
                    System.out.println("4.Editing Quantity");
                    System.out.println("5.Editing IDCategory");
                    System.out.println("0.Exit");
                    System.out.println("Enter your choice:");
                    int choiceEditProduct=Integer.parseInt(scanner.nextLine());
                    switch (choiceEditProduct){
                        case 0:
                            break;
                        case 1:
                            String name = scanner.nextLine();
                            product.setName(name);
                            checkEditProduct = true;
                            break;
                        case 2:
                            int id =Integer.parseInt(scanner.nextLine());
                            product.setId(id);
                            checkEditProduct = true;
                            break;
                        case 3:
                            product.setPrice(inputPrice(ActionInput.Edit));
                            checkEditProduct = true;
                            break;
                        case 4:
                            int quantity = Integer.parseInt(scanner.nextLine());
                            product.setQuantity(quantity);
                            checkEditProduct = true;
                            break;
                        case 5:
                            int idCategory = Integer.parseInt(scanner.nextLine());
                            product.setQuantity(idCategory);
                            checkEditProduct = true;
                            break;
                    }
                }
                while (checkEditProduct);
            }
        }
    }
}