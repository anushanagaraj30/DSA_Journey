import java.util.*;

public class PassingArguments {

    static void changeValue(String name) {
        name = "Rocky";
    }

    public static void main(String[] args) {
        String name = "Minty";
        System.out.println(name);
        changeValue(name);
        System.out.println(name);
    }
}
