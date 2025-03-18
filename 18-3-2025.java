//Approach-2 (Better)
//T.C : O(n^2)
//S.C : O(1)
class Solution {
    public int longestNiceSubarray(int[] nums) {
        int n = nums.length;
        int result = 0;

        for(int i = 0; i < n; i++) {
            int mask = 0;

            for(int j = i; j < n; j++) {
                if((mask & nums[j]) != 0) {
                    break;
                }

                result = Math.max(result, j - i + 1);
                mask = (mask | nums[j]);
            }
        }

        return result;
    }
}

