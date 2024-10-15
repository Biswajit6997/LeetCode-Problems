//Approach-1 (straight forward traversal)
//T.C : O(n)
//S.C : O(1)
class Solution {
    public long minimumSteps(String s) {
        int n = s.length();
        long swaps = 0;
        int black = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') {  // Move white to the left
                swaps += black;
            } else {  // If it's black ('1'), increment black count
                black++;
            }
        }

        return swaps;
    }
}