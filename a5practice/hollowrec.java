import java.util.*;

public class hollowrec {
    public static void print(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<=n; j++){
                if(i==0 || j==0 || i==n-1 || j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }
}
