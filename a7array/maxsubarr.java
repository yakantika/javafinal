// public class maxsubarr {
    // *********brute force
    // public static void maxsum(int arr[]){
    //     int currsum;
    //     int maxsum = Integer.MIN_VALUE;

    //     for(int i=0; i<arr.length; i++){
    //         for(int j=i; j<arr.length; j++){
    //             currsum = 0;
    //             for(int k=i; k<=j; k++){
    //                 currsum += arr[k];
    //             }
               
    //             System.out.println(currsum);
    //             if(currsum>maxsum){
    //                 maxsum = currsum;
    //             }
    //         }
    //     }

    //     System.out.println("max sum is="+maxsum);
    // }
    // public static void main(String args[]){
    //     int arr[]= {2,4,8,3,6,5};
    //     maxsum(arr);
    // }


    // *****prefix sum
    //TC - O(n^2)

    // public static void maxsum(int arr[]){
    //     int currsum;
    //     int maxsum = Integer.MIN_VALUE;
    //     int prefix[] = new int[arr.length];
    //     prefix[0] = arr[0];

    //     for(int i=1; i<prefix.length; i++){
    //         prefix[i] = prefix[i-1] + arr[i];
    //     }

    //     for(int i=0; i<arr.length; i++){
    //         for(int j=i; j<arr.length; j++){
    //             currsum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];
                
    //             if(currsum>maxsum){
    //                 maxsum = currsum;
    //             }
    //         }
    //     }

    //     System.out.println("max sum is="+maxsum);
    // }


    // *************kadanes
    // TC- O(n)
//     public static void kadanes(int arr[]){
//         int ms = Integer.MIN_VALUE;
//         int cs = 0;

//         for(int i=0; i<arr.length; i++){
//             cs += arr[i];
//             if(cs<0){
//                 cs=0;
//             }
//             ms = Math.max(cs, ms);
//         }

//         System.out.println("our max subarray sum is: " + ms);
//     }



//     public static void main(String args[]){
//         int arr[]= {-2, -3, 4,-1,-2,1,5,-3};
//         kadanes(arr);
//     }

// }

public class maxsubarr{
    public static void kadanes(int arr[]){
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            max = Math.max(max,sum);
            if(sum<0){
                sum = 0; 
            }
        }

        System.out.println("maximum sum is= "+ max);
    }

    public static void main(String args[]){
        int arr[] = {-1,-2,-6,-2,9,-5};
        kadanes(arr);

    }
}

