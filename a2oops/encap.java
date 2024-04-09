
public class encap {
    public static void main(String args[]){
        demo d = new demo();
        d.setname("isha");
        System.out.println(d.getname());
 
    }
}

class demo{
    private String name;

    public void setname(String name){
        this.name = name;
    }

    public String getname(){
        return name;
    }
}

