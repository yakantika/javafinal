package intro;
// import java.util.*;
// public class a7forloop{
//     public static void main(String args[]){
//         // Scanner sc = new Scanner(System.in);
//         // int n = sc.nextInt();

//         for(int i=1; i<=4; i++){
//             System.out.println("****");
//         }
//     }
// }


// reverse of a number
// public class a7forloop{
//     public static void main(String args[]){
//         int n = 10899;

//         while(n>0){
//             int ld;
//             ld = n % 10;
//             System.out.print(ld);
//             n = n/10;
//         }
//     }
// }


// store and print the reverse number
// public class a7forloop{
//     public static void main(String args[]){
//         int n = 12345;
//         int rev = 0;

//         while(n>0){
//             int ld = n%10;
//             rev = (rev*10)+ld;
//             n = n/10;
//         }
//         System.out.println(rev);
//     }
// }


// exit loop on multipleof 10
import java.util.*;
// public class a7forloop{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         do{
//             int n = sc.nextInt();
//             if(n%10 == 0){
//                 break;
//             }
//             System.out.println(n);
//         } while(true);
//     }
// }


// display all number entered by user except multiple of 10
// public class a7forloop{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         do{
//             System.out.println("enter a number: ");
//             int n = sc.nextInt();
//             if(n%10==0){
//                 continue;
//             }
//             System.out.println("your number is: " + n);
//         }while(true);
//     }
// }


// check if a number is prime or not
// public class a7forloop{
//     public static void main(String srgs[]){
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         boolean isPrime = true;

//         for(int i =2; i<=n-1; i++){
//             if(n%i==0){
//                 isPrime = false;
//                 System.out.println("this number is composite");
//                 break;
//             }
//         }

//         if(isPrime == true){
//             System.out.println("this is a prime number");
//         }
//     }
// }


// factorial of a number
public class a7forloop{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int factorial = 1;

        for(int i=1; i<=n; i++){
            factorial = factorial*i;
        }

        System.out.println(factorial);
    }

}