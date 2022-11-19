package com.example;

public class Main {
    public static void main(String[] args) {
        Store tom = new Store("Iphonex",8000000,100,"blue","IOS",1);
        tom.setName("Phuoc");
        tom.setPhoneNumber("0965148011");
        tom.setAddress("Phu Thuong Province");
        tom.setId(125);
        System.out.println(tom);

        tom.setDate("06/05");
        double x = tom.buying();
        if (tom.getDate()=="05/05"){
            if (x>590000){
                System.out.println("Your bill:"+(x-x*0.1));
            }
        }
        else System.out.println(String.format("Your bill: %s",x));;


    }

}
