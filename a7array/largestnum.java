// package array;
import java.util.*;

import javax.swing.plaf.synth.SynthTabbedPaneUI;

public class largestnum {
    public static int getlargest(int arr[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }

            if(smallest > arr[i]){
                smallest = arr[i];
            }
        }

        System.out.println("smallest number is: "+ smallest);
        return largest;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("largest number is: "+ getlargest(arr));
    }
}
