public class MoveMaker {

    public static void makeMove(Board board, int column){
        int line = 0;
        while(board.squares[line][column] > 0) line ++;
        board.squares[line][column] = getColorIntFromMoveRight(board);
        board.yellowToTurn = !board.yellowToTurn;
    }

    public static int getColorIntFromMoveRight(Board board){
        if (board.yellowToTurn) return 1;
        else return 2;
    }

    public static void undoMove(Board board, int column){
        //@TODO: auch das schaffst du
    }

}
