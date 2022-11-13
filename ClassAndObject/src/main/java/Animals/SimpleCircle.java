package Animals;

public class SimpleCircle {
       double radius;

       public SimpleCircle(double newRadius){
           radius = newRadius;
       }
       double getArea (){
           return radius*radius*Math.PI;
       }
       double getPerimeter (){
           return 2*radius*Math.PI;
       }
       void setRadius (double newRadius){
           radius = newRadius;
       }

        public static void main(String[] args) {
        SimpleCircle circle1 = new SimpleCircle(2);
            System.out.println("The area of circle of radius "+circle1.radius+ " is "+circle1.getArea());
            circle1.setRadius(25);
            System.out.println("The area of circle of radius "+circle1.radius+ " is "+circle1.getArea());
        }

    }