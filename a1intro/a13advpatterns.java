package intro;
// import java.util.*;

// public class a13advpatterns {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for(int i=1; i<=n; i++){
//             for(int j =1; j<=n-i+1; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// import java.util.*;

// public class a13advpatterns {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for(int i=1; i<=n; i++){
//             for(int j =1; j<=i; j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }


// hollow rectangle
// *****
// *   *
// *   *
// *****
// import java.util.*;


// public class a13advpatterns {
//     public static void hollow_rectangle(int rownum, int colnum){
//         for(int i=1; i<=rownum; i++){
//             for(int j=1; j<=colnum; j++){
//                 if(i==1 || i==rownum || j==1 || j==colnum){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
    
//     public static void main(String args[]){
//         // Scanner sc = new Scanner(System.in);
//         // int n = sc.nextInt();

//         hollow_rectangle(4,5);
//     }
// }


// inverted & rotated half pyramid
// *
// **
// ***
// ****
import java.util.*;
// public class a13advpatterns {
       
//         public static void main(String args[]){
//             Scanner sc = new Scanner(System.in);
//             int n = sc.nextInt();
    
//             rotated_halfpyramid(n);
//         }

//         public static void rotated_halfpyramid(int n){
//             for(int i=1; i<=n; i++){

//                 for(int k=n-i; k>=0; k--){
//                     System.out.print(" ");
//                 }

//                 for(int j=1; j<=i; j++){
//                     System.out.print("*");
//                 }
//                 System.out.println();
//             }
//         }
        
//     }


// inverted half pyramid
// 12345
// 1234
// 123
// 12
// 1
// public class a13advpatterns {
       
//         public static void main(String args[]){
//             Scanner sc = new Scanner(System.in);
//             int n = sc.nextInt();
    
//             rotated_halfpyramid(n);
//         }

//         public static void rotated_halfpyramid(int n){
//             for(int i=1; i<=n; i++){

//                 for(int j=1; j<=n-i+1; j++){
//                     System.out.print(j+" ");
//                 }
//                 System.out.println();
//             }
//         }
        
//     }

// floyd's triangle
// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15
// public class a13advpatterns {
       
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         rotated_halfpyramid(n);
//     }

//     public static void rotated_halfpyramid(int n){
//         int count = 1;
//         for(int i=1; i<=n; i++){

//             for(int j=1; j<=i; j++){
//                 System.out.print(count+" ");
//                 count++;
//             }
//             System.out.println();
//         }
//     }
    
// }


// 0-1triangle
// 1
// 01
// 101
// 0101
// 10101
// public class a13advpatterns {
       
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         binary_triangle(n);
//     }

//     public static void binary_triangle(int n){
//         for(int i=1; i<=n; i++){

//             for(int j=1; j<=i; j++){
//                 if((i+j)%2==0){
//                     System.out.print(1);
//                 }else{
//                     System.out.print(0);
//                 }
//             }
//             System.out.println();
//         }
//     }
    
// }


// butterfly pattern
// *      *
// **    **
// ***  ***
// ********
// ********
// ***  ***
// **    **
// *      *
// public class a13advpatterns {
       
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         butterfly_triangle(n);
//     }

//     public static void butterfly_triangle(int n){
//         // 1st half
//         for(int i=1; i<=n; i++){

//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }

//             for(int j=1; j<=2*(n-i); j++){
//                 System.out.print(" ");
//             }

//             for(int j=1; j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//         // 2nd half
//         for(int i=n; i>=1; i--){

//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }

//             for(int j=1; j<=2*(n-i); j++){
//                 System.out.print(" ");
//             }

//             for(int j=1; j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
    
// }


// solid rhombus
//      *****
//     *****
//    *****
//   *****
//  *****
// public class a13advpatterns{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         solid_rhombus(n);
//     }

//     public static void solid_rhombus(int n){
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=n-i; j++){
//                 System.out.print(" ");
//             }

//             for(int k=1; k<=n; k++){
//                 System.out.print("*");
//             }

//             System.out.println();
//         }
//     }

// }

// hollow rhombus
//     *****
//    *   *
//   *   *
//  *   *
// *****
// public class a13advpatterns{
//         public static void main(String args[]){
//             Scanner sc = new Scanner(System.in);
//             int n = sc.nextInt();
    
//             hollow_rectangle(n);
//         }
    
//         public static void hollow_rectangle(int n){
//             for(int i=1; i<=n; i++){
//                 for(int j=1; j<=n-i; j++){
//                     System.out.print(" ");
//                 }
    

//                 for(int j=1; j<=n; j++){
//                    if(i==1 || i==n || j==1 || j==n){
//                         System.out.print("*");
//                     }else{
//                         System.out.print(" ");
//                     }
//                 }

//                 System.out.println();
//             }
//         }  
//     }
    
// diamond pattern
//    *
//   ***
//  *****
// *******
// *******
//  *****
//   ***
//    *
public class a13advpatterns{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        hollow_rectangle(n);
    }

    public static void hollow_rectangle(int n){

        // first half
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }


            for(int j=1; j<=(2*i-1); j++){
               System.out.print("*");
            }

            System.out.println();
        }

        // second half
        for(int i=n; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }


            for(int j=1; j<=(2*i-1); j++){
               System.out.print("*");
            }

            System.out.println();
        }
    }  
}



