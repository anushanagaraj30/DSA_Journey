public class MaxIn2DArray {
    static int MaxElement(int[][] arr) {
        int max = Integer.MIN_VALUE;

        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr[i].length; j++) {
        // if (arr[i][j] > max)
        // max = arr[i][j];
        // }
        // }

        for (int[] i : arr) {
            for (int j : i) {
                if (i[j] > max)
                    max = i[j];
            }
        }
        return max;

    }

    public static void main(String[] args) {
        int[][] arr = { { 10, 5, 1 },
                { 9, 45, 6 },
                { 15, 20, 100, 70 },
                { 200, 300 }
        };
        int max = MaxElement(arr);
        System.out.println(max);
    }
}
