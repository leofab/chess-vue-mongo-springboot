package chess.vmsb.logic.business;

public class Pawn extends Piece {

    public Pawn(char pieceSign) {
        super(pieceSign);
    }

    public Pawn(boolean color){
        super();

    }

    public boolean pieceVerifyMove(Board board, int[] from, int [] to){
        //TODO implement logic of pieceVerifyMove
        return true;
    }
}
