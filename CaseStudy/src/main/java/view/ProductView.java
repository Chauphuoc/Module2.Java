package view;

import FeatureApp.BannerApp;
import FeatureApp.InitApp;
import Model.Product;
import Service.ProductService;

import java.lang.reflect.InaccessibleObjectException;
import java.util.Scanner;

public class ProductView {
    public static Scanner scanner = new Scanner(System.in);
    ProductService productService = new ProductService();

    BannerApp bannerApp= new BannerApp();
    public void sortProduct() {
        boolean checkSortProduct=false;
        do {
            checkSortProduct = false;
            bannerApp.menuBanner("Sort-Product-Menu");
            int choiceSortProduct = Integer.parseInt(scanner.nextLine());
            switch (choiceSortProduct) {
                case 1:
                    productService.sortByPrice();
                    break;
                case 2:
                    productService.sortByName();
                    break;
                case 3:
                    productService.sortByQuantity();
                    break;
                default:
                    checkSortProduct = true;
                    break;
            }
        }
        while (checkSortProduct);
    }

    public void searchProduct() {
        try {
            boolean checkSearchingProduct = false;
            do {
                checkSearchingProduct = false;
                bannerApp.menuBanner("Searching-Product");
                int choiceSearching = Integer.parseInt(scanner.nextLine());
                switch (choiceSearching){
                    case 1:
                        System.out.println("■ Enter ID Product:");
                        Product product;
                        long idProduct = Long.parseLong(scanner.nextLine());
                        product = productService.findProductByID(idProduct);
                        System.out.println(product) ;
                        break;
                    case 2:
                        System.out.println("■ Enter Name Product:");
                        Product product1;
                        String idproduct1 = scanner.nextLine();
                        product1 = productService.findProductByName(idproduct1.toUpperCase());
                        System.out.println(product1);
                        break;
                    default:
                        System.out.println("Error value! Type again");
                        checkSearchingProduct=true;
                        break;
                }
            }
            while (checkSearchingProduct);
        }
        catch (Exception e){
            throw new InaccessibleObjectException("Value Error");
        }
    }

    public void removeProductView() {
        productService.removeProductByID();
    }

    public void editProductView() {
        productService.updateProduct();
    }

    public void showProductView() {
        System.out.printf("%10s %20s %20s %10s %10s","ID","Name product","Price","Quantity","Type");
        System.out.println();
        for (Product product: productService.getProducts()){
            System.out.println(product);
        }
    }

    public void addProductView() {
        productService.addProduct();
        while (InitApp.checkContinueAdd()){
            productService.addProduct();
        }
    }

}
