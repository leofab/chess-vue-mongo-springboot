package chess.vmsb.logic.business.models;

import chess.vmsb.logic.business.board.Board;

public class Knight extends Piece{

    public Knight(char pieceSign, boolean color){
        super(pieceSign, color);
    }

    public Knight(boolean color){
        super();
    }

    public boolean pieceVerifyMove(Board board, int[] from, int [] to){
        //TODO implement logic of pieceVerifyMove
        return true;
    }

}
