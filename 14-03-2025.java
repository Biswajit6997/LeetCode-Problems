
//Approach-2 (Binary Search on answer)
//T.C : O(n * log(maxC)), maxC = maximum candy value
//S.C : O(1)
class Solution {
    private boolean canDistr(int[] candies, int mid, long k) {
        int n = candies.length;

        for (int i = 0; i < n; i++) {
            k -= candies[i] / mid;

            if (k <= 0) { // all children got mid candies
                return true; // Early return
            }
        }

        return k <= 0; // all children got the mid candies
    }

    public int maximumCandies(int[] candies, long k) {
        int n = candies.length;

        int maxC = 0;
        long total = 0;
        for (int i = 0; i < n; i++) {
            total += candies[i];
            maxC = Math.max(maxC, candies[i]);
        }

        if (total < k) {
            return 0;
        }

        int l = 1;
        int r = maxC;
        int result = 0;
        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (canDistr(candies, mid, k)) {
                result = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return result;
    }
}