//Approach-1 (Simple simulation)
//T.C : O(numBottles)
//S.C : O(1)
//Approach-1 (Simple simulation)
//T.C : O(numBottles)
//S.C : O(1)
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int consumed = 0;

        while (numBottles >= numExchange) {
            consumed += numExchange;
            numBottles -= numExchange;

            numBottles += 1;
        }

        return consumed + numBottles;
    }
}


//Approach-2 (Using maths):
//T.C : O(1)
//S.C:  O(1)
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        return numBottles + (numBottles - 1) / (numExchange - 1);
    }
}