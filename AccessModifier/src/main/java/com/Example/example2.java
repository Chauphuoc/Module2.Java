package com.Example;

public class example2 extends Example1 {
    private int width;
    private int height;
//    public example2(){
//
//    }
    public int sum1 (){
        return super.sum(5,6);
    }

//    public int sum (int width, int height){
//        return width + height +10;
//    }

    public static void main(String[] args) {
        example2 exam1 = new example2();
        int a=exam1.sum1();
        System.out.println("exam1:"+a);


        Example1 exam2 = new Example1();
        System.out.println("exam2:"+exam2.sum(10,5));
    }
}
