//single level inheritance 
// public class inheritance {
//     public static void main(String args[]){
//         Fish nemo = new Fish();
//         nemo.color = "red";
//         System.out.println(nemo.color);
//     }
// }

// //base class
// class Animal{
//     String color;

//     void eat(){
//         System.out.println("eats fud");
//     }

//     void breadth(){
//         System.out.println("breadth");
//     }
// }

// // derived class/ subclass
// class Fish extends Animal{
//     int fins;

//     void swim(){
//         System.out.println("swims");
//     }
// }


// multi level inheritance
// public class inheritance {
//     public static void main(String args[]){
//         Dog dobby = new Dog();
//         dobby.legs = 4;
//         dobby.eat();
//         System.out.println(dobby.legs);
//     }
// }

// //base class
// class Animal{
//     String color;

//     void eat(){
//         System.out.println("eats fud");
//     }

//     void breadth(){
//         System.out.println("breadth");
//     }
// }

// class Mammals extends Animal{
//     int legs;
// }

// class Dog extends Mammals{
//     String breed;
// }


// hirarchical inheritance
// public class inheritance {
//     public static void main(String args[]){
//         Fish nemo = new Fish();
//         nemo.color = "red";
//         System.out.println(nemo.color);
//     }
// }

// //base class
// class Animal{
//     String color;

//     void eat(){
//         System.out.println("eats fud");
//     }

//     void breadth(){
//         System.out.println("breadth");
//     }
// }

// // derived class/ subclass
// class Fish extends Animal{
//     void swim(){
//         System.out.println("swims");
//     }
// }

// class Bird extends Animal{
//     void fly(){
//         System.out.println("flyes");
//     }
// }

// class Mammals extends Animal{
//     void walk(){
//         System.out.println("walks");
//     }
// }

// hybrid inheritance
public class inheritance {
    public static void main(String args[]){
        Tuna nemo = new Tuna();
        nemo.velocity();
        // System.out.println(nemo.color);
    }
}

//base class
class Animal{
    String color;

    void eat(){
        System.out.println("eats fud");
    }

    void breadth(){
        System.out.println("breadth");
    }
}

// derived class/ subclass
class Fish extends Animal{
    void swim(){
        System.out.println("swims");
    }
}

class Tuna extends Fish{
    void velocity(){
        System.out.println("5km/hr");
    }
    void color(){
        System.out.println("its colour is gray");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("flyes");
    }
}

class Mammals extends Animal{
    void walk(){
        System.out.println("walks");
    }
}