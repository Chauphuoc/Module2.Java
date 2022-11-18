package AnimalAndEdible;

public class Test {
    public static void main(String[] args) {
        Animals [] animals = new Animals[2];
        animals [0] = new Tiger();
        animals [1] = new Chicken();
        for (Animals animal : animals){
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken){
               Edible edible = (Chicken) animal;
                System.out.println(edible.eat());
            }
        }

        Fruit [] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits [1] = new Apple();
        for (Fruit i : fruits){

            if (i instanceof Orange){
                Orange x = (Orange) i;
                System.out.println(x.eat());
            }
        }

    }
}
