import Pen.BankAccount;

public class Oops {
    // actual pen
    public static void main(String args[]){
        // class name ->Pen
        // new-> taking memory to store class properties
        // Pen()->constructer
        Pen p1 = new Pen(); //created a pen object called p1
        // .will be used to access the function or properties
        p1.setcolor("blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.color = "yello"; // this can also be done
        System.out.println(p1.color);

        BankAccount myAcc = new BankAccount();
        myAcc.username = "isha";
        myAcc.SetPass("abc");
        System.out.println(myAcc.password); //cant be accessed
        System.out.println(myAcc.username);
    }
}

// blueprint of pen
class Pen {
    // we will define property + function
    String color; //properties
    int tip;

    void setcolor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
} 

class BankAccount{
    public String username;
    private String password;
    
    public void SetPass(String pwd){
        password = pwd;
    }
}