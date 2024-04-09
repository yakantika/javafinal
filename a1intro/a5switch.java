package intro;
import java.util.*;
// public class a5switch{
//     public static void main(String srgs[]){
//         char ch = 'd';

//         switch (ch){
//             case 'a' : System.out.println("character is a");
//             break;
//             case 'b' : System.out.println("character is b");
//             break;
//             case 'c' : System.out.println("character is c");
//             break;
//             default : System.out.println("other than a,b,c");
//         }
//     }
// }


// creating calculator
public class a5switch{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        char operation = sc.next().charAt(0); //to take a single character
        
        switch (operation){
            case '-' : System.out.println(a-b);
            break;
            case '+' : System.out.println(a+b);
            break;
            case '/' : System.out.println(a/b);
            break;
            case '*' : System.out.println(a*b);
            break;
            case '%' : System.out.println(a%b);
            break;
            default : System.out.println("this operation doesn't exists");
        }
    }
}