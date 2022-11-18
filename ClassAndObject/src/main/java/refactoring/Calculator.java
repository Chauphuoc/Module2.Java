package refactoring;

import java.util.Scanner;

public class Calculator {
//    public static int calculate(int firstOperand, int secondOperand, char operator) {
//        final char ADDITION = '+';
//         final char SUBTRACTION = '-';
//         final char MULTIPLICATION = '*';
//        final char DIVISION = '/';
//        switch (operator) {
//            case ADDITION:
//                return firstOperand + secondOperand;
//            case SUBTRACTION:
//                return firstOperand - secondOperand;
//            case MULTIPLICATION:
//                return firstOperand * secondOperand;
//            case DIVISION:
//                if (secondOperand != 0)
//                    return firstOperand / secondOperand;
//                else
//                    throw new RuntimeException("Can not divide by 0");
//            default:
//                throw new RuntimeException("Unsupported operation");
//        }
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        System.out.println("Nhap vao chuoi:");
        s = scanner.nextLine();
        System.out.println("Nhap vao ky tu");
        char c;
        c = scanner.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i<s.length(); i++){
            if (c == s.charAt(i)){
                count += 1;
            }
        }
        System.out.println(count);
    }
}
