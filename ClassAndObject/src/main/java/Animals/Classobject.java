package Animals;


public class SimpleCircle {
    String name;
    String address;
    int age;
    public void moving (String name){
        System.out.println(name + "is moving");

    }
    public static void main (String [] args){
        SimpleCircle circle1 = new SimpleCircle();
        SimpleCircle circle2 = new SimpleCircle();
        circle1.moving("Anh A");
        circle2.moving("Anh B");
    }
}

