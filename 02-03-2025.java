
// Approach-2 (Using TreeMap)
// T.C : O(m+n + NlogN), insertion in TreeMap is logarithmic time complexity
// S.C : O(m+n)
class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        
        TreeMap<Integer, Integer> map = new TreeMap<>();
        List<int[]> result = new ArrayList<>();
        
        for (int i = 0; i < m; i++) {
            int id = nums1[i][0];
            int val = nums1[i][1];
            
            map.put(id, map.getOrDefault(id, 0) + val);
        }
        
        for (int i = 0; i < n; i++) {
            int id = nums2[i][0];
            int val = nums2[i][1];
            
            map.put(id, map.getOrDefault(id, 0) + val);
        }
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            result.add(new int[]{entry.getKey(), entry.getValue()});
        }
        
        return result.toArray(new int[0][]);
    }
}

