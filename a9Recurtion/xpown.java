public class xpown {
    public static int pow(int x, int n){
        if(n == 0){
            return 1;
        }

        int power = x * pow(x, n-1);

        return power;
    }

    public static void main(String args[]){
        System.out.println(pow(2, 10));
    }
}
