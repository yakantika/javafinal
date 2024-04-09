// import horse.chicken;

public class abstraction {
    public static void main(String args[]){
        // Horse h = new Horse();
        // h.walks();
        // System.out.println(h.color);

        // chicken c = new chicken();
        // c.walks();

        Mustang myhorse = new Mustang();
        // animal -> horse -> mustang
    }
}

abstract class Animal{
    String color;
    Animal(){
        color = "brown";
        System.out.println("Animal constructor called");
    }
    void eat(){
        System.out.println("animal eats");
    }

    abstract void walks();
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor called");
    }
    void setcolor(){
        color = "dark brown";
    }

    void walks(){
        System.out.println("walks on 4 legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called");
    }
}

class chicken extends Animal{

    void walks(){
        System.out.println("walks on 2 legs");
    }
}
