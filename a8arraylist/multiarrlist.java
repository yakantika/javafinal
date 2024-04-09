import java.util.ArrayList;
import java.util.Scanner;

public class multiarrlist{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();

        for(int i=0; i<3; i++){
            mainlist.add(new ArrayList<>());
            for(int j=0; j<3; j++){
                mainlist.get(i).add(sc.nextInt());
            }

        }

        System.out.println(mainlist);
    }
}