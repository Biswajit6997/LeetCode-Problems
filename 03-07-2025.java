

//Approach-2 (bit observation to find shift)
//T.C : O(log(k-1))
//S.C : O(1)
class Solution {
    public char kthCharacter(int k) {
        int shift = Integer.bitCount(k - 1);
        return (char)('a' + shift);
    }
}