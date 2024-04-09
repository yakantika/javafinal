import java.util.Arrays;

public class linear {
    public static void main(String args[]){
        int arr[] ={2,4,5,6,87};
        int key = 60;
        int idx = linearsrch(arr, key);
        if(idx == key){
            System.out.println("key not in idx");
        }else{
            System.out.println("key is in idx: "+ idx);
        }
        // System.out.println(linearsrch(arr, 60));

        // String str = "kiyo";
        // char key = 't';

        // System.out.println(linerasearch(str,key));
        // System.out.println(str);
        // System.out.println(Arrays.toString(str.toCharArray()));




    }

    static int linearsrch(int arr[], int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i]  == key){
                return i;
            }
        }

        return key;
    }

    // linear search in string
    // static boolean linerasearch(String str, char key){
    //     for(char ch : str.toCharArray()){
    //         if(ch==key){
    //             return true;
    //         }
    //     }

    //     return false;
    // }
}
