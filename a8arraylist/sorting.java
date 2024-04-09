package arraylist;
// import java.util.ArrayList;
// import java.util.Collections;
import java.util.*;

public class sorting {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(8);
        list.add(3);
        list.add(9);

        System.out.println(list);
        Collections.sort(list);  //sorts the list in assending  order
        System.out.println(list);

        // in decending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
        
    }
}
