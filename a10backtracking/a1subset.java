package backtracking;

public class a1subset {
    public static void findsubset(String arr, String ans, int i){
        if(i == arr.length()){
            if(ans.length()==0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }

        // yes choice
        findsubset(arr, ans+arr.charAt(i), i+1);

        // no choise
        findsubset(arr, ans, i+1);

    }
    public static void main(String args[]){
        String arr = "abc";
        // String ans="";
        // findsubset(arr, ans, 0);
        findsubset(arr, "", 0);

    }
}
