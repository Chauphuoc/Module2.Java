package ShapeMain;

public class Square extends Rectangle{

    Square (){
    }
    Square (String color,boolean filled){
        super(color,filled);
    }
    Square (String color, boolean filled,double side){
        super(color, filled,side,side);
    }
    public double getSide() {
        return getWidth();
    }
    public void setSide (double side){
        setHeight(side);
        setWidth(side);
    }

//    public void setWidth (double width){
//        setSide(width);
//    }
//    public void setHeight (double height){
//        setSide(height);
//    }
    public String toString (){
        return "A Square with side="+getSide()+", which is a subclass of"+ super.toString();
    }

    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square("Black",true,2.3);
        System.out.println(square);
//
        square = new Square("yellow", true,5.8);
        System.out.println(square);

        square = new Square("yellow", true,5.8);
        square.setSide(8);
        square.setColor("Orange");
        System.out.println(square);
    }
}
