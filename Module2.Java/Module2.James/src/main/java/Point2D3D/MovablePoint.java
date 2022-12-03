package Point2D3D;

import java.util.Arrays;

public class MovablePoint extends Point {
    protected float xSpeed;
    protected float ySpeed;
    public MovablePoint(){

    }
    public MovablePoint(float xSpeed,float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }
    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed (float xSpeed,float ySpeed){
        this.xSpeed =xSpeed;
        this.ySpeed =ySpeed;
    }

    public float [] getSpeed (){
        float [] array = {this.xSpeed,this.ySpeed};
        return array;
    }
    public void move (){
        this.setX(getX()+getxSpeed());
        this.setY(getY()+getySpeed());
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
    public void Print (){
        System.out.println(super.toString());
    }
    public static void main(String[] args) {
        MovablePoint exam1 = new MovablePoint(5,10,20,50);
        System.out.println(Arrays.toString(exam1.getSpeed()));
        System.out.println(exam1.toString());
        exam1.move();
        exam1.Print();
    }
}
