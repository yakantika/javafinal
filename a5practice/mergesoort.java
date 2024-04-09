import java.util.Arrays;

public class mergesoort {
    public static void mergesort(int arr[],int si, int ei){
        if(si>=ei){
            return;
        }

        int mid = si+(ei-si)/2;

        mergesort(arr, si, mid);
        mergesort(arr, mid+1, ei);
        merge(arr, mid, si, ei);
    }

    public static void merge(int arr[], int mid, int si, int ei){
        int temp[] = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k=0;

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i<=mid) {
            temp[k++] = arr[i++];
        }
        while (j<=ei) {
            temp[k++] = arr[j++];
        }

        for(k=0,i=si; k<temp.length; k++,i++){
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = {4,3,2,1};
        mergesort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
