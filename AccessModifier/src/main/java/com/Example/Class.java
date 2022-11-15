package com.Example;

class Geomatric {
    private String color;
    private  String filled;
    public Geomatric (){

    }
    public Geomatric (String color, String filled){
        this.color = color ;
        this.filled = filled;
    }
    public String getColor (){
        return this.color;
    }
    public void setColor (String newColor){
        this.color = newColor;
    }
    public String getFilled (){
        return this.filled;
    }
    public void setFilled (String newFilled){
        this.filled = newFilled;
    }
    public String toString (){
        return "created with \"" + color + "\" color and " +
                (filled == null ? "no fill" : "filled with \"" + filled + "\" color");
    }

}
