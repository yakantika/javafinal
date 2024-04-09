public class a2noofzeros {
    public static void main(String args[]){
        int n=302004;
        System.out.println(count(n));

    }

    // static int count=0;
    public static int count(int n){
        return zeros(n, 0);

    }

    public static int zeros(int n,int c){
        if(n == 0){
            return c;
        }

        int rem = n%10;
        if(rem == 0){
            return zeros(n/10, c+1);
        }
        return zeros(n/10, c);

    }
}
