package com.Example;

public class example2 extends example {
    private int width;
    private int height;
    public example2(){

    }
    public int sum1 (){
        return super.sum(5,6);
    }
//    Đây có phải là override không
    public int sum (int width, int height){
        return width + height +10;
    }

    public static void main(String[] args) {
        example2 exam1 = new example2();
        int a=exam1.sum1();
//        exam1.setWidth(5);
        System.out.println("exam1:"+a);


        example exam2 = new example();
        System.out.println("exam2:"+exam2.sum(10,5));
    }
}
