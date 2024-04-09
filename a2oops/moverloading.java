public class moverloading {
    public static void main(String args[]){
        Calculator calc = new Calculator();
        System.out.println(calc.sum(1,2));
        System.out.printf("%.2f\n",calc.sum((float)1.2,(float)3.4));
    }
}

// here compiler knows which function should call in compile time
class Calculator{
    int sum (int a, int b){
        return a + b;
    }

    float sum (float a, float b){
        return a + b;
    }

    int sum (int a, int b, int c){
        return a + b + c;
    }
}