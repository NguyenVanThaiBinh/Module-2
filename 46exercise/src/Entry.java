import java.awt.Point;

class Entry{
    public static void main(String[] args) {
        Point begin = new Point(1,1);
        Point end = new Point(2,2 );
        Line line1 = new Line(begin,end);
        System.out.printf("%2.5f",line1.getLength());
    }
}