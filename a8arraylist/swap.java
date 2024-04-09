package arraylist;
import java.util.*;

public class swap {

    public static void Swap(ArrayList<Integer> list, int idx1, int idx2){
        for(int i=0; i<list.size(); i++){
            int temp = list.get(idx1);
            list.set(idx1, list.get(idx2));
            list.set(idx2, temp);        }
    }

    // public static void main(String args[]){
    //     ArrayList<Integer> list = new ArrayList<>();

    //     list.add(1);
    //     list.add(2);
    //     list.add(8);
    //     list.add(3);
    //     list.add(9);

    //     int idx1 = 1, idx2 = 3;
    //     System.out.println(list);
        
    //     Swap(list,idx1,idx2);
    //     System.out.println(list);
    // }


    public static void main(String args[]){
        int[] arr = {2,5,23,66,8};
        swap(arr, 1,3);

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int idx1, int idx2){
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

}
