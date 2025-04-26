public class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long count = 0;
        int lastInvalidIndex = -1;    // Index of the last element outside [minK, maxK]
        int lastMinKIndex = -1;       // Most recent index where nums[i] == minK
        int lastMaxKIndex = -1;       // Most recent index where nums[i] == maxK

        for (int i = 0; i < nums.length; i++) {
            // If current element is outside the [minK, maxK] range
            if (nums[i] < minK || nums[i] > maxK) {
                lastInvalidIndex = i;
            }
            // Update lastMinKIndex if current element equals minK
            if (nums[i] == minK) {
                lastMinKIndex = i;
            }
            // Update lastMaxKIndex if current element equals maxK
            if (nums[i] == maxK) {
                lastMaxKIndex = i;
            }
            // Calculate the number of valid subarrays ending at index i
            int validStart = Math.min(lastMinKIndex, lastMaxKIndex);
            if (validStart > lastInvalidIndex) {
                count += validStart - lastInvalidIndex;
            }
        }
        return count;
    }
}