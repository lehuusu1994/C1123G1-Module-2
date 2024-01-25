package point2d_point3d;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(2.0f,3.0f);
        System.out.println(point2D);
        System.out.println(Arrays.toString(point2D.getXY()));

        Point3D point3D = new Point3D(1.0f,2.0f,3.0f);
        point3D.setXYZ(2.0f,3.0f,4.0f);

        System.out.println(point3D);
    }
}
