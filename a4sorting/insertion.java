public class insertion {
    public static void insertion_sort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr= arr[i];
            int prev = i-1;

            while(prev >= 0 && curr < arr[prev]){
                arr[prev+1] = arr[prev];
                prev--;
            }

            arr[prev+1] = curr;
        }
    }

    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String args[]){
        int arr[] = {4,6,2,8,0};
        insertion_sort(arr);
        print(arr);
    }
}
