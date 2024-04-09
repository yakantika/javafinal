public class a1reversenum {
    public static void main(String args[]){
        int n= 1824;
        System.out.println(rev(n));
    }

    public static int rev(int n){
        if(n%10 == n){
            return n;
        }

        System.out.print(n%10);

        return rev(n/10);
    }
}
