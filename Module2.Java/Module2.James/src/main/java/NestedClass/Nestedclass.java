package NestedClass;

public class Nestedclass {
    int x = 10;

    public class InnerClassAA {
        int y = 5;
    }
    public void add (){
        System.out.println("Hello");


    }

    public String toStringaa() {
        return super.toString();
    }

    public static void main(String[] args) {
        Nestedclass exam2 = new Nestedclass();
        Nestedclass.InnerClassAA item = exam2.new InnerClassAA();

    }
}
