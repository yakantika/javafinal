import java.util.*;

public class newfor {
    public static void main(String args[]){
        int arr[] = new int[4];
        Scanner sc = new Scanner(System.in);
        
        for(int i=0; i<4; i++){
            arr[i] = sc.nextInt();
        }

        for(int num: arr){
            System.out.print(num+ " ");
        }
    }
}
