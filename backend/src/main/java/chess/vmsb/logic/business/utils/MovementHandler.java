package chess.vmsb.logic.business.utils;

import chess.vmsb.logic.business.board.Board;
import chess.vmsb.logic.business.models.Player;

import java.util.ArrayList;

public class MovementHandler implements Functional{
    private int countRep;
    private int pieceCheckCoord;
    //TODO talks to VUE
//    private UI userUI;

    protected int[] getKingXY (Board board, Player[] player, boolean whichPlayer){
        //TODO implement getKingXY logic
        return new int[2];
    }
    protected boolean isFromEmpty(Board board, int from){
        //TODO implement isFromEmpty logic
        return true;
    }
    protected boolean isValidMove(Board board, int from, int to, int whichPlayer){
        //TODO implement isValidMove logic
        return true;
    }
    protected boolean isValidMove(Board board, ArrayList<ArrayList<Integer>> moveData, int whichPlayer){
        //TODO implement isValidMove logic
        return true;
    }

    //    ~ is KingFrom(Board board, ArrayList<ArrayList<Integer>> moveData): boolean
    protected boolean isKingTo(Board board, ArrayList<ArrayList<Integer>> moveData){
        //TODO implement isKingTo logic
        return true;
    }


    //~ isRookTo(Board board, ArrayList<ArrayList<Integer>> moveData: boolean
    protected boolean isRookFrom(Board board, ArrayList<ArrayList<Integer>> moveData){
        //TODO implement isRookFrom logic
        return true;
    }
    //            ~ canCastle(Board board, ArrayList<ArrayList<Integer>> moveData, int whichPlayer): boolean
    protected boolean canCastle(Board board, ArrayList<ArrayList<Integer>> moveData, int whichPlayer){
        //TODO implement canCastle logic
        return true;
    }
    //# drawFifty(): boolean
    boolean drawFifty(){
        //TODO implement drawFifty logic
        return true;
    }
    //# isCheck(Board board, Player[] player, int whichPlayer): boolean
    boolean isCheck(Board board, Player[] player, int whichPlayer){
        //TODO implement isCheck logic
        return true;
    }

    //# isCheckRemovable(Board board, Player[] player, int whichPlayer): boolean
    boolean isCheckRemovable(Board board, Player[] player, int whichPlayer){
        //TODO implement isCheckRemovable logic
        return true;
    }
    //# isKingStaleMate(Board board, Player[] player, int whichPLayer): boolean
    boolean isKingStaleMate(Board board, Player[] player, int whichPLayer){
        //TODO implement isKingStaleMate logic
        return true;
    }
    //# pieceNotLocked(Board board, int from, PLayer[] player, int whichPlayer): boolean
    boolean pieceNotLocked(Board board, int from, Player[] player, int whichPlayer){
        //TODO implement pieceNotLocked logic
        return true;
    }
    //# performMove(Board board, Player[] player, int from, int to): Object[]
    Object[] performMove(Board board, Player[] player, int from, int to){
        //TODO implement performMove logic
        return new Object[1];
    }
    //# performMove(Board board, Player[] player, ArrayList<ArrayList<Integer>> moveData): Object[]
    Object[] performMove(Board board, Player[] player, ArrayList<ArrayList<Integer>> moveData){
        //TODO implement performMove logic
        return new Object[1];
    }
    //# performCastling(Board board, Player[] player, ArrayList<ArrayList<Integer>> moveData): Object[]
    Object[] performCastling(Board board, Player[] player, ArrayList<ArrayList<Integer>> moveData){
        //TODO implement performCastling logic
        return new Object[1];
    }
    //+getCountRep(): int
    public int getCountRep(){
        //TODO implement getCountRep logic
        return 1;
    }

    //+setCountRep(int aCountRep): void
    public void setCountRep(int aCountRep){
        //TODO implement setCountRep logic
    }

    //+getPieceCheckCoord(): int[]
    public int[] getPieceCheckCoord(){
        //TODO implement getPieceCheckCoord logic
        return new int[1];
    }
    //+setPieceCheckCoord(int[] aPieceCheckCoord): void
    void setPieceCheckCoord(int[] aPieceCheckCoord){
        //TODO implement setPieceCheckCoord logic
    }

    @Override
    public ArrayList<Integer> splitCoordinatesString(String str) {
        return null;
    }

    @Override
    public int[] splitDataPair(ArrayList<Integer> data) {
        return new int[0];
    }

    @Override
    public char[] toCharCoordinate(int cr) {
        // Extract the file (column) and rank (row) values from the input int
        int file = cr / 10;
        int rank = cr % 10;

        // Check that the file and rank values are valid
        if (file < 1 || file > 8 || rank < 1 || rank > 8) {
            throw new IllegalArgumentException("Invalid input int. Must be in the range of 11 to 88.");
        }

        // Calculate the corresponding characters for file and rank
        char fileChar = (char) ('a' + file - 1);
        char rankChar = (char) ('1' + rank - 1);

        // Create and return the char[] with file and rank characters
        return new char[] {fileChar, rankChar};
    }

    @Override
    public int[] toIntCoordinate(String cr) {
        // Convert the input String to lowercase to ensure case-insensitive comparison
        cr = cr.toLowerCase();

        // Check that the input String has exactly 2 characters
        if (cr.length() != 2) {
            throw new IllegalArgumentException("Input String must have exactly 2 characters");
        }

        // Extract the file (column) and rank (row) characters from the input String
        char fileChar = cr.charAt(0);
        char rankChar = cr.charAt(1);

        // Check that the file and rank characters are valid
        if (fileChar < 'a' || fileChar > 'h' || rankChar < '1' || rankChar > '8') {
            throw new IllegalArgumentException("Invalid input String. Must be in the format 'fileRank', e.g., 'e4'");
        }

        // Calculate the corresponding numerical values for file and rank
        int file = fileChar - 'a' + 1;
        int rank = rankChar - '1' + 1;

        // Create and return the int[] with file and rank values
        return new int[] {file, rank};
    }

    @Override
    public ArrayList<Integer> reverseCoordinate(ArrayList<Integer> coord) {
        return null;
    }

    @Override
    public Object deepCopy(Object odlObj) {
        return null;
    }
}
