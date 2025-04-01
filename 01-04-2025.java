class Solution {
    public long mostPoints(int[][] questions) {
        int n = questions.length;
        Long[] dp = new Long[n];  // Memoization array
        return solve(0, questions, dp);
    }

    private long solve(int i, int[][] questions, Long[] dp) {
        if (i >= questions.length) return 0;  // Base case

        if (dp[i] != null) return dp[i];  // Check memoized result

        // Option 1: Solve current question and jump to next available one
        long solve = questions[i][0] + solve(i + questions[i][1] + 1, questions, dp);

        // Option 2: Skip current question
        long skip = solve(i + 1, questions, dp);

        return dp[i] = Math.max(solve, skip);  // Store result
    }
}
