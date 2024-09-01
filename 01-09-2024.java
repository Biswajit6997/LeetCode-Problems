//Approach-1 (Using simply simulation)
//T.C : O(m*n)
//S.C : O(1) //no including space of result
class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        // Check if the product of m and n is equal to the size of the original array
        if (m * n != original.length) {
            return new int[0][0];  // Return an empty 2D array if the sizes don't match
        }

        // Initialize the result 2D array
        int[][] result = new int[m][n];

        // Index for the original array
        int idx = 0;

        // Fill the 2D array row by row
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = original[idx];
                idx++;
            }
        }

        return result;  // Return the constructed 2D array
    }
}

