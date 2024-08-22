//Approach-1 (Using bit magic of XOR)
//T.C : O(log2(num))
//S.C : O(1)
class Solution {
    public int findComplement(int num) {
        int numberOfBits = (int)(Math.log(num) / Math.log(2)) + 1;
        
        for (int i = 0; i < numberOfBits; i++) {
            num = num ^ (1 << i); // Take XOR to flip
        }
        return num;
    }
}