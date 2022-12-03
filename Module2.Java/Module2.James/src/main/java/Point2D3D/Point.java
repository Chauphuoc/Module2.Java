package Point2D3D;

import java.util.Arrays;
import java.util.Scanner;

public class Point {
    protected float x;
    protected float y;

    protected Point (){

    }
    protected Point (float x, float y){
        this.x = x;
        this.y = y;
    }
    public float getX (){
        return this.x;
    }
    public float getY (){
        return this.y;
    }
    public void setX (float x){
        this.x = x;
    }
    public void setY(float y){
        this.y = y;
    }
    public void setXY (float x,float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY (){
        float [] array = {x,y};
        return array;
    }
    public String toString() {
        return "+ position: (" + this.x + "," + this.y + ")" + "\n"+"speed:Xspeed="+getX()+",Yspeed="+getY();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap x:");
        float x = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhap y:");
        float y = Float.parseFloat(scanner.nextLine());
        Point point1=new Point(x,y);
        point1.setXY(x,y);
        System.out.println(Arrays.toString(point1.getXY()));
        System.out.println(point1.toString());
    }
}
