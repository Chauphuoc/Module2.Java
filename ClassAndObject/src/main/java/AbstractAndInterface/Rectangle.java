package AbstractAndInterface;

public class Rectangle extends Geomatric implements Comparable<Rectangle>, Resizeable{
    private double width;
    private double height;
    public Rectangle(){}
    public Rectangle(double width, double height){
        super();
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }

    @Override
    public double getPerimeter() {
        return (this.width + this.height)*2;
    }

    @Override
    public String toString() {
        return String.format("Width: %s, Height: %s,Area: %s,Perimeter: %s",this.width,this.height,getArea(),getPerimeter());
    }

    @Override
    public int compareArea(Rectangle obj) {
        if (this.getArea()> obj.getArea()){
            return 1;
        }
        else if (this.getArea()==obj.getArea()){
            return 0;
        }
        else {return -1;}
    }

    @Override
    public int comparePerimeter(Rectangle obj) {
        if (this.getPerimeter()> obj.getPerimeter()){
            return 1;
        }
        else if (this.getPerimeter()==obj.getPerimeter()){
            return 0;
        }
        else {return -1;}
    }

    @Override
    public double resize(double percent) {
        this.width = width * percent;
        this.height = height * percent;
        return percent;
    }
}
