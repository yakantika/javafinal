import java.util.Arrays;
import java.util.Collections;

public class inbult {

    public static void print(Integer arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Integer arr[] = {0,8,3,9,2,6};
        Arrays.sort(arr);
        // Arrays.sort(arr,0,4);
        Arrays.sort(arr,Collections.reverseOrder());
        print(arr);
    }
}
