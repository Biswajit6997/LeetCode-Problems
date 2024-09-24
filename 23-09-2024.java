//Approach-1 (Recursion + Memo)
//T.C : O(n^3)
//S.C : O(total numberof characters in dictionary words + n for memoization array)
// Approach-1 (Recursion + Memoization)
// T.C : O(n^3)
// S.C : O(total number of characters in dictionary words + n for memoization array)
import java.util.*;

class Solution {

    int[] t = new int[51];

    public int solve(int i, String s, Set<String> st, int n) {
        if (i >= n) {
            return 0;
        }

        if (t[i] != -1) {
            return t[i];
        }

        int result = 1 + solve(i + 1, s, st, n); // skipping the ith character

        for (int j = i; j < n; j++) {
            String curr = s.substring(i, j + 1);
            if (st.contains(curr)) {
                // valid substring
                result = Math.min(result, solve(j + 1, s, st, n));
            }
        }

        return t[i] = result;
    }

    public int minExtraChar(String s, List<String> dict) {
        int n = s.length();
        Arrays.fill(t, -1);
        Set<String> st = new HashSet<>(dict);

        return solve(0, s, st, n);
    }
}
