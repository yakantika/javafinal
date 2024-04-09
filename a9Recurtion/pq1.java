public class pq1 {
    public static void find(int key, int arr[], int i){
        if(i == arr.length){
            return;
        }

        if(arr[i] == key){
            System.out.print(i+" ");
        }
        
        find(key, arr, i+1);
    }
    public static void main(String args[]){
        int arr[] = {3,2,4,5,6,2,7,2,2};
        int key = 2;

        find(key, arr, 0);
    }
}
