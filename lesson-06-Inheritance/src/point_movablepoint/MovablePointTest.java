package point_movablepoint;

import java.util.Arrays;

public class MovablePointTest {
    public static void main(String[] args) {
      MovablePoint movablePoint = new MovablePoint(1.0f,1.0f,2.0f,2.0f);
        System.out.println("Tọa độ ban đầu :");
        System.out.println(movablePoint);
        System.out.println("Tốc độ duy chuyển :" +"(" + movablePoint.getxSpeed() + "," + movablePoint.getYSpeed() +")");
        System.out.println("Tọa độ sau khi duy chuyển :" );
        movablePoint.move();
        System.out.println(movablePoint);
    }
}
