package intro;
import java.util.*;

public class ternary {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        System.out.println("enter marks");
        Float marks = sc.nextFloat();

        String result = (marks>=33)?"pass":"fail";
        System.out.println(result);
    }
}