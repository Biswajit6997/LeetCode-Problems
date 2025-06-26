//Approach-1 (Using Recursion)
//T.C : O(2^n), take and skip
//S.C : O(1) auxiliary space, and O(n) of recursion stack
class Solution {
    int n;

    private int solve(String s, int k, int i) {
        if (i < 0)
            return 0;

        int take = 0;
        int bit = s.charAt(i) - '0';
        long value = (bit == 1 ? (1L << (n - i - 1)) : 0);

        if (value <= k) {
            take = 1 + solve(s, (int)(k - value), i - 1);
        }

        int skip = solve(s, k, i - 1);
        return Math.max(take, skip);
    }

    public int longestSubsequence(String s, int k) {
        n = s.length();
        return solve(s, k, n - 1);
    }
}