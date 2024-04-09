// package 2darray;

public class questwo {
    public static int add(int nums[][], int row){
        int sum =0;

        for(int i=0; i<nums.length; i++){
            if(i==row){
                for(int j=0; j<nums[0].length; j++){
                    sum += nums[i][j];
                }
            }
        }

        return sum;
    }
    public static void main(String args[]){
        int nums[][] = { {1,4,9},{11,4,3},{2,2,3} };

        System.out.println(add(nums, 1));
    }
}
