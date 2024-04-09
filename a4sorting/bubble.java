// package sorting;

public class bubble {
    public static void bubble_sort(int arr[]){
        int flag = 0;

        // for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-j; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = 1;
                }
            }
        // }

        if(flag==0){
            System.out.println("array is already sorted");
        }
    }

    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int arr[] = {1,3,2,4,5};
        bubble_sort(arr);
        print(arr);
    }
}
