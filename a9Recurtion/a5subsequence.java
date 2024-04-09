import java.util.ArrayList;

public class a5subsequence {
    public static void subseq(ArrayList<Integer> list, ArrayList<Integer> list2, int idx){
        if(idx >= list.size()){
            System.out.println(list2);
            return;
        }

        list2.add(list.get(idx));
        subseq(list,list2, idx+1);
        list2.remove(list.get(idx));
        subseq(list,list2, idx+1);

    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list.add(3);
        list.add(1);
        list.add(2);

        subseq(list,list2, 0);
    }
}
