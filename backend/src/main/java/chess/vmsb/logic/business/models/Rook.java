package chess.vmsb.logic.business.models;

import chess.vmsb.logic.business.board.Board;

public class Rook extends Piece{

    public Rook(char pieceSign, boolean color) {
        super(pieceSign, color);
    }
    public boolean pieceCheck(Board board, int[] from, int [] to){
        //TODO implement logic of pieceVerifyMove
        return true;
    }
    public boolean dfs(Board board, int[] from, int[] to, int[] direction) {

        //TODO implement logic of dfs
//        int[] next = new int[2];
//        next[0] = from[0] + direction[0];
//        next[1] = from[1] + direction[1];
//        if (next[0] == to[0] && next[1] == to[1]) {
//            return true;
//        }
//        if (next[0] < 0 || next[0] >= 8 || next[1] < 0 || next[1] >= 8) {
//            return false;
//        }
//        if (board.getBoard()[next[0]][next[1]] != null) {
//            return false;
//        }
//        return dfs(board, next, to, direction);
        return true;
    }
}
