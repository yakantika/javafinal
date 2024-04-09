public class upbatebit {
    public static int clear(int n, int i){
        int bitmask = 1<<i;
        return n | bitmask;
    }

    public static int setbit(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }

    public static int update(int n, int i, int newbit){
        if(newbit == 0){
            return clear(n, i);
        }else{
            return setbit(n, i);
        }
    }

    // ********w/o using set/clear bit
    // public static int update(int n, int i, int newbit){
    //     n = clear(n, i);
    //     int bitMask = newbit << i;
    //     return n | bitMask;
    // }

    public static void main(String[] args) {
        System.out.println(update(10, 2, 1));
    }
}
