package Animals;

import java.util.Scanner;

public class Rectangle {
    int width;
    int height;
    public Rectangle (){

    }
    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
    public void setWidth (int newWidth){
        width = newWidth;
    }
    public int getArea (){
        return width*height;
    }
    int getPerimeter (){
        return (width+height)*2;
    }
    String display(){
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("width:");
        int width = Integer.parseInt(scanner.nextLine());
        System.out.println("Height:");
        int height = Integer.parseInt(scanner.nextLine());
        Rectangle object1= new Rectangle(width,height);

        System.out.println(object1.display());
        System.out.println("Dien tich:"+object1.getArea()+"\n"+"Chu vi:"+object1.getPerimeter());
    }
}
