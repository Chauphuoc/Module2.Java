package view;

import FeatureApp.InitApp;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LoginAdminView {
    public  static Scanner scanner = new Scanner(System.in);
    public void loginAdmin (){

        Boolean checkLoginAdmin = false;
        do {
            checkLoginAdmin = false;
            System.out.println("╔═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
            System.out.println("║                                                LOGIN ADMIN                                                      ║");
            System.out.println("║                                                【1】. ENTER USERNAME                                                ║");
            System.out.println("║                                                【2】. ENTER PASSWORD                                                ║");
            System.out.println("║         【R】Return                                                                                       ║");
            System.out.println("╚═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
            System.out.println("Enter Username:");
            InitApp.isNotEmpty();
            System.out.println("Enter Password:");
            InitApp.isNotEmpty();
//            if ()
        }
        while (checkLoginAdmin);
    }

    public static boolean retryLogin (){
        do {
            System.out.println("╔═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
            System.out.println("║                                               【1】. LOGIN AGAIN                                                 ║");
            System.out.println("║                                               【2】. RETURN                                                      ║");
            System.out.println("║                                               【3】. EXIT                                                        ║");
            System.out.println("╚═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
            System.out.println("►►►►►►Enter your choice:");
            int choiceRetryLogin = Integer.parseInt(scanner.nextLine());
            switch (choiceRetryLogin){
                case 1:
                    return true;
                case 2:
//                    loginView.login();
                    break;
                case 3:
                    System.exit(5);
                default:
                    System.out.println("Error value! Please type again");
            }
        }
        while (true);
    }
}
