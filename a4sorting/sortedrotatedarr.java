public class sortedrotatedarr {
    public static int search(int arr[], int tar, int si, int ei){

        if(si>ei){
            return -1;
        }
        int mid = si + (ei-si)/2;

        if(arr[mid] == tar){
            return mid;
        }

        // mid on l1
        if(arr[si] <= arr[mid]){
            if(arr[si] <= tar && arr[mid]>=tar){
                return search(arr, tar, si, mid-1);
            }
            else{
                return search(arr, tar, mid+1, ei);
            }
        }
        
        else{
            if(tar >= arr[mid] && tar<= arr[ei]){
                return search(arr, tar, mid+1, ei);
            }else{
                return search(arr, tar, si, mid-1);
            }
        }
    }
    public static void main(String args[]){
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0;
        int targetidx = search(arr, target, 0, arr.length-1);
        System.out.print(targetidx);
    }
}
