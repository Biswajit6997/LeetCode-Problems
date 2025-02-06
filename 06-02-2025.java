/ Approach-1 (Brute Force)
// T.C : O(n^4)
// S.C : O(1)
class Solution {
    public int tupleSameProduct(int[] nums) {
        int totalNumberOfTuples = 0;
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    for (int l = k + 1; l < n; l++) {
                        if (i != k && i != l && j != k && j != l) {
                            int product1 = nums[i] * nums[j];
                            int product2 = nums[k] * nums[l];
                            
                            if (product1 == product2) {
                                totalNumberOfTuples++;
                            }
                        }
                    }
                }
            }
        }
        return (totalNumberOfTuples / 2) * 8;
    }
}