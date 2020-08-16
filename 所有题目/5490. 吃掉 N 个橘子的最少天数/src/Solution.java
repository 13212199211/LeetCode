public class Solution {
    public int minDays(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        for (int i = 1; i < n + 1; i++) {
            int methodOne = 1 + dp[i - 1];
            int methodTwo = i % 2 == 0 && i / 2 >= 0 ? 1 + dp[i / 2] : Integer.MAX_VALUE;
            int methodThree = i % 3 == 0 && i / 3 >= 0 ? 1 + dp[i - 2 * i / 3] : Integer.MAX_VALUE;
            dp[i] = Math.min(Math.min(methodOne, methodTwo), methodThree);
        }
        return dp[n];
    }
}
//61455274
//9209408
