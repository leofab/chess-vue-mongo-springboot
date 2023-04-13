package chess.vmsb.logic.business.models;

import chess.vmsb.logic.business.board.Board;

public class Queen extends Piece{

        public Queen(char pieceSign) {
            super(pieceSign);
        }

        public Queen(boolean color){
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
