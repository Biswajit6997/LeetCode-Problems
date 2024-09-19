//Approach-(Simple and straight forward convert to minutes and sort)
//T.C : O(n*2^n)
//S.C : O(2^n) //The result vector stores all possible outcomes. The number of results is at most exponential in terms of the number of operators, so the space required to store the results is O(2^n).
class Solution {

    // Helper function to solve the expression in different ways
    public List<Integer> solve(String s) {
        List<Integer> result = new ArrayList<>();

        // Iterate through each character in the string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If the current character is an operator
            if (c == '+' || c == '-' || c == '*') {
                // Recursively solve left and right substrings
                List<Integer> leftResults = solve(s.substring(0, i));
                List<Integer> rightResults = solve(s.substring(i + 1));

                // Combine the results from left and right parts
                for (int x : leftResults) {
                    for (int y : rightResults) {
                        if (c == '+') {
                            result.add(x + y);
                        } else if (c == '-') {
                            result.add(x - y);
                        } else {
                            result.add(x * y);
                        }
                    }
                }
            }
        }

        // If no operator is found, it means the string is a number
        if (result.isEmpty()) {
            result.add(Integer.parseInt(s));
        }

        return result;
    }

    // Main function to compute different ways to compute the expression
    public List<Integer> diffWaysToCompute(String expression) {
        return solve(expression);
    }
}