package utils;

import java.util.Scanner;

public class AppUtils {
    static Scanner scanner = new Scanner(System.in);
    public static String isNotEmpty (String value){
        String result = scanner.nextLine();
        while ((result = scanner.nextLine()).isEmpty()){
            System.out.println(value + "It's empty. Please Typing again!");
        }
        return result;
    }
}
