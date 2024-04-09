public class a3linearsearch {
    public static int inarr(int arr[],int target, int idx){

       if(idx==arr.length){
            return -1;
       }

       if(arr[idx]==target){

            return idx;
       }else{
            return inarr(arr,target, idx+1);
       }


    }
    public static void main(String args[]){
        int arr[] ={1,2,3,4,5};
        int target = 5;
        System.out.println(inarr(arr, target, 0));
    }
}
