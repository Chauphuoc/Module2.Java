package Service;

import FeatureApp.*;
import Model.ActionType;
import Model.Product;

import java.util.*;

public class ProductService implements InterfaceProductService{
    public static Scanner scanner = new Scanner(System.in);
    public List<Product> products = new ArrayList<>();
    public EventApp eventApp = new EventApp();
    public BannerApp bannerApp = new BannerApp();

    public List<Product> initiate (){
        products = new ArrayList<>();
        products.add(new Product(1,"Espresso",15000,1,1));
        products.add(new Product(2,"Black Coffee",12000,5,1));
        products.add(new Product(3,"Huda Beer",18000,4,2));
        products.add(new Product(4,"Trà sữa trân châu",25000,6,3));
        products.add(new Product(5,"Trà sữa bạc hà",30000,8,3));
        products.add(new Product(6,"Trà sữa bá vương",35000,3,3));
        return products;
    }

    public List<Product> getProducts() {
        return this.products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public List<Product> showProductView() {
        return null;
    }


    public void addProduct() {
        Product product=new Product();
        boolean checkAddProductMenu = false;
        do {
            checkAddProductMenu = false;
            try {
                bannerApp.menuBanner("Product-Service");
                System.out.print("【1】ADD ID PRODUCT");
                int idProduct = Integer.parseInt(scanner.nextLine());
                product.setIdProduct(idProduct);
                System.out.print("【2】ADD NAME PRODUCT");
                String nameProduct = scanner.nextLine();
                product.setNameProduct(nameProduct);
                System.out.print("【3】ADD PRICE PRODUCT");
                long priceProduct = Long.parseLong(scanner.nextLine());
                product.setPrice(priceProduct);
                System.out.print("【4】ADD QUANTITY PRODUCT");
                int quantityProduct = Integer.parseInt(scanner.nextLine());
                product.setQuantity(quantityProduct);
                System.out.print("【5】ADD ID CATEGORY");
                int idCategory = Integer.parseInt(scanner.nextLine());
                product.setBrand(idCategory);
                checkAddProductMenu = false;
            }
            catch (Exception e){
                System.out.println("Error value!Type again!");
                checkAddProductMenu = true;
            }
        }
        while (checkAddProductMenu);
        products.add(product);
    }

    public long inputPrice (ActionType type){
        long price;
        boolean checkInputPrice = false;
        switch (type){
            case Add:
                System.out.println("■ Added Value:");
                break;
            case Edit:
                System.out.println("■ Edited Value:");
                break;
        }
        do {
            checkInputPrice = false;
            price = Long.parseLong(scanner.nextLine());
            if (price<0||price>1000000){
                System.out.println("Price must be less than 1000000 and greater than 0");
                checkInputPrice = true;
            }
        }
        while (checkInputPrice);
        return price;
    }

    public void removeProductByID() {
        System.out.println("■ Enter your ID Product you want to remove:");
        int idRemovedProduct = Integer.parseInt(scanner.nextLine());
        Product product = findProductByID(idRemovedProduct);
        products.remove(product);
    }

    @Override
    public void updateProduct() {
        Product product;
        boolean checkUpdateProduct = false;
        System.out.println("■ Select ID Product you want to update:");
        int choiceIDProduct = Integer.parseInt(scanner.nextLine());
        product = findProductByID(choiceIDProduct);
        do {
            checkUpdateProduct=false;
           bannerApp.menuBanner("Update-product");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    String name = scanner.nextLine();
                    product.setNameProduct(name);
                    checkUpdateProduct= InitApp.checkContinueAction();
                    break;
                case 2:
                    int quantity = Integer.parseInt(scanner.nextLine());
                    product.setQuantity(quantity);
                    checkUpdateProduct= InitApp.checkContinueAction();
                    break;
                case 3:
                    product.setPrice(inputPrice(ActionType.Edit));
                    checkUpdateProduct= InitApp.checkContinueAction();
                    break;
                case 0:
                    checkUpdateProduct=true;
                    break;
            }
        }
        while (checkUpdateProduct);
    }

    @Override
    public Product findProductByID(long id) {
        for (Product product: products){
            if (product.getIdProduct()==id){
                return product;
            }
        }
        return null;
    }

    @Override
    public Product findProductByName(String name) {
        for (Product product : products){
            if ((product.getNameProduct().toUpperCase()).equals(name)){
                return product;
            }
        }
        return null;
    }

    @Override
    public void sortByPrice() {
        boolean checkSortByPrice = false;
        do {
            checkSortByPrice = false;
            bannerApp.menuBanner("Sort-by-price");
            int choiceSortByPrice = Integer.parseInt(scanner.nextLine()) ;
            switch (choiceSortByPrice){
                case 1:
                    ComparatorIncreasingByPrice comparatorByIncreasing = new ComparatorIncreasingByPrice();
                    products.sort(comparatorByIncreasing);
                    break;
                case 2:
                    Comparator<Product> comparatorByDecreasing = new ComparatorDecreasingByPrice();
                    products.sort(comparatorByDecreasing);
                    break;
                case 0:
                    eventApp.returnEvent("Return-sorting-menu");
                    break;
                default:
                    System.out.println("Error value! Type again");
                    checkSortByPrice = true;
                    break;
            }
        }
        while (checkSortByPrice);
    }

    @Override
    public void sortByName() {
        boolean checkSortByName = false;
        do {
            checkSortByName = false;
            bannerApp.menuBanner("Sort-by-name");
            int choiceSortByName = Integer.parseInt(scanner.nextLine());
            switch (choiceSortByName){
                case 1:
                    Comparator<Product> comparatorByIncreasing = new ComparatorIncreasingByName();
                    products.sort(comparatorByIncreasing);
                    break;
                case 2:
                    Comparator<Product> comparatorByDecreasing = new ComparatorDecreasingByName();
                    products.sort(comparatorByDecreasing);
                    break;
                default:
                    System.out.println("Error value! Type again");
                    checkSortByName = true;
                    break;
            }
        }
        while (checkSortByName);
    }

    @Override
    public void sortByQuantity() {
        boolean checkSortByQuantity = false;
        do {
            checkSortByQuantity = false;
            bannerApp.menuBanner("Sort-by-quantity");
            int choiceSortByQuantity = Integer.parseInt(scanner.nextLine());
            switch (choiceSortByQuantity){
                case 1:
                    Comparator<Product> comparatorByIncreasing = new ComparatorIncreasingByName();
                    products.sort(comparatorByIncreasing);
                    break;
                case 2:
                    Comparator<Product> comparatorByDecreasing = new ComparatorDecreasingByName();
                    products.sort(comparatorByDecreasing);
                    break;
                default:
                    System.out.println("Error value! Type again");
                    checkSortByQuantity = true;
                    break;
            }
        }
        while (checkSortByQuantity);
    }
    public boolean beExistbyID (long id){
        for (Product product: products){
            if (product.getIdProduct()==id){
                return true;
            }
        }
        return false;
    }
}
