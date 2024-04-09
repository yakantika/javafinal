package intro;
//           Q1
// public class functionQ {
//     public static void avg(int a, int b, int c){
//         int ans = (a+b+c)/3;
//         System.out.println(ans);
//     }

//     public static void main(String args[]){
//          avg(2, 3, 6);
//     }
// }


//             Q2
// public class functionQ {

//     public static boolean iseven(int n){
//         if(n%2==0){
//             return true;
//         }
//         else{
//             return false;
//         }
//     }

//     public static void main(String args[]){
//         System.out.println(iseven(4));
//     }
// }


//            Q3
// public class functionQ{
    // public static boolean ispalindrome(int n){
    //     int num = n;
    //     int rev = 0;
    //     int pow=0;
    //     while (n>0){
    //         int ld = n%10;
    //         rev = rev + (ld*(int)Math.pow(10, pow));
    //         pow++;
    //         n = n/10;
    //     }

    //     if(rev == num){
    //         return true;
    //     }else{
    //         return false;
    //     }
    // }


//     public static void main(String args[]){
//         // System.out.println(ispalindrome(121));
//         int absResult = Math.abs(-5);

//         System.out.println(absResult);
//     }
// }


//          Q5
public class functionQ{
    public static void sum(int n){
        int sum = 0;
        int ld;

        while(n>0){
            ld = n%10;
            sum = sum + ld;
            n = n/10;
        }
        System.out.println(sum);
    }
public static void main(String args[]){
    sum(123);
}
}
