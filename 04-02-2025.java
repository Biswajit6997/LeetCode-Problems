//Approach-1 (Brute Force)
//T.C : O(n^2)
//S.C : O(1)
class Solution {
    public int maxAscendingSum(int[] nums) {
        int n = nums.length;

        int maxSum = 0;

        for (int i = 0; i < n; i++) {
            int sum = nums[i];
            int j = i + 1;
            while (j < n && nums[j] > nums[j - 1]) {
                sum += nums[j];
                j++;
            }
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
}
