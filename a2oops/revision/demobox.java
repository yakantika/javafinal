package revision;

public class demobox extends box {
    double weight;

    public demobox(){
        this.weight = -1;
    }

    public demobox(double l, double w, double h, double we){
        super(l,w,h);
        this.weight = we;
    }

}


