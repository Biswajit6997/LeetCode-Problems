//Approach-1 (Using simple set)
//T.C : O(n)
//S.C : O(n)
class Solution {
    public int longestPalindrome(String s) {
        int n = s.length();
        HashSet<Character> set = new HashSet<>();
        
        int result = 0;
        for(char ch : s.toCharArray()) {
            if(set.contains(ch)) {
                set.remove(ch);
                result += 2;
            } else {
                set.add(ch);
            }
        }
        
        if(!set.isEmpty()) {
            result++;
        }
        
        return result;
    }
}
