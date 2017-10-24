package Factory;

import utils.Logger;

/**
 * Created by Iurii_Ivanov on 10/24/2017.
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        Logger.log("I have drown a circle");
    }
}
