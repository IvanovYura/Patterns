package Factory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Iurii_Ivanov on 10/24/2017.
 */
public class FactoryDemo {

    public static void main(String[] args) {
        printShapes(createListOfShapes());
    }

    private static List<Shape> createListOfShapes() {
        Factory factory = new Factory();
        List<Shape> list = new ArrayList<Shape>();

        Shape shape1 = factory.getShape("CIRCLE");
        Shape shape2 = factory.getShape("RECTANGLE");
        Shape shape3 = factory.getShape("SQUARE");
        list.add(shape1);
        list.add(shape2);
        list.add(shape3);

        return list;
    }

    private static void printShapes(List<Shape> list) {
        for (Shape shape : list) {
            shape.draw();
        }
    }

}
