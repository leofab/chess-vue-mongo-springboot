package chess.vmsb.logic.business.models;

import chess.vmsb.logic.business.board.Board;

import java.util.ArrayList;

public class Piece {
    private char pieceSign;
    private boolean moved;
    private int dx;
    private int dy;
    private ArrayList<int[]> lastMovePath;

    public Piece(char pieceSign) {
        this.pieceSign = pieceSign;
    }

    public Piece() {

    }

    public boolean pieceVerifyMove(Board board, int[] from, int[] to){
        //TODO implement the logic of pieceVerifyMove
        return true;
    }

    public void addMovePath(int coord){
        //TODO implement the logic of addMovePath
    }

    public char getPieceSign() {
        return pieceSign;
    }

    public void setPieceSign(char pieceSign) {
        this.pieceSign = pieceSign;
    }

    public boolean isMoved() {
        return moved;
    }

    public void setMoved(boolean moved) {
        this.moved = moved;
    }

    public int getDx() {
        return dx;
    }

    public void setDx(int dx) {
        this.dx = dx;
    }

    public int getDy() {
        return dy;
    }

    public void setDy(int dy) {
        this.dy = dy;
    }

    public ArrayList<int[]> getLastMovePath() {
        return lastMovePath;
    }

    public void setLastMovePath(ArrayList<int[]> lastMovePath) {
        this.lastMovePath = lastMovePath;
    }

//    @Override
//    public String toString() {
//        return "Piece{" +
//                "pieceSign=" + pieceSign +
//                '}'+"\n";
//    }
}
