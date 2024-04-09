public class mergesort {
    public static void print(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

    public static void main(String args[]){
        int arr[] = {7,4,6,3,9,3,1};
        mrgesort(arr, 0, 6);
        print(arr);
    }

    public static void mrgesort(int arr[], int si, int ei){
        int mid = si+((ei-si)/2);

        if(si>=ei){
            return;
        }

        mrgesort(arr, si, mid);
        mrgesort(arr, mid+1, ei);
        merge(arr,mid, si, ei);
    }

    public static void merge(int arr[], int mid, int si, int ei){
        int temp[] = new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;

        while(i<=mid && j<=ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }

            k++;
        }

        while(i<=mid){
            temp[k++] = arr[i++];
        }

        while(j<=ei){
            temp[k++] = arr[j++];
        }

        for(k=0, i=si; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }
}

