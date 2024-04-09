import java.util.*;

// import arraylist.swap;
public class bubble1 {

    public static void bubble(int arr[]){
        boolean swapped = false;
        for(int i=0; i<arr.length; i++){
            for(int j=1; j<arr.length-i; j++){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }

            if(!swapped){
                break;
            }
        }

    }

    public static void main(String args[]){
        int arr[] = {4,6,2,7};
        bubble(arr);
        System.out.print(Arrays.toString(arr));
    }
}
