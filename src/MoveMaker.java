public class MoveMaker {

    public static void makeMove(Board board, int column){
        int line = 0;
        while(board.squares[line][column] > 0) line ++;
        board.squares[line][column] = board.getColorIntFromMoveRight();
        board.yellowToTurn = !board.yellowToTurn;
    }



    public static void undoMove(Board board, int column){
        //@TODO: auch das schaffst du
    }

}
