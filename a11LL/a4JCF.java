package a11LL;
//java collection framework
import java.util.LinkedList;

public class a4JCF {    
    public static void main(String args[]){
        // created
        LinkedList<Integer> ll = new LinkedList<>();

        // add
        ll.addFirst(1);
        ll.addFirst(0);
        ll.addLast(-1);
        ll.addLast(-2);

        // print
        System.out.println(ll);

        // remove
        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);



    }
}
