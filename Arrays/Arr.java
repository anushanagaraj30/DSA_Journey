import java.util.*;

public class Arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks;
        marks = new int[5];
        System.out.println("Enter the array elements");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }
        System.out.println("The array elements are");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
        System.out.println("The array elements are");
        for (int i : marks) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("The array elements are");
        System.out.println(Arrays.toString(marks));

        String str[] = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
