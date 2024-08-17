class Solution {
    public long maxPoints(int[][] points) {
        int m = points.length;
        int n = points[0].length;
        
        // DP array to store the maximum points of each column in the current row
        long[] dp = new long[n];
        
        // Copy the first row to the DP array
        for (int j = 0; j < n; j++) {
            dp[j] = points[0][j];
        }
        
        // Iterate over the rows
        for (int i = 1; i < m; i++) {
            // Temporary array to store the maximum points for the current row
            long[] temp = new long[n];
            
            // Calculate the left-to-right max values
            long leftMax = dp[0];
            for (int j = 0; j < n; j++) {
                leftMax = Math.max(leftMax, dp[j] + j);
                temp[j] = Math.max(temp[j], points[i][j] - j + leftMax);
            }
            
            // Calculate the right-to-left max values
            long rightMax = dp[n - 1] - (n - 1);
            for (int j = n - 1; j >= 0; j--) {
                rightMax = Math.max(rightMax, dp[j] - j);
                temp[j] = Math.max(temp[j], points[i][j] + j + rightMax);
            }
            
            // Update the DP array with the current row values
            dp = temp;
        }
        
        // The maximum value in the last row of DP array is the answer
        long maxPoints = 0;
        for (int j = 0; j < n; j++) {
            maxPoints = Math.max(maxPoints, dp[j]);
        }
        
        return maxPoints;
    }
}
