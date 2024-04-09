// package array;
import java.util.*;
public class binarysearch {

    public static int bsearch(int arr[], int key){
        int start = 0; 
        int end = arr.length-1;
        int mid;

        while(start<=end){

            // mid = (start+end)/2;
            mid = start+(end- start)/2;

            if(arr[mid] == key){
                return mid;
            }

            if(arr[mid]<key){
                start = mid + 1;
            }else{
                end = mid-1;
            }
        }
        
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {2,4,6,8,10};
        int key = 11;

        System.out.println("the number is in index: " + bsearch(arr,key));
    }
}
