// package Bitwise;

public class ithbit {
    public static int ith(int n, int i){
        int bitmask = 1<<i;
        if((n & bitmask)==0){
            return 0;
        }else{
            return 1;
        }
    }
    public static void main(String args[]){
        System.out.print(ith(10, 2));
    }
}
