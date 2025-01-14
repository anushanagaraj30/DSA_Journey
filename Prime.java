import java.util.*;

public class Prime {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        if (isPrime(n)) {
            System.out.println(n + " is a prime number");
        } 
        else {
            System.out.println(n + " is not a prime number");
        }
    }
}
