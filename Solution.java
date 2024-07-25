public class Solution {
    public static int removeElement(int[] nums, int val) {
        // Index to place the next non-val element
        int index = 0;

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is not equal to val
            if (nums[i] != val) {
                // Place it at the current index position
                nums[index] =  nums[i];
                // Move the index forward
                index++;
            }
        }

        // Return the number of elements that are not equal to val
        return index;
    }
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        Solution solution = new Solution();
        int k = solution.removeElement(nums, val);
        System.out.println(k); // Output: 2
        // The modified nums array is [2, 2, _, _] (only the first 2 elements are valid)
        
    }
    
}
