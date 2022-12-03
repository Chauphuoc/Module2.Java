package ShapeMain;

public class Circle extends Shape {
    double radius;
    Circle (){
        this.radius = 1;
    }
    Circle (String color, boolean filled){
       super(color, filled);
    }
    Circle (String color, boolean filled,double radius){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getAria (){
        return radius*radius*Math.PI;
    }
    public double getPerimeter (){
        return radius*2*Math.PI;
    }
    public String toString (){
        return "A Circle with radius="+radius+", which is a subclass of"+super.toString();
    }
}
