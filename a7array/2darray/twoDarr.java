// package 2darray;

import java.util.Arrays;
import java.util.Scanner;

public class twoDarr {
    // for 2d array of nXn size
    // public static void main(String args[]){
    //     int arr[][] = new int[3][3];
    //     String str[] = new String[3];
    //     Scanner sc = new Scanner(System.in);

        // input
        // for(int i=0; i<arr.length; i++){
        //     for(int j=0; j<arr[i].length; j++){
        //         arr[i][j] = sc.nextInt();
        //     }
        // }


        // output way 1
        // for(int i=0; i<arr.length; i++){
        //     for(int j=0; j<arr[i].length; j++){
        //         System.out.print(arr[i][j]+ " ");
        //     }
        //     System.out.println();
        // }

        // output way2
        // for(int i=0; i<arr.length; i++){
        //     System.out.println(Arrays.toString(arr[i]));
        // }

        // output way 3
        // for(int[] i : arr){
        //     System.out.print(Arrays.toString(i));
        // }


        // output string
//         for(String element : str){
//             System.out.println(element);
//         }

//     }


// for 2d arrays of different column size
public static void main(String args[]){
    // for int arr
//     int arr[][] = {
//         {1,2,3,4},
//         {5,6},
//         {7,8,9}
//     };

//     for(int i=0; i<arr.length; i++){
//         for(int j=0; j<arr[i].length; j++){
//             System.out.print(arr[i][j]+ " ");
//         }
//         System.out.println();
//     }

//for string arr
    
    //     String str[][] = {{"isha", "2001"},
    //     {"kiyo","2002","cute"}};

    //     for(String[] element: str){
    //     System.out.print(Arrays.toString(element));
    //     }
    // }

    char arr[][] = {{'a','b'},{'s'},{'e','y','u'}};

    for(char[] i: arr){
        System.out.print(Arrays.toString(i));
    }
    
}
}
