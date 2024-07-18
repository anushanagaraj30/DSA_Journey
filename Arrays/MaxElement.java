import java.util.Arrays;

public class MaxElement {

    static int maxElement(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        if (arr == null) {
            return -1;
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        System.out.println(Arrays.toString(arr));
        int max = maxElement(arr);
        System.out.println("The maximum element is " + max);
    }
}
