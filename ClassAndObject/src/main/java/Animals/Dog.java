package Animals;

public class Dog {
    public String name="Ki Ki";
    public String breed="Viet nam" ;
    public int size = 14;
    public int age=11;
    public String color="blue";
    public Dog (){
    }
    public Dog (String name,String breed, int size, int age, String color){
        this.name = name;
        this.breed = breed;
        this.size = size;
        this.age = age;
        this.color = color;
    }
    public void setName (String newName){
        this.name = newName;
    }
    public String getName (){
        return name;
    }
    public void setAge(int newAge){
        this.age = newAge;
    }
    public int getAge(){
        return  age;
    }
    public String display (){
        return "His name is:"+name+"\n His breed is: "+breed+"\n His age is:"+age+"\n His size is:"+size+"\n His color is:"+color;
    }
    public static void main(String[] args){
        Dog dog1 = new Dog();
        System.out.println(dog1.display());
        System.out.println();
        Dog dogTom = new Dog("Lulu","Phu Quoc",14,10,"Black");
        System.out.println(dogTom.display());
    }
}
