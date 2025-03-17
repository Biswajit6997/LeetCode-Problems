// Approach-2 (Using set)
// T.C : O(n)
// S.C : O(n)
class Solution {
    public boolean divideArray(int[] nums) {
        Set<Integer> st = new HashSet<>();
        
        for (int x : nums) {
            if (st.contains(x)) {
                st.remove(x);
            } else {
                st.add(x);
            }
        }
        
        return st.isEmpty();
    }
}17