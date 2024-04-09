public class strcomarefun {
    public static void main(String args[]){
        String s1 = "Isha";
        String s2 = "Isha";
        String s3 = new String("Isha");

        if(s1==s3){
            System.out.println("Equal");
        }else{
            System.out.println("unequal");
        }

        if(s1.equals(s3)){
            System.out.println("equal");
        }else{
            System.out.println("unequal");
        }
        
    }
}
