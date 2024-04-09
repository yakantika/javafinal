public class pairingfriend {
    public static int ways(int n){
        if(n==1 || n==2){
            return n;
        }

        int single = ways(n-1);
        int pairs = (n-1) * ways(n-2);

        return single + pairs;
    }

     public static void main(String args[]){
        System.out.println(ways(3));
     }
}