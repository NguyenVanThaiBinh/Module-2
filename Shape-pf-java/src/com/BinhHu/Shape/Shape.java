package com.BinhHu.Shape;

public class Shape {
    private String color = "red";

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Shape(){

    }
    public String toString(){
        return "Shape with color: "
                +this.color
                +" \nand fill is: "
                + (this.filled ? " filled": "not filled");
    }

    private boolean filled = true;

}
