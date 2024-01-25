package point_movablepoint;

import java.util.Arrays;

public class MovablePointTest {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(2.0f,3.0f);
        System.out.println(movablePoint);
        float [] arrSpeed = movablePoint.getSpeed();
        System.out.println(Arrays.toString(arrSpeed));
    }
}
