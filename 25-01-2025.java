//Approach-1 (Brute Force)
//T.C : O(n^3)
//S.C : O(1)
class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            while (true) {
                int smallValue = nums[i];
                int idx = -1;

                for (int j = i + 1; j < n; j++) {
                    if (Math.abs(nums[i] - nums[j]) <= limit) {
                        if (nums[j] < smallValue) {
                            smallValue = nums[j];
                            idx = j;
                        }
                    }
                }

                if (idx != -1) {
                    // Swap the values
                    int temp = nums[i];
                    nums[i] = nums[idx];
                    nums[idx] = temp;
                } else {
                    break;
                }
            }
        }

        return nums;
    }
}
