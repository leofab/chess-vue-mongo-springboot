package vmsb.chess.logic.business;

public class Rook extends Piece{
    public Rook(char pieceSign) {
        super(pieceSign);
    }

    public Rook(boolean color){
        super();

    }

    public boolean pieceVerifyMove(Board board, int[] from, int [] to){
        //TODO implement logic of pieceVerifyMove
        return true;
    }

    private boolean dfs(Board board, Piece sourceP, int[] from, int[] to, int x, int y ){
        //TODO implement dfs logic
        return true;
    }
}
