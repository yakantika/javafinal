package a13Queue;

// import a13Queue.a1intro.Queue;
import java.util.*;

public class a6interleave {

    public static void interLeave(Queue<Integer> q){
        Queue<Integer> firsthalf = new LinkedList<>();  //for storing first half
        int size = q.size();

        // note :- we shouldn't use q.size/2 here fir loop as with every itteration size of q is changing
        // so we should save size pahale se he 
        for(int i=0; i<size/2; i++){
            firsthalf.add(q.remove());
        }

        // jb tk 1st half khali nhi ho jata
        while(!firsthalf.isEmpty()){
            q.add(firsthalf.remove());
            q.add(q.remove());
        }
    }
    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        interLeave(q);

        // print
        while(!q.isEmpty()){
            System.out.println(q.remove()+" ");
            
        }
    }
}
