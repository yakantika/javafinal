package arraylist;

import java.lang.reflect.Array;
import java.util.*;

public class intro {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>(10);
        Scanner sc = new Scanner(System.in);
        // list.add(2);
        // list.add(22);
        // list.add(23);
        // list.add(29);

        // System.out.println(list.contains(1));
        // System.out.println(list);
        // list.set(0,99);
        // System.out.println(list);
        // list.remove(2); 


        // by taking user input
        for(int i=0; i<5; i++){
            list.add(sc.nextInt());
        }

        // printing elemnet
        for(int i=0; i<5; i++){
            System.out.print(list.get(i)+ " ");
        }

    }
}
