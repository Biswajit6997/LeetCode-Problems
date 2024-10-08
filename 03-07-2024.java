//Approach-1 (Using complete sorting)
//T.C : O(nlogn)
//S.C : O(1)
class Solution {
    public int minDifference(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if (n <= 4) {
            return 0;
        }
        int result = Integer.MAX_VALUE;
        result = Math.min(result, nums[n - 4] - nums[0]);
        result = Math.min(result, nums[n - 1] - nums[3]);
        result = Math.min(result, nums[n - 3] - nums[1]);
        result = Math.min(result, nums[n - 2] - nums[2]);

        return result;
    }
}