public class a8numofsubseq {
    public static int count(int i, int arr[], int ts, int sum){
        if(i>= arr.length){
            if(ts == sum){
                return 1;
            }
            return 0;
        }

        sum += arr[i];
        int l = count(i+1, arr, ts, sum);

        sum -= arr[i];
        int r = count(i+1, arr, ts, sum);

        return l+r;
    }
    public static void main(String args[]){
        int arr[] = {1,2,1};
        int target_sum = 2;

        System.out.println(count(0, arr, target_sum, 0));
    }
}
