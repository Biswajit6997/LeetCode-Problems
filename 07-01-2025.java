public class 07-01-2025 {
    // Approach-1 (Brute Force)
// T.C : O(m*n^2), m = length of longest string in words, n = size of words
// S.C : O(1)
class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();
        int n = words.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j)
                    continue;
                if (words[j].contains(words[i])) {
                    result.add(words[i]);
                    break;
                }
            }
        }

        return result;
    }
}
}
