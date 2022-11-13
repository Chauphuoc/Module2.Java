package Animals;

import java.util.Scanner;

public class Rectangle {
    private int width;
    private int height;
    public Rectangle (int width,int height){
        this.width = width;
        this.height =height;
    }
    public int getArea (){
        return width*height;
    }
    public int getPerimeter (){
        return (width+height)*2;
    }
    public String display() {
        return "Rectangle:[width:"+width+"];Height:["+height+"]";
    }
    public static void main(String[] args){
        Rectangle rectangle1 = new Rectangle(15,20);
        System.out.println(rectangle1.display());
        System.out.println();
        Rectangle rectangle2 =new Rectangle(10,8);
        System.out.println(rectangle2.display());
    }











//    int width;
//    int height;
//    public Rectangle (){
//
//    }
//    public Rectangle(int width, int height){
//        this.width = width;
//        this.height = height;
//    }
//    public void setWidth (int newWidth){
//        width = newWidth;
//    }
//    public int getArea (){
//        return width*height;
//    }
//    int getPerimeter (){
//        return (width+height)*2;
//    }
//    String display(){
//        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
//    }
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("width:");
//        int width = Integer.parseInt(scanner.nextLine());
//        System.out.println("Height:");
//        int height = Integer.parseInt(scanner.nextLine());
//        Rectangle object1= new Rectangle(width,height);
//
//        System.out.println(object1.display());
//        System.out.println("Dien tich:"+object1.getArea()+"\n"+"Chu vi:"+object1.getPerimeter());
//    }
}
