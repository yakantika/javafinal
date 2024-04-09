import java.util.ArrayList;

public class a6subseq {
    public static void subseq(ArrayList<Integer> list,ArrayList<Integer> list2, int i){
        if(i >= list.size()){
            System.out.println(list2);
            return;
        }

        list2.add(list.get(i));
        subseq(list, list2, i+1);
        list2.remove(list.get(i));
        subseq(list, list2, i+1);
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list.add(3);
        list.add(4);
        list.add(5);

        subseq(list, list2, 0);

    }
}
