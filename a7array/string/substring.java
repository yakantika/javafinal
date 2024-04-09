public class substring {

    public static String substr(String str, int si, int ei){
        String subs = "";
        for(int i=si; i<ei; i++){
            subs += str.charAt(i);
        }

        return subs;
    }

    public static void main(String args[]){
        String str = "helloworld";
        int si,ei;

        System.out.println(substr(str, 0, 5));
        System.out.println(str.substring(0,5));
    }
}
