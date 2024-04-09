// import javax.swing.plaf.synth.SynthLookAndFeel;

public class interfchessgame{
    public static void main(String args[]){
        queen q = new queen();
        q.moves();
    }
}

//blueprint of chessplayer 
interface chessplayer{
    void moves(); //all will have some moves
}

class queen implements chessplayer{
    public void moves(){  //we have to write public keyword otherwise it will be of default type
        System.out.println("up, down, left, right, diagonal(in all 4 direction)");
    }
}

class king implements chessplayer{
    public void moves(){
        System.out.println("up, down, right, left, diagonal ( in all 4 directions by one step)");
    }
}

class rook implements chessplayer{
    public void moves(){
        System.out.println("up, down, left, right");
    }
}