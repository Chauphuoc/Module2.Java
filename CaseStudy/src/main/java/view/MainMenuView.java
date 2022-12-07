package view;

import FeatureApp.AlertApp;
import FeatureApp.BannerApp;
import FeatureApp.InitApp;

import java.util.Scanner;

public class MainMenuView {
    public static Scanner scanner = new Scanner(System.in);
    ProductView productManagement = new ProductView();
    AlertApp alertApp1 = new AlertApp();
    BannerApp bannerApp= new BannerApp();
    public void mainMenuView (){
        boolean checkMenuAction = false;
        do {
            bannerApp.menuBanner("Main-Menu");
            int choiceMenuAction = Integer.parseInt(scanner.nextLine());
            switch (choiceMenuAction){
                case 1:
                    productManagement.addProductView();
                    alertApp1.alertApp("Add-Success");
                    checkMenuAction= InitApp.checkContinueAction();
                    break;
                case 2:
                    productManagement.editProductView();
                    checkMenuAction = InitApp.checkContinueAction();
                    break;
                case 3:
                    productManagement.removeProductView();
                    alertApp1.alertApp("Student-Remove-Confirm");
                    alertApp1.alertApp("Remove-Success");
                    checkMenuAction = InitApp.checkContinueAction();
                    break;
                case 4:
                    productManagement.searchProduct();
                    checkMenuAction = InitApp.checkContinueAction();
                    break;
                case 5:
                    productManagement.sortProduct();
                    checkMenuAction = InitApp.checkContinueAction();
                    break;
                case 6:
                    productManagement.showProductView();
                    checkMenuAction = InitApp.checkContinueAction();
                    break;
                case 0:
                    System.exit(5);
                    break;
                default:
                    checkMenuAction = true;
                    break;
            }
        }
        while (checkMenuAction);
    }
}
