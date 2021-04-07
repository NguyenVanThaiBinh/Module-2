package task1;

public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point(1.5, 6.7);
        Point p2 = new Point(2.8, 3.2);

        System.out.println(p1.distance(p2));
        //p1 mang giá trị this.x còn p2 mang giá trị x
        System.out.println(p1.distance(2.34, 7.8));
    }
}
