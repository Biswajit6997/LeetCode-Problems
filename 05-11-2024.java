//Approach-1 (Simple iterate and count and keep track)
//T.C : O(n)
//S.C : O(1)
class Solution {
    public int minChanges(String s) {
        char curr = s.charAt(0);

        int count = 0;
        int changes = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            
            if (s.charAt(i) == curr) {
                count++;
                continue;
            }

            if (count % 2 == 0) {
                count = 1;
            } else {
                count = 0;
                changes++;
            }
            curr = s.charAt(i);
        }

        return changes;
    }
}