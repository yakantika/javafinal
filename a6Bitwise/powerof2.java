package Bitwise;

public class powerof2 {
    public static void main(String[] args) {
        int n=4;
        // int ans = n & (n-1);

        // if( ans == 0){
        //     System.out.println("n is power of 2");
        // }else{
        //     System.out.println("n is not a power of 2");
        // }

        boolean ans = ( n & (n-1)) == 0;

        System.out.println(ans);

    }
}
