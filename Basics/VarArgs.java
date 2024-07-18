import java.util.*;

public class VarArgs {
    public static void main(String args[]) {
        add("Anusha", "Jeevan", 10, 20, 30);
    }

    public static void add(String a, String b, int... n) {
        System.out.println(a + b);
        System.out.println(Arrays.toString(n));
    }
}
