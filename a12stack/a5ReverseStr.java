import java.util.*;

public class a5ReverseStr{
    public static String reverseStr(String str){
        Stack<Character> s = new Stack<>();

        int idx = 0;
        while(idx < str.length()){
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder();
        while (!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);
        }
        
        return result.toString();
    }
    public static void main(String args[]){
        // Stack<Integer> s = new Stack<>(); 
        String str = "isha";
        String result = reverseStr(str);
        System.out.println(result);
    }
}