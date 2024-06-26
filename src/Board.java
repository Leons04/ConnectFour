import java.util.Arrays;

public class Board {

    //gibt an, welcher Spieler den nächsten Zug machen darf
    public boolean yellowToTurn;

    //Speicherung der Steine und Felder
    //der erste Index gibt die Zeile an, der zweite die Spalte
    //Zeile 0 ist die unterste Zeile -> Aufpassen beim Drucken
    public int[][] squares;

    //Höhe und Breite
    public static final int HEIGHT = 6;
    public static final int WIDHT = 7;

    //mögliche Einträge in squares
    public static final int YELLOW = 1;
    public static final int RED = 2;
    public static final int FREE = 0;

    public Board(){
        yellowToTurn = true;
        squares = new int[HEIGHT][WIDHT];
    }

    public void clear(){
        for(int line = 0; line < 6; line++){
            Arrays.fill(squares[line], FREE);
        }
    }

    public boolean columnIsFull(int column){
        return squares[5][column] != FREE;
    }

    public boolean isFull(){
        //@TODO: wenn das ganze Brett voll ist
        // Du schaffst das Leon, vllt kannst du sogar bereits vorhandenen Code wiederverwenden
        return false;
    }


    public int getColorIntFromMoveRight(){
        return yellowToTurn ? YELLOW : RED;
    }


    // Darsstellung des Brettes im String Format
    //Zur Ausgabe auf dr Konsole
    public String toString(){
        //@TODO: implement
        return null;
    }


}
