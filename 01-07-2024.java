class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        // Loop through the array up to the third last element
        for (int i = 0; i < arr.length - 2; i++) {
            // Check if current and next two elements are all odd
            if (arr[i] % 2 != 0 && arr[i + 1] % 2 != 0 && arr[i + 2] % 2 != 0) {
                return true; // Found three consecutive odd numbers
            }
        }
        return false; // No such sequence found
    }
}
