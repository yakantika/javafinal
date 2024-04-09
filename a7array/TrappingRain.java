public class TrappingRain{
    public static int RainWatertrapped(int hight[]){
        int n = hight.length;
        // helper array for left max hight
        int leftmax[] = new int[n];
        leftmax[0] = hight[0];
        for(int i=1; i<n; i++){
            leftmax[i] = Math.max(leftmax[i-1], hight[i]);
        }
        // helper arry for right max hight
        int rightmax[] = new int[n];
        rightmax[n-1] = hight[n-1];
        for(int i=n-2; i>=0; i--){
            rightmax[i] = Math.max(rightmax[i+1], hight[i]);
        }
        // loop to calculate water level
        int trappedwater = 0;
        for(int i=0; i<n; i++){
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            trappedwater += waterlevel - hight[i]; 
        }
        // trapped water

        return trappedwater;
    } 
    public static void main(String args[]){
        int hight[] = {4,2,0,6,3,2,5};
        System.out.println(RainWatertrapped(hight));

    }
}