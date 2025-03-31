import java.util.*;

class Solution {
    public int maxPartitions(String s) {
        int n = s.length();
        int[] last = new int[26];
        Arrays.fill(last, -1);

        // Store the last occurrence of each character
        for (int i = 0; i < n; i++) {
            last[s.charAt(i) - 'a'] = i;
        }

        int count = 0, curr = -1;
        // Iterate through the string
        for (int i = 0; i < n; i++) {
            curr = Math.max(curr, last[s.charAt(i) - 'a']);
            if (curr == i) {
                count++;
                curr = -1;
            }
        }
        return count;
    }
}
