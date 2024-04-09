import java.util.function.ObjDoubleConsumer;

public class firstoccurance {
    public static int Occurance(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }

        return Occurance(arr, key, i+1);
    }
    public static void main(String args[]){
        int arr[] = {2,4,1,6,1};
        System.out.print(Occurance(arr, 1, 0));
    }
}
