package intro;
// import java.util.*;
public class a11bintodec {
    // bintodec(10);

public static void bintodec(int n){
    int pow = 0;
    int dec = 0;
    // int ld;

    while(n>0){
        int ld = n%10;
        dec = dec + (ld * ((int)Math.pow(2,pow)));
        pow++;
        n = n/10;
    }

    System.out.println(dec);
}

public static void main(String args[]){
    bintodec(100);
}

}