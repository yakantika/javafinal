// package array;
import java.util.*;
public class subarrays {
    public static void printsubarray(int arr[]){
        int ts =0;
        int max = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int sum = 0;
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k]+" ");
                    // sum = sum+arr[k];
                    // if(max < sum){
                    //     max = sum;
                    // }
                }
                ts++;
                System.out.println();
               
            }
            System.out.println();
            
        }
        System.out.println("total subarray"+ ts);
        // System.out.print(max);
    }
    public static void main(String args[]){
        int arr[] = {2,4,6,8,10};

        printsubarray(arr);
    }
}
