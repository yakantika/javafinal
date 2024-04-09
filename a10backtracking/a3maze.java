package backtracking;

public class a3maze {
    public static int gridways(int r, int c){
        if(r == 1 || c == 1){
            return 1;
        }

        int right = gridways(r, c-1);
        int down = gridways(r-1, c);

        return right+down;
    }
    public static void main(String args[]){
        System.out.println(gridways(3,3));
    }
}
