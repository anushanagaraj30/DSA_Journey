import java.util.*;

public class PassingReferences {
    int num = 10;
    String name = "Anusha";

    void changeArray(PassingReferences p) {
        num = 100;
        name = "AnushaNagaraj";
    }

    public static void main(String args[]) {
        PassingReferences p = new PassingReferences();
        System.out.println(p.num);
        System.out.println(p.name);
        System.out.println("***************************************");
        p.changeArray(p);
        System.out.println(p.num);
        System.out.println(p.name);

    }
}