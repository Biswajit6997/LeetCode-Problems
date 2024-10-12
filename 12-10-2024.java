import java.util.Arrays;
import java.util.PriorityQueue;

class Solution {
    public int minGroups(int[][] intervals) {
        // Sort intervals based on their start times
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        // Min-heap to store the end times of the intervals
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        // Iterate through each interval
        for (int[] interval : intervals) {
            int start = interval[0];
            int end = interval[1];
            
            // If the heap is not empty and the smallest end time is less than the current start,
            // it means one interval has ended, so we can remove it from the heap.
            if (!minHeap.isEmpty() && minHeap.peek() < start) {
                minHeap.poll();
            }
            
            // Add the end time of the current interval to the heap
            minHeap.offer(end);
        }
        
        // The size of the heap is the minimum number of groups needed
        return minHeap.size();
    }
}