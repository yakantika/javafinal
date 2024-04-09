public class tilingprob {
    public static int ways(int n){
        if( n==1 || n==0){
            return 1;
        }

        // verticle
        int vways = ways(n-1);
        // horizonta;
        int hways = ways(n-2);

        return vways+hways;
    }

    public static void main(String args[]){
        System.out.println(ways(4));
    }
}
