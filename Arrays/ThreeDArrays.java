import java.util.*;

public class ThreeDArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][][] arr = new int[3][3][3];
        System.out.println("Enter the array elements");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[j].length; k++) {
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }
        System.out.println("The array elements are");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[j].length; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("The array elements are");
        for (int i[][] : arr) {
            for (int j[] : i) {
                for (int k : j) {
                    System.out.print(k + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }

}
