//Approach - Simple using AND and OR
//T.C : O(n)
//S.C : O(1)
class Solution {
    public long minEnd(int n, int x) {
        long num = x;

        for (int i = 1; i < n; i++) {
            // Increment num and perform bitwise OR with x
            num = (num + 1) | x;
        }

        return num;
    }
}