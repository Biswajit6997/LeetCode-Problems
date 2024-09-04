import java.util.*;

class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        // Use a HashSet to store obstacle positions
        Set<List<Integer>> obstacleSet = new HashSet<>();
        for (int[] obstacle : obstacles) {
            obstacleSet.add(Arrays.asList(obstacle[0], obstacle[1]));
        }

        int ans = 0;
        // Directions: North, East, South, West
        int[][] dir = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int x = 0, y = 0, k = 0;

        for (int c : commands) {
            if (c == -1) {
                k = (k + 1) % 4;
            } else if (c == -2) {
                k = (k - 1 + 4) % 4;
            } else {
                for (int j = 0; j < c; j++) {
                    int newX = x + dir[k][0];
                    int newY = y + dir[k][1];

                    // Check if the new position is an obstacle
                    if (obstacleSet.contains(Arrays.asList(newX, newY))) {
                        break;
                    }

                    x = newX;
                    y = newY;
                    ans = Math.max(ans, x * x + y * y);
                }
            }
        }

        return ans;
    }
}
