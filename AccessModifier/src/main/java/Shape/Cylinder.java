package Shape;

public class Cylinder extends Circle{
    public double height;
    public Cylinder(){
        height = 3;
    }
    public Cylinder (String color, boolean filled,double radius,double height){
        super(color, filled,radius);
        this.height = height;
    }
    public double getHeight (){
        return this.height;
    }
    public void setHeight (double newHeight){
        this.height = newHeight;
    }
    public double volume (){
        return height*radius*Math.PI;
    }
    public String toString (){
        return "A Cylinder with radius="+radius+",height:"+height+".Volume:"+volume()+". "+super.toString();
    }
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder();
        System.out.println(cylinder1);
        Cylinder cylinder2 = new Cylinder("Blue",true,3,8);
        System.out.println(cylinder2);
        Cylinder cylinder3 = new Cylinder("Blue",true,3,8);
        cylinder3.setColor("Black");
        cylinder3.setHeight(6);
        System.out.println(cylinder3);
    }
}
