import java.util.*;

public class LinearSearch2DArray {

    static int[] Search(int[][] arr, int key) {
        if (arr.length == 0)
            return new int[] { -1, -1 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == key)
                    return new int[] { i, j };
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[][] arr = { { 10, 5, 1 },
                { 9, 45, 6 },
                { 15, 20, 100, 70 },
                { 200, 300 }
        };
        int key = 6;
        int[] index = Search(arr, key);
        System.out.println(Arrays.toString(index));
    }
}