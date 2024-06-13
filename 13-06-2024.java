//Approach-1 (Using Counting Sort)
//T.C : O(n+m)
//S.C : O(m)
public class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        // Step 1: Sort both the seats and students arrays
        Arrays.sort(seats);
        Arrays.sort(students);

        int n = students.length;
        int result = 0;

        // Step 2: Calculate the total number of moves
        for (int i = 0; i < n; i++) {
            result += Math.abs(seats[i] - students[i]);
        }

        return result;
    }
}