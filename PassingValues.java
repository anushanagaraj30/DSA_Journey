import java.util.*;

public class PassingValues {
    public static void changeArray(int num[], String name) {
        name = "RockyMinty";
        num[0] = 100;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5 };
        String n = "Anusha";
        System.out.println(n);
        System.out.println(Arrays.toString(arr));
        System.out.println("***************************************");
        changeArray(arr, n);
        System.out.println(n);
        System.out.println(Arrays.toString(arr));
    }
}