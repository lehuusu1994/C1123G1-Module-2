package geometric_object;

public class ResizeableTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10,20);
        System.out.println("Hình chữ nhật trước khi thay đổi kích thước :");
        System.out.println(rectangle);
        System.out.println("Hình chữ nhật sau khi tăng  kích thước :");
        rectangle.resize(50);
        System.out.println(rectangle);
        System.out.println("Hình chữ nhật sau khi giảm kích thước :");
        rectangle.resize(-40);
        System.out.println(rectangle);

        System.out.println("_____________");
        Circle circle = new Circle(10);
        System.out.println("Hình tròn trước khi tăng kích thước :");
        System.out.println(circle);
        System.out.println("Hình tròn sau khi tăng kích thước :");
        circle.resize(50);
        System.out.println(circle);
    }
}
