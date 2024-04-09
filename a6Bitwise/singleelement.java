package Bitwise;

public class singleelement {
    public static int single(int arr[]){
        int unique = 0;

        for(int i : arr){
            unique ^= i;
        }

        return unique%3;
    }

    public static void main(String args[]){
        // int arr[] = {2,3,4,1,2,1,3,6,4};
        int arr[] = {2,2,3,2,7,7,8,7,8,8};

        System.out.println(single(arr));
    }
}
