//Approach-1 (Brute Force Using unordered_set extra space)
//T.C : O(n^2)
//S.C : O(n)
class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if (boxes.charAt(i) == '1') {
                set.add(i);
            }
        }

        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            for (int idx : set) {
                answer[i] += Math.abs(i - idx);
            }
        }

        return answer;
    }
}