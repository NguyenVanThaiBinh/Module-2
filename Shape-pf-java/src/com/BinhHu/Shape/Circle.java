package com.BinhHu.Shape;

public class Circle extends Shape {
    private double radius = 1.0;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter(){
        return 2*radius*Math.PI;
    }
    public String toString(){

        return  super.toString()+
                "\nArea: "
                +getArea()
                +"\nPerimeter: "
                +getPerimeter();

    }

}
