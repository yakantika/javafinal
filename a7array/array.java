import java.util.Scanner;

// i/p,o/p,update
// public class array {
//     public static void main(String args[]){
//         int marks[] = new int[10];

        // Scanner sc = new Scanner(System.in);

        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();

        // System.out.println("phy: "+ marks[0]);
        // System.out.println("chem: " + marks[1]);
        // System.out.println("maths: "+ marks[2]);

        // marks[2] = 100;
        // marks[2] += 1;
        // System.out.println("updated maths: "+ marks[2]);
        
        // int percentage = ((marks[0]+ marks[1]+ marks[2])/3);
        // System.out.println("percentage = "+ percentage + "%");


//         System.out.println(marks.length);
//     }
// }

// arrays as function argument
// public class array{
//     public static void update(int marks[], int demo){
//         for(int i=0; i<marks.length; i++){
//             marks[i] = marks[i] + 1;
//         }

//         demo = 10;
//     }

//     public static void main(String args[]){
//         int marks[] = {89,98,99};
//         int demo = 5;
//         update(marks, demo);
//         System.out.println(demo);
    

//     for(int i=0; i<marks.length; i++){
//         System.out.print(marks[i]+" ");
//     }
//     }
// }


// liner search
// public class array{

//     public static int linear_search(int arr[], int key){
//         for(int i=0; i<arr.length; i++){
//             if(arr[i]==key){
//                 return i;
//             }
//         }

//         return -1;
//     }

//     public static void main(String args[]){
//         int arr[] = {2,4,6,8,10,12};
//         // int key = 8;
//         int key = 20;

//         int index = linear_search(arr,key);
//         if(index == -1){
//             System.out.println("key not in array");
//         }else{
//             System.out.println("key is in index: " + index);
//         }
//     }
// }


// using string
// public class array{

//         public static int linear_search(String menu[], String key){
//             for(int i=0; i<menu.length; i++){
//                 if(menu[i].equals(key)){
//                     return i;
//                 }
//             }
    
//             return -1;
//         }
    
//         public static void main(String args[]){
//             String menu[] = {"dosa","pizza","idli","pasta"};
//             // int key = 8;
//             String key = "dos";
    
//             int index = linear_search(menu,key);
//             if(index == -1){
//                 System.out.println("key not in menu");
//             }else{
//                 System.out.println("key is in serialnumber: " + index);
//             }
//         }
//     }