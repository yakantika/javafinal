package arraylist;
import java.util.*;

public class mostwater {
    public static int storewater(ArrayList<Integer> height){
        int maxwater = 0;

        for(int i=0; i<height.size(); i++){
            for(int j=i+1; j<height.size(); j++){
                int ht= Math.min(height.get(i),height.get(j));
                int width = j-i;
                int curr = ht * width;
                maxwater = Math.max(maxwater, curr);
            }
        }

        return maxwater;
    }
    public static void main(String args[]){
        ArrayList<Integer> hight = new ArrayList<>();
        hight.add(1);
        hight.add(8);
        hight.add(6);
        hight.add(2);
        hight.add(5);
        hight.add(4);
        hight.add(8);
        hight.add(3);
        hight.add(7);

        System.out.println(storewater(hight));

    }
}
