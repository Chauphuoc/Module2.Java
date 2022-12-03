package FeatureApp;

import java.util.Scanner;

public class InitApp {
    public  static Scanner scanner = new Scanner(System.in);
    public static String isNotEmpty (){
        String value = scanner.nextLine();
        while (value.isEmpty()){
            System.out.println("Username must be not empty. Please try again!");
        }
        return value;
    }
    public static boolean checkContinueAction() {
        System.out.println("Are your sure to continue: 【Yes】(Y) or 【No】(N)");
        String choiceContinueAction = scanner.nextLine();
        switch (choiceContinueAction){
            case "y":
                return true;
            case "n":
                return false;
            default:
                System.out.println("Error Value. Please Type again");
                return true;
        }
    }

    public static boolean checkContinueAdd() {
        System.out.println("Do you want to continue Adding: 【Yes】(Y) or 【No】(N)");
        String choiceContinueAction = scanner.nextLine();
        switch (choiceContinueAction){
            case "y":
                return true;
            case "n":
                return false;
            default:
                System.out.println("Error Value. Please Type again");
                return true;
        }
    }
}
