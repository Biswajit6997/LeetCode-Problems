//Approach (Using simple Greedy)
//T.C : O(m+n)
//S.C : O(m*n) //You can exclude this because it is what is expected to return from the function
class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int m = rowSum.length;
        int n = colSum.length;
        int[][] matrix = new int[m][n];
        
        int i = 0, j = 0;
        while (i < m && j < n) {
            matrix[i][j] = Math.min(rowSum[i], colSum[j]);

            rowSum[i] -= matrix[i][j];
            colSum[j] -= matrix[i][j];

            if (rowSum[i] == 0) i++;
            if (colSum[j] == 0) j++;
        }
        
        return matrix;
    }
}