package storemanagement;


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
        storemanagement.Main appMain = new storemanagement.Main();
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
                    appMain.editProductView();
                    checkMenuAction = appMain.checkContinueAction();
                    break;
                case 3:
                    appMain.removeProduct();
                    checkMenuAction = appMain.checkContinueAction();
                    break;
                case 4:
                    appMain.showProductView();
                    checkMenuAction = appMain.checkContinueAction();
                    break;
                case 5:
                    appMain.sortProduct();
                    checkMenuAction = appMain.checkContinueAction();
                    break;
                case 6:
                    appMain.searchingByID();
                    checkMenuAction = appMain.checkContinueAction();
                    break;
                default:
                    checkMenuAction = true;
                    break;
            }
        }
        while (checkMenuAction);
    }

    public void sortProduct (){
        productServicePhone.sortByPriceProduct();
    }

    private void searchingByID() {
        System.out.println("----Searching Product Menu----");
        System.out.println("1.Searching Product by ID Product");
        System.out.println("2.Searching Product by Name Product");
        System.out.println("===Your choice:===");
        int choiceSearchingProductMenu = Integer.parseInt(scanner.nextLine());
        switch (choiceSearchingProductMenu){
            case 1:
                System.out.println("Enter ID you want to search");
                int idSearching = Integer.parseInt(scanner.nextLine());
                Product product =productServicePhone.findByIDProduct(idSearching);
                System.out.println(product);
                break;
            case 2:
                System.out.println("Enter Name you want to search");
                String name = scanner.nextLine();
                Product product1 = productServicePhone.findByNameProduct(name.toUpperCase());
                System.out.println(product1);
                break;
        }

    }

    private void removeProduct() {
        System.out.println("----Removing Product Menu----");
        System.out.println("1.Remove Product by ID Product");
        System.out.println("2.Remove Product by Name Product");
        System.out.println("===Your choice:===");
        int choiceRemoveProductMenu = Integer.parseInt(scanner.nextLine());
        switch (choiceRemoveProductMenu){
            case 1:
                productServicePhone.removeProductbyID();
                break;
            case 2:
                productServicePhone.removeProductbyName();
                break;
        }
    }

    private void editProductView() {
        System.out.println("Enter ID product you want to Edit");
        int idEditProduct = Integer.parseInt(scanner.nextLine());
        Product product = productServicePhone.findByIDProduct(idEditProduct);
        boolean checkEditProductAction = false;
        do {
            checkEditProductAction = false;
            System.out.println("=====Editing Product Menu=====");
            System.out.println("1.Edit Name Product");
            System.out.println("2.Edit ID Product");
            System.out.println("3.Edit Price Product");
            System.out.println("4.Edit Quantity Product");
            System.out.println("5.Edit ID Category");
            System.out.println("0.Exit");
            System.out.println("Enter your choice");
            int choiceEditProductionView = Integer.parseInt(scanner.nextLine());
            switch (choiceEditProductionView){
                case 1:
                    String name = scanner.nextLine();
                    product.setName(name);
                    checkEditProductAction=true;
                    break;
                case 2:
                    int id = Integer.parseInt(scanner.nextLine());
                    product.setIdProduct(id);
                    checkEditProductAction = true;
                    break;
                case 3:
                    product.setPrice(inputPrice(TypeInput.Edit));
                    checkEditProductAction = true;
                    break;
                case 4:
                    int quantity = Integer.parseInt(scanner.nextLine());
                    product.setQuantity(quantity);
                    checkEditProductAction = true;
                    break;
                case 5:
                    int idCategory = Integer.parseInt(scanner.nextLine());
                    product.setIdCategory(idCategory);
                    checkEditProductAction = true;
                    break;
                case 0:
                    checkEditProductAction=false;
                    break;
            }
        }
        while (checkEditProductAction);
    }

    public int inputPrice (TypeInput type) {
        boolean checkInputPrice = false;
        int price;
        do {
            switch (type) {
                case Add:
                    System.out.println("Adding Price:");
                    break;
                case Edit:
                    System.out.println("Editing Price");
                    break;
            }
            System.out.println("Enter your Value");
            price = Integer.parseInt(scanner.nextLine());
            if (price < 0 || price > 100000) {
                System.out.println("Error Value. Type again!");
                checkInputPrice = true;
                }
            }
            while (checkInputPrice) ;
            return price;

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
                    productPhone.setPrice(inputPrice(TypeInput.Add));
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
        productServicePhone.addProduct(productPhone);
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

    public void showProductView (){
        for (Product product: productServicePhone.getProduct()){
            System.out.println(product);
        }
    }
}
