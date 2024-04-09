public class atoz {
    public static void main(String args[]){
        String str = " ";
        for(int i=0; i<26; i++){
            char ch = (char) (i+'a');
            System.out.println(ch);
            str += ch;
        }
        System.out.println(str);
    }
}
