package arraylist;
import java.util.ArrayList;

public class addelement {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>(); 

        //adding
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // //getting element
        // int n = list.get(0);

        
        // System.out.println(list);
        // System.out.println(list.get(1));
        // System.out.println(n);

        // //removing
        // list.remove(1);
        // System.out.println(list);

        // // setting new element
        // list.set(2,10);
        // System.out.println(list);

        // // elemnt contains in the list
        // System.out.println(list.contains(11));
        // System.out.println(list.contains(10));

        // // adding in perticular index
        // list.add(1, 2);
        // System.out.println(list);

        // // size of list
        // System.out.println(list.size());

        // print arraylist
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
