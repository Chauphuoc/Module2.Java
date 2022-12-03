package AbstractAndInterface;

public class Circle extends Geomatric implements Comparable<Circle> , Resizeable {
    private double radius;
    public Circle (){}
    public Circle (double radius){
        super();
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return this.radius*this.radius*Math.PI;
    }

    @Override
    public double getPerimeter() {
        return this.radius*2*Math.PI;
    }
    public String toString() {
        return String.format("Radius: %s,Area: %s",this.radius,getArea());
    }

    @Override
    public int compareArea(Circle obj) {
        if (this.getArea()>obj.getArea()){
            return 1;
        }
        else if (this.getArea()==obj.getArea()){
            return 0;
        }
        else {return -1;}
    }

    @Override
    public int comparePerimeter(Circle obj) {
        if (this.getPerimeter()>obj.getPerimeter()){
            return 1;
        }
        else if (this.getPerimeter()==obj.getPerimeter()){
            return 0;
        }
        else {return -1;}
    }

    @Override
    public double resize(double percent) {
        this.radius = this.radius * percent;
        return radius;
    }
}
