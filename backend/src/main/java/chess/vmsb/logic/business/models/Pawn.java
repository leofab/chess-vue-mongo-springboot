package chess.vmsb.logic.business.models;

import chess.vmsb.logic.business.board.Board;

public class Pawn extends Piece {


    public Pawn(char pieceSign) {
        super(pieceSign);
    }

    public Pawn(boolean color){
        this.color = color;

    }



    public boolean pieceVerifyMove(Board board, int[] from, int [] to){
        //TODO implement logic of pieceVerifyMove
        return true;
    }
}
