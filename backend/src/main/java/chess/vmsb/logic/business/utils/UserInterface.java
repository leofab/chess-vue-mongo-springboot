package chess.vmsb.logic.business.utils;
import chess.vmsb.logic.business.board.Board;
import chess.vmsb.logic.business.models.Piece;
import chess.vmsb.logic.business.models.Player;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface extends MovementHandler{

//    + onWinMessage(Player player) : void
    public void onWinMessage(Player player){

    }

//+ onTieMessage(Player]] player) : void
    public void onTieMessage(Player[] player){
    //TODO
    }
//+ messageStalemate() : void
    public void messageStalemate(){
    //TODO
    }
//+ onlnvalidMoveCheck(Player[] player, int turn) : void
    public void onlnvalidMoveCheck(Player[] player, int turn){
    //TODO
    }
//+ onCheck(Player[] player, int turn) : void
    public void onCheck(Player[] player, int turn){
    //TODO
    }
//
//+ checkMate(Player[] player, int turn) : void
    public void checkMate(Player[] player, int turn){
    //TODO
    }
//
//+ onQuitGame(Player player) : void
    public void onQuitGame(Player player){
    //TODO
    }
//
//+ onError(int msg) : void
    public void onError(int msg){
    //TODO
    }
//
//+ messageDrawFifty(Player[] player) : void
    public void messageDrawFifty(Player[] player){
    //TODO
    }
//
//+ messageDrawKing(Player(] player) : void
    public void messageDrawKing(Player[] player){
    //TODO
    }
//
//+ printBoard(Board board) : void
    public void printBoard(Board board){
    //TODO
    }
//
//+ readName(String col) : String
    public String readName(String col){
    //TODO
    return "";
    }
//
//+ welcome) : void
    public void welcome(){
    //TODO
    }
//
//+menu() : int
    public int menu(){
    //TODO
    return 0;
    }
//
//+ printCemetery(Player w, Player b) : void
    public void printCemetery(Player w, Player b){
    //TODO
    }
//
//+ whosePlayer(Player player) : void
    public void whosePlayer(Player player){
    //TODO
    }
//
//+ coordinateRead() : String
    public String coordinateRead(){
    //TODO
    return "";
    }
//
//+inputMove() : ArrayList<ArrayList<Integer>>
    public ArrayList<ArrayList<Integer>> inputMove(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coordinates of the piece you want to move: \n -> ");
        String coord = sc.nextLine();
        int[] from = toIntCoordinate(coord);
        System.out.println("Enter the coordinates of the square you want to move to: \n -> ");
        coord = sc.nextLine();
        int[] to = toIntCoordinate(coord);
        ArrayList<ArrayList<Integer>> move = new ArrayList<>();
            ArrayList<Integer> innerList = new ArrayList<>();
            innerList.add(from[0]);
            innerList.add(from[1]);
            move.add(innerList);
            innerList = new ArrayList<>();
            innerList.add(to[0]);
            innerList.add(to[1]);
            move.add(innerList);
        System.out.println(move);
    return move;
    }
//+ askPromotioPiece(boolean color) : Piece
    public Piece askPromotioPiece(boolean color){
    //TODO
    return null;
    }
//
//+ movementOptions() : int
    public int movementOptions(){
    //TODO
    return 0;
    }
//
//+ showPlayHist(Player[] player) : void
    public void showPlayHist(Player[] player){
    //TODO
    }
//
//+ overWriteMessage(String fileName) : boolean
    public boolean overWriteMessage(String fileName){
    //TODO
    return false;
    }
//+ readPlayers() : Player[]
    public Player[] readPlayers(){
    //TODO
    return null;
    }
//
//+ createBoardinterface() : void
    public void createBoardinterface(){
    //TODO
    }

}
