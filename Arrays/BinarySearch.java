public class BinarySearch {

    static int Search(int[] arr, int key) {

        int start = 0;
        int end = arr.length;
        while (start <= end) {
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

    public static void main(String[] args) {
        int[] arr = { 0, 2, 3, 4, 15, 16, 18, 22, 45, 89 };
        int key = 22;
        int index = Search(arr, key);
        if (index != -1) {
            System.out.println(key + " is present in the array at index " + index);
        } else {
            System.out.println(key + " is not present in the array");
        }
    }
}
