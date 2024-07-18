public class LeetCode852 {

    static int BinarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key)
                return mid;
            else if (arr[mid] > key)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }

    public static void main(String args[]) {
        int[] arr = { 10, 20, 30, 40, 50, 60 };
        int key = 30;
        int index = BinarySearch(arr, key);
        if (index != -1) {
            System.out.println(key + " is present in the array at index " + index);
        } else {
            System.out.println(key + " is not present in the array");
        }
    }
}
