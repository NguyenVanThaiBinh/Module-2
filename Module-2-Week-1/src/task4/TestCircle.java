package task4;

public class TestCircle {
    public static void main(String[] args) {
    Circle c1 = new Circle(2,"blue");
        System.out.println(c1.toString());
        c1.setRadius(5);
        c1.setColor("Yellow");
        System.out.println("After set: ");
        System.out.println(c1.toString());



        System.out.println("Area is: "+c1.getArea());
    }


}
