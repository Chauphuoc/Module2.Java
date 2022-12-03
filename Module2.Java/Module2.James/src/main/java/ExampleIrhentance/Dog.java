package ExampleIrhentance;

public class Dog extends Animals {

    public Dog(String name) {
        super(name);
    }

    public static void main(String[] args) {
        Dog dogTom = new Dog("Kiki");
        System.out.println(dogTom.getName());
        dogTom.eating();
        dogTom.bark();
    }
}
