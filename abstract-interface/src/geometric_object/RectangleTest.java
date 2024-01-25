package geometric_object;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Rectangle rectangle1 = new Rectangle(5.0,10);
        Rectangle rectangle2 = new Rectangle("Blue",false,4.0,8);
        System.out.println(rectangle);
        System.out.println(rectangle1);
        System.out.println(rectangle2);
    }
}
