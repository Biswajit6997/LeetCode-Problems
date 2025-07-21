class Solution {
    public String makeFancyString(String s) {
        StringBuilder result = new StringBuilder();
        int count = 1;  // Start with count 1 for the first character
        
        // Append the first character to the result
        result.append(s.charAt(0));
        
        // Iterate through the string starting from the second character
        for (int i = 1; i < s.length(); i++) {
            // Check if the current character is the same as the previous one
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                count = 1; // Reset count if the current character is different
            }
            
            // Append character if count is less than 3
            if (count < 3) {
                result.append(s.charAt(i));
            }
        }
        
        return result.toString();
    }
}
