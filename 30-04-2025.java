//T.C : O(n * log10m)
//S.C : O(1)
class Solution {
    public int findNumbers(int[] nums) {
        int result = 0;
        for (int num : nums) {
            String str = Integer.toString(num);
            if (str.length() % 2 == 0) {
                result++;
            }
        }
        return result;
    }
}