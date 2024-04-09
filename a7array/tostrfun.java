import java.util.*;

public class tostrfun {
    public static void main(String args[]){
        // int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);

        // for(int i=0; i<arr.length; i++){
        //     arr[i] = sc.nextInt();
        // }

        // for(int num : arr){
        //     System.out.print(num);
        // }

        // System.out.println(Arrays.toString(arr));

        // string array
        String str[] = new String[4];
        
        for(int i=0; i<str.length; i++){
            str[i] = sc.next();
        }

        System.out.println(Arrays.toString(str));

        str[1] = "isha";

        System.out.println(Arrays.toString(str));
    }

}
