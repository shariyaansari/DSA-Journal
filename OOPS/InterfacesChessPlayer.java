package oops;

public class InterfacesChessPlayer {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}

// Make an interface called ChessPlayer
// Blueprint of the class
interface ChessPlayer{
    // This function move is bydefault public as well as abstract 
    void moves();
}

// MAking classes of Chessplayer

class Queen implements ChessPlayer{
    // But here we will have to explicitly state it public cause it's a class and if we don't declare it public it comes default
    public void moves(){
        System.out.println("Up, down, left, right, diagonal (in all directions)");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("Up, down, left, right");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("Up, down, left, right,diagonal (by 1 step)");
    }
}