public class lastoccurance {
    public static int lastoccurance(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }

        int isfound = lastoccurance(arr, key, i+1);

        if(isfound == -1 && arr[i] == key){
            return i;
        }

        return isfound;
    }

    public static void main(String args[]){
        int arr[] = {1,2,4,3,5,2,3,2};
        System.out.println(lastoccurance(arr, 2, 0));
    }
}
