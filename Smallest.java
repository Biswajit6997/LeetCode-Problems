import java.util.Scanner;

public class Smallest {

    static int Small(int arr[]){
        int small=arr[0];
        for(int i=0;i<arr.length;i++){
            if (arr[i]<small) {
                small=arr[i];
                
            }
        }
        return small;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Small(arr));
    }
}
