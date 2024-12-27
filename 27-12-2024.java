//Approach-3 (Using O(1) space)
//T.C : O(n)
//S.C : O(1)
class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int n = values.length;

        int result = 0;

        int maxTillNow = values[0] + 0; // this stores the max value of (values[i] + i) till now

        for (int j = 1; j < n; j++) {
            int x = values[j] - j;
            int y = maxTillNow;

            result = Math.max(result, x + y);

            maxTillNow = Math.max(maxTillNow, values[j] + j);
        }

        return result;
    }
}