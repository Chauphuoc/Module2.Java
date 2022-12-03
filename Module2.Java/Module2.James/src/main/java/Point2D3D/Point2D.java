package Point2D3D;

import java.util.Arrays;
import java.util.Scanner;

public class Point2D {
    private float x;
    private float y;
    public float[] array;
    public Point2D (){

    }
    public Point2D (float x, float y){
        this.x = x;
        this.y = y;
    }
    public void setX (float x){
        this.x = x;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY (float x, float y){
        this.array = new float[2];
        array[0]=x;
        array[1]=y;

    }
    public float[] getXY (){
        return this.array;
    }
    public String toString (){
        return Arrays.toString(getXY());
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Point2D example1 = new Point2D();
//        System.out.println("Enter x:");
//        float x = Float.parseFloat(scanner.nextLine());
//        System.out.println("Enter y:");
//        float y = Float.parseFloat(scanner.nextLine());
//        example1.setXY(x,y);
//        System.out.println(Arrays.toString(example1.getXY()));
    }
}
