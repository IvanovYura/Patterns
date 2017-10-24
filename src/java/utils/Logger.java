package utils;

/**
 * Created by Iurii_Ivanov on 10/24/2017.
 */
public class Logger {

    public static void log(String msg) {
        System.out.println(msg);
    }

    public static void log(Throwable t) {
        System.out.println(t.toString());
    }

}
