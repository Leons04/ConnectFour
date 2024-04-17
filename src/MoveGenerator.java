
import java.util.ArrayList;

public class MoveGenerator {


    //gibt alle Spalten zurück, die nicht voll sind und in die man somit werfen darf
    public static ArrayList<Integer> getLegalMoves(Board board){
        ArrayList<Integer> legalMoves = new ArrayList<>();

        for(int column = 0; column < Board.WIDHT; column++){
            if(!board.columnIsFull(column)) legalMoves.add(column);
        }
        return legalMoves;
    }



    //Spiel ist vorbei wenn man keine legalen Züge mehr hat
    //diese Methode tut genau dasselbe wie isFull() in Board, allersings
    //macht es aus Perfmancegründen Sinn diese Methode zu verwenden
    public static boolean gameOver(ArrayList <Integer> legalMoves){
        return legalMoves.size() == 0;
    }


}
