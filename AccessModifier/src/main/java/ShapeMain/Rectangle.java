package ShapeMain;

public class Rectangle extends  Shape{
    double width;
    double height;
    Rectangle (){
        this.width = 1;
        this.height = 1;
    }
    Rectangle (String color,boolean filled){
        super(color,filled);
    }
    Rectangle (String color,boolean filled,double width, double height){
        super(color, filled);
        this.width = width;
        this.height = height;
    }
    void setWidth (double newWidth){
        this.width = newWidth;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea (){
        return width * height;
    }
    public double getPerimeter (){
        return (width+height)*2;
    }
    public String toString (){
        return "A Rectangle with width="+width+ "and height="+height+ ",which is a subclass of"+ super.toString();
    }
}
