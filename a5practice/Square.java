// package practice;

public class Square {
    private double side;
    private String color;

    public Square(){
        this.side = 1.0;
        this.color = "red";
    }

    public Square(double side, String color){
        this.side = side;
        this.color = color;
    }

    public double getside(){
        return side;
    }

    public void setside(double side){
        this.side = side;
    }

    public String getcolor(){
        return color;
    }

    public void setcolor(String color){
        this.color = color;
    }

    public static void main(String args[]){
        @SuppressWarnings("unused")
        Square s = new Square();
    }

}
