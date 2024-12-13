public class b {
    public static int findMin(int[] arr) {
        // complete the function here
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
                // return;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[]={2,1,3,12};
        System.out.println(findMin(arr));
    }
}
