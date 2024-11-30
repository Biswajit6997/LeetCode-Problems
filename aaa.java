import java.util.*;

public class aaa {

    public static int[] idsOfAlumni(int[] alumniID) {
        int n = alumniID.length;

        // To track the alumni who attend the dinner
        boolean[] visited = new boolean[n];
        List<Integer> attendees = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            // If an alumnus has not been visited yet
            if (!visited[i]) {
                int current = i;
                Set<Integer> cycle = new HashSet<>();

                // Traverse the cycle
                while (!cycle.contains(current) && !visited[current]) {
                    cycle.add(current);
                    visited[current] = true;
                    current = alumniID[current] - 1; // Move to the alumnus they like
                }

                // Add the minimum ID in the cycle to attendees
                attendees.add(Collections.min(cycle) + 1);
            }
        }

        // Convert attendees list to an array and sort lexicographically
        int[] result = attendees.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(result);

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input the number of alumni
        int num = in.nextInt();
        int[] alumniID = new int[num];

        // Input the ID of the alumni each alumnus likes
        for (int i = 0; i < num; i++) {
            alumniID[i] = in.nextInt();
        }

        // Get the result
        int[] result = idsOfAlumni(alumniID);

        // Print the result
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i != result.length - 1) {
                System.out.print(" ");
            }
        }
        in.close();
    }
}