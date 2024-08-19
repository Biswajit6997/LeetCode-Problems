public class Solution {
    public int minSteps(int n) {
        int[] dp = new int[n + 1];
        
        for (int i = 2; i <= n; i++) {
            dp[i] = i; // In the worst case, you need i steps (i times Paste after Copy All)
            for (int j = 1; j * j <= i; j++) {
                if (i % j == 0) {
                    dp[i] = Math.min(dp[i], dp[j] + (i / j));
                    dp[i] = Math.min(dp[i], dp[i / j] + j);
                }
            }
        }
        
        return dp[n];
    }
}
