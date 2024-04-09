
public class shortestpath {
    public static float displacement(String path){
        int x=0;
        int y=0;
        int n = path.length();
        for (int i=0; i<n; i++){
            char direc =path.charAt(i);
            
            if(direc == 'E'){
                x++;
            }

            if(direc == 'W'){
                x--;
            }

            if(direc == 'S'){
                y--;
            }

            if(direc == 'N'){
                y++;
            }

        }

        int x2 = x*x;
        int y2 = y*y;

        return (float)Math.sqrt(x2+y2);
    }

    public static void main(String args[]){
        String path = "WNEENESENNN";
        System.out.println(displacement(path));
    }
}
