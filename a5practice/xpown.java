public class xpown {
    public static int pow(int x, int n){
        if(n==0){
            return 1;
        }

        int 
        if(n%2 == 0){
            return pow(x,n/2)*pow(x,n/2);
        }
        return x*pow(x,n/2)*pow(x,n/2);
    }
    public static void main(String args[]){
        int x = 2;
        int n = 4;
        System.out.println(pow(x,n));
    }
}
