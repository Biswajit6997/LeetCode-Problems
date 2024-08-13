import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);  // Sort the array to handle duplicates easily
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int target, int start, List<Integer> currentCombination, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(currentCombination));
            return;
        }
        
        for (int i = start; i < candidates.length; i++) {
            // Skip duplicates
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }
            
            if (candidates[i] > target) {
                break;  // No need to continue if the current number is greater than the remaining target
            }
            
            // Choose the current number
            currentCombination.add(candidates[i]);
            // Explore further with the remaining target and move to the next index
            backtrack(candidates, target - candidates[i], i + 1, currentCombination, result);
            // Un-choose the current number
            currentCombination.remove(currentCombination.size() - 1);
        }
    }
}
