package intro;
import java.util.*;

public class ifelse{
    public static void main(String augs[]){
                  // gretest of 2

        // int a = 10;
        // int b= 50;

        // if(a>b){
        //     System.out.println("a is greater");
        // }else{
        //     System.out.print("b is greater");
        // }


                   // odd even
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();

        // if(num%2==0){
        //     System.out.println("number is even");
        // }
        // else{
        //     System.out.println("number is odd");
        // }


                   // else if
        //  Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();

        // if(age>=18){
        //     System.out.println("adult");
        // }
        // else if(age>=13 && age<18){
        //     System.out.println("teenage");
        // }
        // else{
        //     System.out.println("child");
        // }


                      // calculate income tax
        // Scanner sc = new Scanner(System.in);
        // int income = sc.nextInt();
        // int tax;

        // if(income<500000){
        //     tax = 0;
        // }
        // else if(income>500000 && income<1000000){
        //     tax = (int) (income*(0.2));
        // }
        // else{
        //     tax=(int) (income*(0.3));
        // }

        // System.out.println(tax);


                    // largest in 3
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();

        // if(a>b && a>c){
        //     System.out.println("a is largest");
        // }
        // else if(b>c){
        //     System.out.println("b is greater");
        // }
        // else{
        //     System.out.println("c is greater");
        // }

                     // ternary
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        String ans = (a%2==0)?"even":"odd";
        System.out.println(ans);
        
    }
}