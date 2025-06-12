public class j78_Interfaces {
    public static void main (String args[]){  // We can create classes like this for every piece
        ChessPlayer Red_King = new King();
        Red_King.moves();
        Red_King.commandPower();
        Queen Red_Queen = new Queen();
        Red_Queen.moves();
        Red_Queen.commandPower();
    }
}

interface ChessPlayer{  //bluePrint
    void moves(); //functions
    void commandPower(); 
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("Moves just one step  up, down, left, right, and diagonal ");
    }
    public void commandPower(){
        System.out.println("Lose him, and the war is lost.");
    }
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("Moves freely in all directions: up, down, left, right, and diagonal");
    }
    public void commandPower(){
        System.out.println("most powerfull yet second to the King");
    };
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("Charges up, down, left, and right, but never diagonal. Straight-laced and strong");
    }
    public void commandPower(){
        System.out.println("The castle's might.");
    }
}
class bishop implements ChessPlayer{
    public void moves(){
        System.out.println("Glides endlessly diagonally, weaving through colors");
    }
    public void commandPower(){
        System.out.println("The diagonals' shadow.");
    }
}
 class Knight implements ChessPlayer{
    public void moves(){
        System.out.println("Moves in an L-shape: two steps in one direction, then one left or right");
    }
    public void commandPower(){
        System.out.println("leaping over walls and catching foes unaware. A tricky tactician.");
    }
 }
class pawn implements ChessPlayer{
    public void moves(){
        System.out.println("Marches up the board, one step at a time. Attacks diagonally forward, never backward");
    }
    public void commandPower(){
        System.out.println("The humble soldier.");
    }
}