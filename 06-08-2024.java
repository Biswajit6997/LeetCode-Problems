import java.util.Arrays;

public class Solution {
    public int minimumPushes(String word) {
        int[] count = new int[26];
        
        // Count frequency of each character
        for (char c : word.toCharArray()) {
            count[c - 'a']++;
        }
        
        // Sort frequencies in descending order
        Arrays.sort(count);
        
        int pushes = 0;
        // Calculate the minimum number of pushes
        for (int i = 0; i < 26; ++i) {
            pushes += (i / 8 + 1) * count[25 - i];
        }
        
        return pushes;
    }
}
