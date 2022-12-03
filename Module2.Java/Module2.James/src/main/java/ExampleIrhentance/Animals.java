package ExampleIrhentance;

public class Animals {
    protected String name;

    public Animals(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void eating (){
        System.out.println("Iam eating");
    }
    public void bark (){
        System.out.println("He is barking");
    }
}
