public class newfile{

    public static void printletters(String totalname){
        for(int i=0; i<totalname.length(); i++){
            System.out.print(totalname.charAt(i)+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        // string length
        // String fullname = "isha roy";
        // System.out.println("length of full name is:" + fullname.length());

        // concatination
        String firstname = "Isha";
        String lastname = " roy";
        String totalname = firstname + " " + lastname;

        // System.out.println(totalname);

        printletters(totalname);

    }    
}
