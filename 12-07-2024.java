//Approach-1 (Using Stack)
//T.C : O(n)
//S.C : O(n)
import java.util.Stack;

class Solution {
    public int maximumGain(String s, int x, int y) {
        int n = s.length();
        int score = 0;

        String maxStr = (x > y) ? "ab" : "ba";
        String minStr = (x < y) ? "ab" : "ba";

        // First Pass
        String tempFirst = removeSubstring(s, maxStr);
        int removedPairsCount = (n - tempFirst.length()) / 2;
        score += removedPairsCount * Math.max(x, y);

        // Second Pass
        String tempSecond = removeSubstring(tempFirst, minStr);
        removedPairsCount = (tempFirst.length() - tempSecond.length()) / 2;
        score += removedPairsCount * Math.min(x, y);

        return score;
    }

    private String removeSubstring(String s, String matchStr) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && ch == matchStr.charAt(1) && stack.peek() == matchStr.charAt(0)) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }

        StringBuilder remainStr = new StringBuilder();
        while (!stack.isEmpty()) {
            remainStr.append(stack.pop());
        }
        return remainStr.reverse().toString();
    }
}
