package vmsb.chess.logic.business.utils;

import vmsb.chess.logic.business.Board;
import vmsb.chess.logic.business.Player;

import java.util.ArrayList;

public class MovementHandler {
    private int countRep;
    private int pieceCheckCoord;
    //TODO talks to VUE
//    private UI userUI;

    protected int[] getKingXY (Board board, Player[] player, int whichPlayer){
        //TODO implement getKingXY logic
        return ;
    }
    protected boolean isFromEmpty(Board board, int from){
        //TODO implement isFromEmpty logic
        return ;
    }
    protected boolean isValidMove(Board board, int from, int to, int whichPlayer){
        //TODO implement isValidMove logic
        return ;
    }
    protected boolean isValidMove(Board board, ArrayList<ArrayList<Integer>> moveData, int whichPlayer){
        //TODO implement isValidMove logic
        return ;
    }

//    ~ is KingFrom(Board board, ArrayList<ArrayList<Integer>> moveData): boolean
    protected boolean isKingTo(Board board, ArrayList<ArrayList<Integer>> moveData){
        //TODO implement isKingTo logic
        return ;
    }


//~ isRookTo(Board board, ArrayList<ArrayList<Integer>> moveData: boolean
    protected boolean isRookFrom(Board board, ArrayList<ArrayList<Integer>> moveData){
        //TODO implement isRookFrom logic
        return ;
    }
//            ~ canCastle(Board board, ArrayList<ArrayList<Integer>> moveData, int whichPlayer): boolean
    protected boolean canCastle(Board board, ArrayList<ArrayList<Integer>> moveData, int whichPlayer){
        //TODO implement canCastle logic
        return ;
    }
//# drawFifty(): boolean
    boolean drawFifty(){
        //TODO implement drawFifty logic
        return ;
    }
//# isCheck(Board board, Player[] player, int whichPlayer): boolean
    boolean isCheck(Board board, Player[] player, int whichPlayer){
        //TODO implement isCheck logic
        return ;
    }

//# isCheckRemovable(Board board, Player[] player, int whichPlayer): boolean
    boolean isCheckRemovable(Board board, Player[] player, int whichPlayer){
        //TODO implement isCheckRemovable logic
        return ;
    }
//# isKingStaleMate(Board board, Player[] player, int whichPLayer): boolean
    boolean isKingStaleMate(Board board, Player[] player, int whichPLayer){
        //TODO implement isKingStaleMate logic
        return ;
    }
//# pieceNotLocked(Board board, int from, PLayer[] player, int whichPlayer): boolean
    boolean pieceNotLocked(Board board, int from, PLayer[] player, int whichPlayer){
        //TODO implement pieceNotLocked logic
        return ;
    }
//# performMove(Board board, Player[] player, int from, int to): Object[]
    Object[] performMove(Board board, Player[] player, int from, int to){
        //TODO implement performMove logic
        return ;
    }
//# performMove(Board board, Player[] player, ArrayList<ArrayList<Integer>> moveData): Object[]
    Object[] performMove(Board board, Player[] player, ArrayList<ArrayList<Integer>> moveData){
        //TODO implement performMove logic
        return ;
    }
//# performCastling(Board board, Player[] player, ArrayList<ArrayList<Integer>> moveData): Object[]
    Object[] performCastling(Board board, Player[] player, ArrayList<ArrayList<Integer>> moveData){
        //TODO implement performCastling logic
        return ;
    }
//+getCountRep(): int
    public int getCountRep(){
        //TODO implement getCountRep logic
        return ;
    }

//+setCountRep(int aCountRep): void
    public void setCountRep(int aCountRep){
        //TODO implement setCountRep logic
        return ;
    }

//+getPieceCheckCoord(): int[]
    public int[] getPieceCheckCoord(){
        //TODO implement getPieceCheckCoord logic
        return ;
    }
//+setPieceCheckCoord(int[] aPieceCheckCoord): void
    void setPieceCheckCoord(int[] aPieceCheckCoord){
        //TODO implement setPieceCheckCoord logic
        return ;
    }



}
