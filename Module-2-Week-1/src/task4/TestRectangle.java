package task4;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setLength(5f);
        r1.setWidth(4f);
        System.out.println(r1.toString());
        System.out.println("Perimeter is: "+r1.getPerimeter());
        System.out.println("Area is: "+r1.getArea());
    }
}
