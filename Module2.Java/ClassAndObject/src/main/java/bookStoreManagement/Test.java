package bookStoreManagement;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Birthday dateTom = new Birthday(7,3,1996);
//        System.out.println("Enter your year");
//        int year = scanner.nextInt();
//        dateTom.setYear(year);
//        System.out.println("Enter your month");
//        int month = scanner.nextInt();
//        dateTom.setMonth(month);
//        System.out.println("Enter your date");
//        int date = scanner.nextInt();
//        dateTom.setDate(date);
        System.out.println(dateTom.toString());

        Birthday dayPeter = new Birthday(13,3,1997);
        Author peter = new Author("Peter",dayPeter);
        Book bookPeter = new Book("Java Programing",19000,2005,peter);

        Author tom = new Author("Tom",dateTom);
        Book bookTom = new Book("C Programing",8000,1999,tom);
        bookTom.printNamebook();


        System.out.println("So sanh sach Peter va Tom"+bookPeter.checkPublishYear(bookTom));
        System.out.println("Enter discout");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.println(bookPeter.costDistance(x));
//        System.out.println(String.format("gia sach sau khi giam %s: %s",x,bookPeter.costDistance(x)));
    }

}
