package Animals;


public class Fan {
    public final int slow =1;
    public final int medium =2;
    public final int fast = 3;
    private int speed =1;
    private boolean on = true;
    private double radius = 5;
    private String color = "blue";

    public int getSlow(){
        return slow;
    }
    public int getMedium(){
        return medium;
    }
    public int getFast(){
        return fast;
    }
    public int getSpeed (){
        return speed;
    }
    public boolean turnOn (){
        return on;
    }
    public String getColor (){
        return color;
    }
    public double getRadius (){
        return radius;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setRadius(double newradius){
        this.radius = newradius;
    }
    public void  setTurnon (){
        this.on = on;
    }
    public Fan(){

    }
    public Fan(int speed, boolean on, String color, double radius) {
        this.speed = speed;
        this.on = on;
        this.color = color;
        this.radius = radius;
    }
    public static void main(String[] args){
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.medium);
        fan1.setRadius(7);
        String string="";
        if (!fan1.on){
            System.out.println("fan is turn on,speed:"+fan1.getSpeed()+", Color is:"+fan1.getColor()+"Radius:"+fan1.getRadius());
        }
        else {
            fan1.setSpeed(fan1.slow);
            fan1.setColor("Black");
            fan1.setRadius(1);
            System.out.println("fan is turn off,speed:"+fan1.getSpeed()+", Color is:"+fan1.getColor()+"Radius:"+fan1.getRadius());
        }
    }
}
