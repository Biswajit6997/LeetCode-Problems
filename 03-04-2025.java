public class Solution {
    public long maximumTripletValue(int[] nums) {
        long maxTripletValue = 0;
        int maxNum = 0;
        int maxDiff = 0;

        for (int num : nums) {
            maxTripletValue = Math.max(maxTripletValue, (long) maxDiff * num);
            maxNum = Math.max(maxNum, num);
            maxDiff = Math.max(maxDiff, maxNum - num);
        }

        return maxTripletValue;
    }
}
