public class timenne {
    // Approach-1: Using Queue to simulate the operations
// Time Complexity: O(n*m)
// Space Complexity: O(n)
import java.util.LinkedList;
import java.util.Queue;

class SolutionApproach1 {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int n = tickets.length;
        Queue<Integer> que = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            que.add(i);
        }

        int time = 0;

        while (!que.isEmpty()) {
            time++;
            int front = que.poll();
            tickets[front]--;
            
            if (k == front && tickets[front] == 0) {
                return time;
            }
            if (tickets[front] != 0) {
                que.add(front);
            }
        }

        return time;
    }
}

// Approach-2: Using Array for simulation
// Time Complexity: O(m*n)
// Space Complexity: O(1)
class SolutionApproach2 {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int n = tickets.length;
        int time = 0;

        if (tickets[k] == 1)
            return k + 1;

        while (tickets[k] > 0) {
            for (int i = 0; i < n; i++) {

                if (tickets[i] != 0) {
                    tickets[i]--;
                    time++;
                }

                if (tickets[k] == 0)
                    return time;
            }
        }

        return time;
    }
}

// Approach-3: Using simple observation
// Time Complexity: O(n)
// Space Complexity: O(1)
class SolutionApproach3 {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;
        
        for (int i = 0; i < tickets.length; i++) {
            
            if (i <= k) {
                time += Math.min(tickets[k], tickets[i]);
            } else {
                time += Math.min(tickets[k] - 1, tickets[i]);
            }
        }
        
        return time;
    }
}
}
