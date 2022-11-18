package AbstractAndInterface;

public abstract class Geomatric {
    private String color;
    public Geomatric (){}
    public Geomatric (String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public abstract double getArea ();
    public abstract double getPerimeter ();

    public double resize() {
        return 0;
    }
}
