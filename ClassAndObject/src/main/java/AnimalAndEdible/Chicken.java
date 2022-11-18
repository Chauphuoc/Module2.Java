package AnimalAndEdible;

public class Chicken extends Animals implements Edible {
    @Override
    public String makeSound() {
        return "cuck tack";
    }

    @Override
    public String eat() {
        return "Chicken is eating";
    }
}
