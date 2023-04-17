package chess.vmsb.logic.business.models;

import chess.vmsb.logic.business.board.Board;

public class Knight extends Piece{

    public Knight(char pieceSign, boolean color){
        super(pieceSign, color);
    }
    public boolean pieceCheck(Board board, int[] from, int [] to){
        //TODO implement logic of pieceVerifyMove
        return true;
    }

}
