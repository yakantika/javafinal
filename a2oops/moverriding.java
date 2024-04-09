public class moverriding {
    public static void main(String args[]){
        Deer d = new Deer();
        d.eat();
    }
}

class Animal {
    void eat(){
        System.out.println("eats");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("eat grass");
    }
}