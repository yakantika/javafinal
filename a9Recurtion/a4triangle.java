public class a4triangle {
    public static void pattern(int r, int c){
        if(r == 0){
            return;
        }

        if(r>c){
            System.out.print("*");
            pattern(r, c+1);
        }else{
            System.out.println();
            pattern(r-1, 0);
        }
    }
    public static void main(String args[]){
        pattern(4, 0);
    }
}