
//Approach-2 (Improvement on Approach-1 above) - ACCEPTED
//T.C : sqrt(c * log(c))
//S.C : O(1)
class Solution {
    public boolean judgeSquareSum(int c) {
        for (long a = 0; a * a <= c; a++) {
            double b = Math.sqrt(c - a * a);

            if (b == (int) b) {
                return true;
            }
        }
        return false;
    }
}