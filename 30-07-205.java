https://www.geeksforgeeks.org/problems/subarrays-with-sum-k/1class Solution {
    public int cntSubarrays(int[] arr, int k) {
        // code here
        int ans =0, currSum=0;
        Map<Integer,Integer> mp = new HashMap();
        mp.put(0, 1);
        for(int i: arr){
            currSum+=i;
            if(mp.containsKey(currSum-k)){
                ans+=mp.get(currSum-k);
            }
            mp.put(currSum, mp.getOrDefault(currSum, 0)+1);
        }
        return ans;
    }
    
}