class Solution {
    public int findMaxFish(int[][] grid) {
        int maxFish = 0;

        // Iterate through all cells in the grid
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] > 0) { // Start DFS if the cell has fish
                    maxFish = Math.max(maxFish, dfs(grid, i, j));
                }
            }
        }
        return maxFish;
    }

    // DFS to explore the connected water cells
    private int dfs(int[][] grid, int i, int j) {
        // Check if the current cell is out of bounds or already visited
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0) {
            return 0;
        }

        int fishCount = grid[i][j]; // Record the fish count in the current cell
        grid[i][j] = 0; // Mark the cell as visited by setting it to 0

        // Explore all four directions
        fishCount += dfs(grid, i + 1, j);
        fishCount += dfs(grid, i - 1, j);
        fishCount += dfs(grid, i, j + 1);
        fishCount += dfs(grid, i, j - 1);

        return fishCount;
    }
}
