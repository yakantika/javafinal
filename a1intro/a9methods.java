package intro;
import java.util.*;

// public class a9methods{
//     // public static void sum(int num1, int num2){
//     //     int sum = num1 + num2;
//     //     System.out.print("sum is = " +sum);
//     // }

//     public static int sum(int num1, int num2){
//         int sum = num1 + num2;
//         return sum;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         // sum(a,b);
//         int sum = sum(a,b);
//         System.out.println(sum);
//     }
// }


// swap
// public class a9methods{
//     public static void swap(int a, int b){
//         int temp = a;
//         a = b;
//         b = temp;

//         System.out.println(a);
//         System.out.println(b);
//     }
//     public static void main(String args[]){

//         Scanner sc = new Scanner(System.in);
//         int a = 3;
//         int b = 10;

//         swap(a,b);
//     }
// }


// factorial
public class a9methods{
    public static int factorial(int n){
        int f = 1;

        for(int i=1; i<=n; i++){
            f = f*i;
        }
        return f;
    }

    public static int binomial(int n, int r){
        int a = factorial(n);
        int b = factorial(r);
        int c = factorial(n-r);

        int ncr = a/(b*c);

        return ncr;
    }

    public static void main(String args[]){
        // int n = 4;
        // int ans = factorial(4);

        int ansncr = binomial(7,3);
        System.out.println(ansncr);
    }
}