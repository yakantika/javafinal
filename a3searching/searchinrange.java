// public package searching;

class searchinrange {

    public static void main(String args[]){
        int arr[] ={2,4,5,6,87};
        System.out.println(search(arr, 87,1,4));


    }

    static int search(int[] arr, int key, int si, int ei){
        for(int i=si; i<=ei; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
}