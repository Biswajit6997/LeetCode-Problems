//Approach-1 - Simulation (TLE)
//T.C : O(k/sum * n)
//S.C : O(1)
class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        while (true) {
            for (int i = 0; i < chalk.length; i++) {
                if (k < chalk[i]) {
                    return i;
                }
                k -= chalk[i];
            }
        }
    }
}