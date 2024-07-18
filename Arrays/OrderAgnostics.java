public class OrderAgnostics {

    static int OrderAgnosticBS(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key) {
                return mid;
            }

            if (isAsc) {
                if (arr[mid] > key) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] < key) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // int[] arr1 = { 10, 20, 30, 40, 50, 60, 70 };
        // int key1 = 30;
        int[] arr2 = { 100, 95, 65, 45, 30, 10 };
        int key2 = 95;
        int index = OrderAgnosticBS(arr2, key2);
        if (index != -1) {
            System.out.println(key2 + " is present at the index " + index);
        } else {
            System.out.println(key2 + " is not present ");
        }
    }
}
