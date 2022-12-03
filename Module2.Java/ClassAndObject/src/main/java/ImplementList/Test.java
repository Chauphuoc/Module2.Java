package ImplementList;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mylist<Integer> listInteger = new Mylist<Integer>();

        listInteger.add(1);
        listInteger.add(10);
        listInteger.add(13);
        listInteger.add(3);
        listInteger.add(4);
        System.out.println(listInteger);

//        listInteger.remove(1);
        System.out.println(listInteger);
        listInteger.add(91,4);
        System.out.println(listInteger);
        System.out.println("Size:"+listInteger.size());
        System.out.println("Enter checked number:");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Was it contain?"+listInteger.contains(a));
        listInteger.indexOf(a);
        listInteger.getData();
//        listInteger.clear();
        System.out.println(listInteger);
        System.out.println(listInteger.get(2));

        Mylist<Integer> floatMylist = new Mylist<Integer>();
        floatMylist = listInteger.newArr();

        for (int i =0; i<floatMylist.elements.length;i++){
            System.out.print(floatMylist.get(i));
        }


//        System.out.println("element 5: "+listInteger.get(4));
//        System.out.println("element 3: "+listInteger.get(3));
//        listInteger.get(6);
//        System.out.println("element 6: "+listInteger.get(6));
//        listInteger.get(-1);
//        System.out.println("element -1: "+listInteger.get(-1));
    }
}
