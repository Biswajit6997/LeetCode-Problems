
/********************************************* JAVA *********************************************/
//Approach-1 (Using simple simulation)
//T.C : O(n)
//S.C : O(1)
class Solution {
    public int minOperations(String[] logs) {
        int depth = 0;

        for (String s : logs) {
            if (s.equals("../")) {
                depth = Math.max(0, depth - 1);
            } else if (!s.equals("./")) {
                depth++;
            }
        }

        return depth;
    }
}