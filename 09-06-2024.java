import java.util.HashMap;
import java.util.Map;

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> prefixModCount = new HashMap<>();
        prefixModCount.put(0, 1); // To handle the case where the prefix sum itself is divisible by k
        
        int count = 0;
        int prefixSum = 0;
        
        for (int num : nums) {
            prefixSum += num;
            int mod = (prefixSum % k + k) % k; // Handle negative mod values
            
            if (prefixModCount.containsKey(mod)) {
                count += prefixModCount.get(mod);
            }
            
            prefixModCount.put(mod, prefixModCount.getOrDefault(mod, 0) + 1);
        }
        
        return count;
    }
}
