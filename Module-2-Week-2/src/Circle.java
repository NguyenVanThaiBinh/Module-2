public class Circle extends Shape{
    public Circle(double radius,String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    private double radius = 1.0;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(){

    }

    public Circle(double radius) {
        this.radius = radius;
    }
    public String toString(){
        System.out.println("A Circle with radius= "+radius+" which is a subclass of "+super.toString());
        return null;
    }

}
