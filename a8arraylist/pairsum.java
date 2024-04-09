import java.util.*;

public class pairsum {
    public static boolean pair(ArrayList<Integer> list, int target){
        
        
        for(int i=0;i<list.size(); i++){
            int sum = 0;
            for(int j=i+1; j<list.size(); j++){
                sum = list.get(i)+list.get(j);
                if(sum==target){
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean optimised(ArrayList<Integer> list, int target){
        for(int i=0; i)
    }

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>(); 
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 50;

        System.out.println(pair(list, target));

    }
}
