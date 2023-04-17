package chess.vmsb.logic.business.utils;

import chess.vmsb.logic.business.board.Board;
import chess.vmsb.logic.business.board.Square;
import chess.vmsb.logic.business.models.Piece;
import chess.vmsb.logic.business.models.Player;

import java.util.ArrayList;

public class MovementHandler {
    private int countRep;
    private int pieceCheckCoord;
    //TODO talks to VUE
//    private UI userUI;

    public int[] getKingXY(Board board, Player[] player) {
        Player playerW = player[0];
        Player playerB = player[1];
        int[] wKingXY = new int[2];
        int[] bKingXY = new int[2];
        int[] wbKingXY = new int[4];
        Piece wKing = playerW.getPieces().stream().filter(piece -> piece.getPieceSign() == 'k').findFirst().get();
        Piece bKing = playerB.getPieces().stream().filter(piece -> piece.getPieceSign() == 'K').findFirst().get();
        for (int i = 0; i < board.getGameBoard().length; i++) {
            for (int j = 0; j < board.getGameBoard()[i].length; j++) {
                if (board.getGameBoard()[i][j].getPiece() == wKing) {
                    wbKingXY[0] = i;
                    wbKingXY[1] = j;
                }
                if (board.getGameBoard()[i][j].getPiece() == bKing) {
                    wbKingXY[2] = i;
                    wbKingXY[3] = j;
                }
            }
        }
        return wbKingXY;
    }

    protected static Board performMove(Board board, Player[] player, ArrayList<ArrayList<Integer>> moveData) {
        int from[]=Functional.splitDataPair(moveData.get(0));//row,col
        int to[]=Functional.splitDataPair(moveData.get(1));//row,col
        return board;
    }

    public boolean isCheck(){
        //put code here
        return true;
    }

    public boolean isCheckMate(){
        //put code here
        return true;
    }

    public static boolean isValidMove(Board board, ArrayList<ArrayList<Integer>> moveData) {
        int from[] = Functional.splitDataPair(moveData.get(0));//row,col
        int to[] = Functional.splitDataPair(moveData.get(1));//row,col

        if (board.getGameBoard()[from[0]][from[1]].getPiece() == null) {
            return false;
        } else {
            if (board.getGameBoard()[from[0]][from[1]].getPiece().pieceCheck(board, from, to)) {
                return true;
            }
        }
        return false;
    }
}

