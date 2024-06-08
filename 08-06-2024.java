import java.util.HashMap;

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        
        // Create a HashMap to store remainders and their indices
        HashMap<Integer, Integer> mp = new HashMap<>();
        
        // Initialize with remainder 0 at index -1
        mp.put(0, -1);
        
        int sum = 0;
        
        // Iterate through the array
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            
            // Calculate remainder of current sum divided by k
            int remainder = sum % k;
            
            // Adjust for negative remainders to ensure they are positive
            if (remainder < 0) {
                remainder += k;
            }
            
            // Check if this remainder has been seen before
            if (mp.containsKey(remainder)) {
                // If the subarray length is at least 2
                if (i - mp.get(remainder) >= 2) {
                    return true;
                }
            } else {
                // Store the index of this remainder
                mp.put(remainder, i);
            }
        }
        
        // If no valid subarray is found, return false
        return false;
    }
}
