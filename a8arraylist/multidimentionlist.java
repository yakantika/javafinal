package arraylist;

import java.util.ArrayList;
import java.util.*;

public class multidimentionlist {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    ArrayList<ArrayList<Integer>> list = new ArrayList<>();
   

    // for initialise
    for(int i =0; i<3; i++){
        list.add(new ArrayList<>());
    }

    // add element
    for(int i =0; i<3; i++){
        for(int j=0; j<3; j++){
            list.get(i).add(sc.nextInt());
        }
    }

    System.out.println(list);
}
}
