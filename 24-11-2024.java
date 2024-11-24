class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long totalSum = 0;  // Sum of absolute values of all elements
        int minAbsValue = Integer.MAX_VALUE; // Smallest absolute value in the matrix
        int negativeCount = 0; // Count of negative elements
        
        for (int[] row : matrix) {
            for (int num : row) {
                totalSum += Math.abs(num);
                if (num < 0) negativeCount++;
                minAbsValue = Math.min(minAbsValue, Math.abs(num));
            }
        }
        
        // If the count of negatives is odd, subtract twice the smallest absolute value
        if (negativeCount % 2 != 0) {
            totalSum -= 2L * minAbsValue;
        }
        
        return totalSum;
    }
}
