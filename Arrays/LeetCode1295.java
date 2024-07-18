
// Find Numbers with Even Number

public class LeetCode1295 {

    static int countDigits(int num) {
        if (num == 0)
            return 1;
        if (num < 0)
            num = num * -1;
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        return count;
    }

    static boolean isEven(int num) {
        int numOfDigits = countDigits(num);
        return numOfDigits % 2 == 0;
    }

    static int totalNumbers(int[] nums) {
        int total = 0;
        for (int i : nums) {
            if (isEven(i))
                total++;
        }
        return total;
    }

    public static void main(String[] args) {
        int[] nums = { 20, 400, 60, 80, 0, -10, -100 };
        int result = totalNumbers(nums);
        System.out.println(result);
    }
}