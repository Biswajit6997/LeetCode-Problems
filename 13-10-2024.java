//Approach-1 (Using vector of indexes)
//T.C : O(n*k)
//S.C : O(k)
import java.util.*;

class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        int k = nums.size();
        
        // This array will keep track of the current index for each list
        int[] vec = new int[k];
        
        // Initialize the result range with extreme values
        int[] resultRange = { -1000000, 1000000 };
        
        while (true) {
            int minEl = Integer.MAX_VALUE;
            int maxEl = Integer.MIN_VALUE;
            int minElListIdx = 0;

            // Find the minimum and maximum elements among the current elements in the k lists
            for (int i = 0; i < k; i++) {
                int listIdx = i;
                int elIdx = vec[i];
                int element = nums.get(listIdx).get(elIdx);
                
                if (element < minEl) {
                    minEl = element;
                    minElListIdx = listIdx;
                }
                
                maxEl = Math.max(maxEl, element);
            }

            // If the current range is smaller than the previous one, update resultRange
            if (maxEl - minEl < resultRange[1] - resultRange[0]) {
                resultRange[0] = minEl;
                resultRange[1] = maxEl;
            }

            // Move to the next element in the list that had the minimum element
            int nextIndex = vec[minElListIdx] + 1;
            if (nextIndex >= nums.get(minElListIdx).size()) {
                break;  // If any list is exhausted, we can't move further
            }
            vec[minElListIdx] = nextIndex;
        }

        return resultRange;
    }
}


