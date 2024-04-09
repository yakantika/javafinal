// package 2darray;

public class questhree {
    public static void transpose(int mat[][]){
        int trans[][]=new int[mat.length][mat[0].length];

        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                 trans[j][i] = mat[i][j];
            }
        }

    
        for(int i=0; i<mat[0].length; i++){
            for(int j=0; j<mat.length; j++){
                 System.out.print(trans[i][j]+" ");
            }
            System.out.println();
        }

    }

    public static void main(String args[]){
        
        int mat[][] = {{11,12,13},{21,22,23}}; 
        transpose(mat);
    }
}
