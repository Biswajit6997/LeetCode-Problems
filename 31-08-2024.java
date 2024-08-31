//Approach-1 (Recursion + Memoization) - (TLE)
//T.C : O(n^3)
//S.C : O(n^2)
class Solution {
    private int[][] dp;

    private boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    private int solve(String s, int i, int j) {
        if (i >= j) {
            return 0;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        
        if (isPalindrome(s, i, j)) {
            return dp[i][j] = 0;
        }

        int minCuts = Integer.MAX_VALUE;
        for (int k = i; k <= j - 1; k++) {
            int temp = 1 + solve(s, i, k) + solve(s, k + 1, j);
            minCuts = Math.min(minCuts, temp);
        }

        return dp[i][j] = minCuts;
    }

    public int minCut(String s) {
        int n = s.length();
        dp = new int[n][n];

        // Initialize the dp array to -1
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return solve(s, 0, n - 1);
    }
}
