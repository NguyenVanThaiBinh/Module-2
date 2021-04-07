package task1;

public class TestPoint0 {
    public static void main(String[] args) {
        Point3D p3 = new Point3D();
        p3.setXYZ(1,2,3);
        System.out.println(p3.toString());
        for (float x:p3.getXYZ()
             ) {
            System.out.println(x);

        }

    }
}
