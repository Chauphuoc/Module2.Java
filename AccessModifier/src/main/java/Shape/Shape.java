package Shape;

public class Shape {
    String color;
    boolean filled;
    Shape (){
        color = "green";
        filled = true;
    }
    Shape (String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    void setColor (String newColor){
        this.color = newColor;
    }
    void setFilled (boolean newFilled){
        this.filled = newFilled;
    }
    String getColor (){
        return  this.color;
    }
    boolean getFilled (){
        return this.filled;
    }
    public String toString (){
        return  "A Shape with color of"+color +"and"+ "filled"+filled;
    }
}
