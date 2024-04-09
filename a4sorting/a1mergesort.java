import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class a1mergesort {
    public static void mergesort(int arr[], int si, int ei){
        if(si == ei){
            return;
        }

        int mid = si+(ei-si)/2;

        mergesort(arr,si,mid);
        mergesort(arr,mid+1,ei);
        merge(arr,si,ei,mid);

    }

    public static void merge(int arr[],int si,int ei, int mid){
        int temp[] = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k=0;

        while(i<=mid && j<=ei){
            if(arr[i] < arr[j]){
                temp[k]= arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(j<=ei){
            temp[k++] = arr[j++];
        }
        while(i<=mid){
            temp[k++] = arr[i++];
        }

        for(k=0, i=si; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }

    public static void main(String args[]){
        int arr[]={3,1,2,4,1,5,2,6,4};

        mergesort(arr, 0, 8);
        System.out.println(Arrays.toString(arr));
    }
}
