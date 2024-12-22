class Solution {
    public static boolean matSearch(int mat[][], int x) {
        int rows = mat.length; // Number of rows
        int cols = mat[0].length; // Number of columns
        
        // Start searching from the top-right corner of the matrix
        int row = 0, col = cols - 1;

        while (row < rows && col >= 0) {
            if (mat[row][col] == x) {
                return true; // Element found
            } else if (mat[row][col] > x) {
                col--; // Move left
            } else {
                row++; // Move down
            }
        }
        return false; // Element not found
    }
}
