// package 2darray;

public class diagonalsum {

    public static int sumdiagonal(int matrix[][]){
        int sum = 0;
        int n = matrix.length;

        // brut force  //TC- O(n^2)
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(i==j || i+j == n-1){
                    sum += matrix[i][j];
                }
                // else if(i+j == n-1){
                //     sum += matrix[i][j];
                // }
            }
        }

        // optimised  //TC-O(n)
        // for(int i=0; i<matrix.length; i++){
        //     sum += matrix[i][i]; //pd
        //     if(i != n-1-i)
        //         sum += matrix[i][n-i-1];
        // }

        return sum;
    }

    public static void main(String args[]){
        int matrix[][] = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};

        System.out.println("diagonal sum is: " + sumdiagonal(matrix));
    }
    
}
