// package 2darray;

public class starecasemat {
    public static boolean starecase(int matrix[][], int key){
        
        int row=0; 
        int col=matrix[0].length-1;

        while(row<matrix.length && col>=0){
            if(matrix[row][col] == key){
                System.out.println("the key is in position (" + row+","+col+")");
                return true;
            }else if(key < matrix[row][col]){
                col--;
            }else{
                row++;
            }
        }
        System.out.println("key not found!");
        return false;
    }

    public static void main(String main[]){
        int matrix[][] = {{10,20,30,40},
                          {15,25,35,45},
                          {27,29,37,48},
                          {32,33,39,50}};

        System.out.println(starecase(matrix,133));
    }
}
