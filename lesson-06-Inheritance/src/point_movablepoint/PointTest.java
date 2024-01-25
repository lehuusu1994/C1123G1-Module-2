package point_movablepoint;

import java.util.Arrays;

public class PointTest {
    public static void main(String[] args) {
        Point point = new Point(1.0f, 4.0f);
        System.out.println(point);
        point.setXY(2.0f,5.0f);
        System.out.println(point);
        float [] arr = point.getXY();
        System.out.println(Arrays.toString(arr));
    }
}
