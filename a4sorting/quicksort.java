public class quicksort {
    public static void printarr(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

    public static void quicksot(int arr[], int si, int ei){

        if(si>=ei){
            return;
        }

        int pidx = partition(arr, si, ei);
        quicksot(arr, si, pidx-1);
        quicksot(arr, pidx+1, ei);
    }

    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1;

        for(int j=si; j<ei; j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        int temp = arr[ei];
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;

    }
    public static void main(String args[]){
        int arr[] = {6,9,4,3,9,6,5};
        quicksot(arr, 0, 6);
        printarr(arr);
    }
}
