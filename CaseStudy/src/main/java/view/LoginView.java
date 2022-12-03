package view;

import java.util.Scanner;

public class LoginView {
    public static Scanner scanner = new Scanner(System.in);
    public LoginAdminView loginAdminView = new LoginAdminView();
    public LoginUserView loginUserView = new LoginUserView();
    public void login(){
        System.out.println("╔═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("║                                                WELCOME LOGIN MENU                                                         ║");
        System.out.println("║                                                【1】LOGIN ADMIN ACCOUNT                                          ║");
        System.out.println("║                                                【2】ENTER USERNAME                                               ║");
        System.out.println("║                                                【3】EXIT                                                         ║");
        System.out.println("╚═════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
        System.out.print("►►►►►► Enter your choice: ");
        int choice = Integer.parseInt(scanner.nextLine());
        boolean checkLoginMenu = false;
        do {
            checkLoginMenu = false;
            switch (choice){
                case 1:
                    loginAdminView.loginAdmin();
                    break;
                case 2:
//                    loginUserView.loginUser();
                    break;
                case 3:
                    System.exit(5);
                default:
                    System.out.println("Wrong Value! Please type again!");
                    checkLoginMenu = true;
            }
        }
        while (checkLoginMenu);

    }
}
