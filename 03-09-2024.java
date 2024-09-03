class Solution {
    public int getLucky(String s, int k) {
        int sum = 0;
        
        // Convert each character to its corresponding integer value and sum the digits
        for (char c : s.toCharArray()) {
            int val = c - 'a' + 1;
            while (val > 0) {
                sum += val % 10;
                val /= 10;
            }
        }
        
        // Perform the transformation k-1 times
        for (int i = 1; i < k; i++) {
            int temp = 0;
            while (sum > 0) {
                temp += sum % 10;
                sum /= 10;
            }
            sum = temp;
        }
        
        return sum;
    }
}
