package intro;
import java.util.*;

// *
// **
// ***
// ****

// public class a8pattern{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();

//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// ****
// ***
// **
// *
// public class a8pattern{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();

//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=n-i+1; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// 1
// 12
// 123
// 1234
// public class a8pattern{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
        
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print( j );
//             }
//             System.out.println();
//         }
//     }
// }


// 
public class a8pattern{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char ch = 'A';
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print( ch );
                // int ch = (int)ch++;
                ch++;
            }
            System.out.println();
        }
    }
}