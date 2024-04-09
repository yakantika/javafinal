import java.util.ArrayList;

public class a7subseqsum {
    public static void findsubseq(int i,int sum, int arr[], ArrayList<Integer> list, int t){
        
        if(i >= arr.length){
            if(t == sum){
                System.out.println(list);
                return;
            }
            return;
        }

        list.add(arr[i]);
        sum += arr[i];

        findsubseq(i+1,sum, arr, list, t);

        sum -= arr[i];
        list.remove(list.size()-1);

        findsubseq(i+1,sum, arr, list, t);

    }
    public static void main(String args[]){
        int arr[] = {1,2,1};
        ArrayList<Integer> list = new ArrayList<>();
        int target = 2;

        findsubseq(0, 0, arr, list, target);

    }
}
