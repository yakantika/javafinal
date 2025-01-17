package arraylist;
// import java.lang.reflect.Array;
import java.util.*;

public class pairsum2 {
    public static boolean psum(ArrayList<Integer> list, int target){
        int bp=-1;
        int n= list.size();
        for(int i=0; i<list.size(); i++){
            if(list.get(i)> list.get(i+1)){
                bp = i;
                break;
            }
        }

        int si = bp+1;
        int ei = bp;
        int sum=0;

        while(si != ei){
            sum = list.get(si)+ list.get(ei);
            if(sum == target){
                return true;
            }

            if(sum < target){
                si = (si+1) % n;
            }else{
                ei = (n+ei-1)%n;
            }
        }

        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);


        System.out.println(psum(list, 100));
    }    
}
