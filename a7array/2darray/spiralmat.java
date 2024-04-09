public class spiralmat {

    public static void spiral(int matrix[][]){
        int startrow = 0;
        int startcol = 0;
        int endrow = matrix.length-1;
        int endcol = matrix[0].length-1;
        
        while(startrow <= endrow && startcol <= endcol){
            // top
            for(int i=startrow; i<=endcol; i++){
                System.out.print(matrix[startrow][i]+" ");
            }

            // right
            for(int i=startrow+1; i<=endrow; i++){
                System.out.print(matrix[i][endcol]+" ");
            }

            // bottom
            for(int i=endcol-1; i>=startcol; i--){
                if(startrow == endrow){
                    break;
                }
                System.out.print(matrix[endrow][i]+" ");
            }

            // left
            for(int i=endrow-1; i>=startrow+1; i--){
                if(startcol == endcol){
                    break;
                }
                System.out.print(matrix[i][startcol]+" ");
            }

            startrow++;
            startcol++;
            endcol--;
            endrow--;

        }
        System.out.println();
    }
    public static void main(String args[]){
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}}; 

        spiral(matrix);
          
    }
}
