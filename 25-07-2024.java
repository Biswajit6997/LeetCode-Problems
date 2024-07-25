import java.util.*;

class Solution {
    public int[] sortArray(int[] nums) {
        int minE = Arrays.stream(nums).min().getAsInt();
        int maxE = Arrays.stream(nums).max().getAsInt();
        
        Map<Integer, Integer> mp = new HashMap<>();
        
        for (int num : nums)
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        
        int i = 0;
        
        for (int num = minE; num <= maxE; num++) {
            while (mp.getOrDefault(num, 0) > 0) {
                nums[i] = num;
                i++;
                mp.put(num, mp.get(num) - 1);
            }
        }
        
        return nums;
    }
}
