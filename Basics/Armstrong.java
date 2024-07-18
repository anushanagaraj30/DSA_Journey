import java.util.*;

public class Armstrong {

    public static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    public static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;
        int digits = countDigits(num);
        while (num > 0) {
            int rem = num % 10;
            sum += Math.pow(rem, digits);
            num /= 10;
        }
        return sum == original;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
    }
}