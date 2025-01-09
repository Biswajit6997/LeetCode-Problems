/************************************************************ JAVA ************************************************/
//Approach-1 Brute Force
//T.C : O(n^m), where n = number of words, m = length of pref
//S.C : O(n^m)
class Solution {

    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for (String word : words) {
            if (word.startsWith(pref)) {
                count++; // Found a string with pref as prefix
            }
        }
        return count;
    }
}
