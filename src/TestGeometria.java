
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class TestGeometria {
    public static void main(String[] args) {
        Shape shape1 = new Square(1,20);
        Shape shape2 = new Circle(2,10);
        Shape shape3 = new RightTriangle(3, 15);
        Shape shape4 = new Rectangle(4, 15, 2);
        ArrayList<Shape> a = new ArrayList<>();
        a.add(shape1);
        a.add(shape2);
        a.add(shape3);
        a.add(shape4);
        for (Shape s:a) {
            System.out.println(s.toString());
        }
    }
}
