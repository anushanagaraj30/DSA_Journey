public class LeetCode1672 {

    static int maxWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] accounts = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 3, 1, 1 }
        };
        int result = maxWealth(accounts);
        System.out.println(result);
    }
}