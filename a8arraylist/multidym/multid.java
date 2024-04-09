package arraylist.multidym;
import java.util.*;

public class multid {
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        ArrayList<Integer> c = new ArrayList<>();

        for(int i=1; i<=5; i++){
            a.add(i*1);
            b.add(i*2);
            c.add(i*3);
        }

        mainlist.add(a);
        mainlist.add(b);

        mainlist.add(c);


        // System.out.println(mainlist);
        for(int i=0; i<mainlist.size(); i++){
            ArrayList<Integer> d = mainlist.get(i);
            for(int j=0; j<d.size(); j++){
                System.out.print(d.get(j)+" ");
            }
            System.out.println();
        }
        


    }
}
