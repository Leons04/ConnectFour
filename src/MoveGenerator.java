import jdk.internal.classfile.Signature;

import java.util.ArrayList;

public class MoveGenerator {


    //gibt alle Spalten zurück, die nicht voll sind und man somit werfen darf
    public static ArrayList<Integer> getLegalMoves(Board board){
        ArrayList<Integer> legalMoves = new ArrayList<>();

        for(int column = 0; column < Board.WIDHT; column++){
            if(!board.columnIsFull(column)) legalMoves.add(column);
        }
        return legalMoves;
    }


}
