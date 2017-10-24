package Factory;

/**
 * Created by Iurii_Ivanov on 10/24/2017.
 */
public class Factory {

    public Shape getShape(String shapeType)
    {
        switch (shapeType.toUpperCase()) {
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            case "SQUARE":
                return new Square();
        }
        return null;
    }

}
