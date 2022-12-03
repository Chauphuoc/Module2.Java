package storemanagement;

import org.example.CategoryService;
import org.example.ProductService;

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    ProductService productServicePhone;
    CategoryService categoryServicePhone;
    Main (){
        productServicePhone = new ProductService();
        categoryServicePhone = new CategoryService();
        productServicePhone.initiate();
        categoryServicePhone.initiate();
    }

    public static void main(String[] args) {
        Main appMain = new Main();
        Scanner scanner = new Scanner(System.in);
        boolean checkMenuAction = false;
        do {
            checkMenuAction = false;
            System.out.println("**********MENU ACTION**********");
            System.out.println("1.Add Product");
            System.out.println("2.Edit Product");
            System.out.println("3.Remove Product");
            System.out.println("4.Printing list of Product");
            System.out.println("5.Sorting Products");
            System.out.println("6.Searching Product");
            System.out.println("Enter your choice:");
            int choiceMenuAction = Integer.parseInt(scanner.nextLine());
            switch (choiceMenuAction){
                case 1:
                    appMain.addProduct();
                    checkMenuAction = appMain.checkContinueAction();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    checkMenuAction = true;
                    break;
            }
        }
        while (checkMenuAction);
    }

    public void addProduct (){
        boolean checkAddProductMenu = false;
        Product productPhone = new Product();
        do {
            checkAddProductMenu = false;
            System.out.println("******Adding Product Menu********");
            System.out.println("1.Enter name product:");
            System.out.println("2.Enter ID product");
            System.out.println("3.Enter price product");
            System.out.println("4.Enter quantity product");
            System.out.println("5.Enter id category product");
            System.out.println("Enter your choice");
            int choiceAddProductMenu = Integer.parseInt(scanner.nextLine());
            switch (choiceAddProductMenu){
                case 1:
                    String name = scanner.nextLine();
                    productPhone.setName(name);
                    break;
                case 2:
                    long idProduct = Long.parseLong(scanner.nextLine());
                    productPhone.setIdProduct(idProduct);
                    break;
                case 3:
                    int price = Integer.parseInt(scanner.nextLine());
                    productPhone.setPrice(price);
                    break;
                case 4:
                    int quantity = Integer.parseInt(scanner.nextLine());
                    productPhone.setQuantity(quantity);
                    break;
                case 5:
                    int idCategory = Integer.parseInt(scanner.nextLine());
                    productPhone.setIdCategory(idCategory);
                    break;
                default:
                    checkAddProductMenu = true;
                    break;
            }
        }
        while (checkAddProductMenu);
//        productServicePhone.addProduct(productPhone);
    }

    public boolean checkContinueAction (){
            System.out.println("Do you want to continue? Yes(Y)/No(N)");
            System.out.println("Enter your choice");
            String choiceContinueAction = scanner.nextLine();
            switch (choiceContinueAction){
                case "y":
                    return true;
                case "n":
                    return false;
                default:
                    return false;
            }
    }

}
