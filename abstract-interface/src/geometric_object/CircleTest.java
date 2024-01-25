package geometric_object;

public class CircleTest {
    public static void main(String[] args) {
        Circle cr1 = new Circle();
        Circle cr2 = new Circle(3.0);
        Circle cr3 = new Circle("Red",false,5.0);
        System.out.println(cr1);
        System.out.println(cr2);
        System.out.println(cr3);

    }

}
