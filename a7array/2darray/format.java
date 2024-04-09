// package 2d array;
import java.util.*;

public class format {
    // public static boolean search(int matrix[][], int key){
    //     for(int i=0; i<matrix.length; i++){
    //         for(int j=0; j<matrix[0].length; j++){
    //             if(matrix[i][j] == key){
    //                 System.out.println("cound the key at index (" + i+ ","+j+")");
    //                 return true;
    //             }
    //         }
    //     }
    //     System.out.println("ERROR:keynotfound!");
    //     return false;
    // }

    public static int maxelement(int matrix[][]){
        int max = Integer.MIN_VALUE;

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                max = Math.max(max,matrix[i][j]);
            }
        }
        
        return max;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        int n=matrix.length, m = matrix[0].length;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        // search(matrix, 1);
        System.out.println("maximum element is: " + maxelement(matrix));
    }
    
}
