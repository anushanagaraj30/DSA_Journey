import java.util.*;

public class PassingValues {
    public static void changeArray(int num, String name) {
        num = 10;
        name = "RockyMinty";
    }

    public static void main(String args[]) {
        int num = 100;
        String naam = "Anusha";
        System.out.println(num);
        System.out.println(naam);
        System.out.println("***************************************");
        changeArray(num, naam);
        System.out.println(num);
        System.out.println(naam);

    }
}