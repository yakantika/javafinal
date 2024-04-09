package intro;
// public class a6whileloop{
//     public static void main(String args[]){
//         int count = 1;

//         while(count<=100){
//             // System.out.println("hello world");
//             System.out.println(count);
//             count++;
//         }
//     }
// }


// print number from 1 to n
import java.util.*;
// public class a6whileloop{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int count = 1;

//         while(count<=n){
//             System.out.println(count);
//             count++;
//         }
//     }
// }


// sum of n natural numbers
public class a6whileloop{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n: ");
        int n = sc.nextInt();
        int count = 1;
        int sum = 0;

        while(count<=n){
            sum = (sum + count);
            count++;
        }

        System.out.println("sum is:" + sum);
    }
}