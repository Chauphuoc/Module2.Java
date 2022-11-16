package Point2D3D;

import java.util.Arrays;
import java.util.Scanner;

public class Point3D extends Point2D {
    public float z;
    Point3D (){

    }
    Point3D (float x, float y, float z){
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ (float x, float y, float z){

        this.array = new float[3];
        array[0]=x;
        array[1]=y;
//       super.setXY(x,y);
        array[2]=z;
    }
    public float[] getXYZ (){
        return array;
    }
    public String toString (){
        return "Mang cha:"+ super.toString()+","+"Mang con"+Arrays.toString(getXYZ());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap x:");
        float x = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhap y:");
        float y = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhap z:");
        float z = Float.parseFloat(scanner.nextLine());
        Point3D exam1 = new Point3D(x,y,z);
        exam1.setXYZ(x,y,z);
        System.out.println(exam1.toString());
    }


}
