public class binarysrch {
    static int binarysearch(int arr[], int target){
        int s = 0;
        int e = arr.length-1;
        int mid;

        while (s<=e) {
            mid = s + (e-s)/2;

            if(target > arr[mid]){
                s = mid+1;
            }else if(target < arr[mid]){
                e = mid-1;
            }else{
                return mid;
            }
        }

        return -1;

    }

    public static void main(String args[]){
        int[] arr = {1,2,5,77,89};
        int target = 50;
        System.out.println(binarysearch(arr, target));

    }
}
