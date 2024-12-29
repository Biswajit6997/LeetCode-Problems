class Solution {
    public ArrayList<Integer> intersectionWithDuplicates(int[] a, int[] b) {
        // code here
        
        HashSet<Integer> setA=new HashSet<>();
        for(int num:a){
            setA.add(num);
        }
        HashSet<Integer> resultSet = new HashSet<>();
        for(int result:b){
            if(setA.contains(result)){
                resultSet.add(result);
            }
        }
        return new ArrayList<>(resultSet);
    }
}