public class LinearSearch {

    static int Search(int[] arr, int key) { // for loop and index
        if (arr.length == 0)
            return -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }

    static boolean Search2(int[] arr, int key) { // for-each loop and boolean
        if (arr.length == 0)
            return false;
        for (int ele : arr) {
            if (ele == key)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 30, 45, 20, 35, 15 };
        int key = 45;
        int index = Search(arr, key);
        if (index != -1) {
            System.out.println(key + " is present at index " + index);
        } else {
            System.out.println(key + " is not present");
        }

        if (Search2(arr, key)) {
            System.out.println(key + " is present");
        } else {
            System.out.println(key + " is not present");
        }
    }
}