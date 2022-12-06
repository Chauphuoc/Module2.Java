package Exception;

import java.util.Scanner;

public class NumberFormatException {
    public static void calculating (int x, int y){
        try {
            int a = x + y;
            int b = x-y;
            int c = x*y;
            int d = x/ y;
            System.out.printf("%d + %d = %d",x,y,a);
            System.out.println();
            System.out.printf("%d - %d = %d",x,y,b);
            System.out.println();
            System.out.printf("%d * %d = %d",x,y,c);
            System.out.println();
            System.out.printf("%d / %d = %d",x,y,d);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập x: ");
        int x = scanner.nextInt();
        System.out.println("Hãy nhập y: ");
        int y = scanner.nextInt();
        calculating(x,y);
    }
}
