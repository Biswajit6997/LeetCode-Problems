class Solution {
    public static int findUnion(int a[], int b[]) {
        // code here
        Set<Integer> hs=new HashSet();
        for(int i :a){
            hs.add(i);
        }
        for(int j :b){
            hs.add(j);
        }
        return hs.size();
    }
}