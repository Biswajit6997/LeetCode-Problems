/Approach-1 (Using simulation)
// T.C : O(n)
// S.C : O(1)
class Solution {
    public long coloredCells(int n) {
        int t = 1;
        long cells = 1;

        while (t <= n) {
            cells += (4L * (t - 1));
            t++;
        }

        return cells;
    }
}

