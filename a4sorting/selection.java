// package sorting;

public class selection {
    public static void selection_sort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int min = i;
            for(int j=i+1; j<arr.length; j++){
                // if(arr[min]>arr[j])
                if(arr[min] < arr[j]) //for decreasing order
                {
                    min = j;
                }
            }
             int temp = arr[i];
             arr[i] = arr[min];
             arr[min] = temp;
        }
    }

    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int arr[] = {3,6,2,9,4};
        selection_sort(arr);
        print(arr);
    }
}
