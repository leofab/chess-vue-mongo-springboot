package vmsb.chess.logic.business;

public class King extends Piece{


    public King(char pieceSign) {
        super(pieceSign);
    }

    public King(boolean color){
        super();

    }

    public boolean pieceVerifyMove(Board board, int[] from, int [] to){
        //TODO implement logic of pieceVerifyMove
        return true;
    }
}