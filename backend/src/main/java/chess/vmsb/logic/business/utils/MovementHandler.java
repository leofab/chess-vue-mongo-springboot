package chess.vmsb.logic.business.utils;

import chess.vmsb.logic.business.board.Board;
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

  static boolean isKingFrom(Board board,ArrayList<ArrayList<Integer>> moveData) {
    int from[]=Functional.splitDataPair(moveData.get(0));//row,col
    return (board.getGameBoard()[from[0]][from[1]].getPiece().getClass().toString().equals("class data.King"));
  }

  static boolean isRookTo(Board board,ArrayList<ArrayList<Integer>> moveData) {
    int to[]=Functional.splitDataPair(moveData.get(1));//row,col
    return (board.getGameBoard()[to[0]][to[1]].getPiece().getClass().toString().equals("class data.Rook"));
  }

  public static boolean canCastle(Board board, ArrayList<ArrayList<Integer>> moveData, byte turn) {
    int from[]=Functional.splitDataPair(moveData.get(0));//row,col
    int to[]=Functional.splitDataPair(moveData.get(1));//row,col

    if(!(MovementHandler.isKingFrom(board,moveData) && MovementHandler.isRookTo(board,moveData))){
      return false;
    }

    Piece king =board.getGameBoard()[from[0]][from[1]].getPiece();
    Piece rook =board.getGameBoard()[to[0]][from[0]].getPiece();

    if(king.isMoved() || rook.isMoved())return false;

    int op=(from[1]>to[1])?-1:1;
    for(int i=0;i!=to[i];from[i]+=op){
      if(board.getGameBoard()[from[0]][i].getPiece()!=null)return false;
    }

    return true;
  }

  public static boolean isCheck(){
    //TODO
    return false;
  }

  protected static boolean isCheckMate(){
    //TODO
    return false;
  }

  public static Object[] performCastling(Board board, Player[] player, ArrayList<ArrayList<Integer>> moveData) {
    //need to return object and players
    int from[]=Functional.splitDataPair(moveData.get(0));//row,col
    int to[]=Functional.splitDataPair(moveData.get(1));//row,col

    Piece king = board.getGameBoard()[from[0]][from[1]].getPiece();
    Piece rook = board.getGameBoard()[to[0]][to[1]].getPiece();
    int who=(Character.isLowerCase(king.getPieceSign()))?0:1;

    board.getGameBoard()[from[0]][from[1]].setPiece(null);//clear unused pieces
    board.getGameBoard()[to[0]][to[1]].setPiece(null);

    king.setMoved(true);
    rook.setMoved(true);

    if(Math.abs(from[1]-to[1])==3){
      //short castling
      board.getGameBoard()[from[0]][6].setPiece(king);
      board.getGameBoard()[to[0]][5].setPiece(rook);
      player[who].addToHistory("0-0");
    }else{
      //long castling
      board.getGameBoard()[from[0]][2].setPiece(king);
      board.getGameBoard()[to[0]][3].setPiece(rook);
      player[who].addToHistory("0-0-0");
    }

    Object dataReturn[]= {board,player};

    return dataReturn;
  }

  public static Object[] performMove(Board board, Player[] player, ArrayList<ArrayList<Integer>> moveData) {
    //need to return object and players

    int from[]=Functional.splitDataPair(moveData.get(0));//row,col
    int to[]=Functional.splitDataPair(moveData.get(1));//row,col


    if(board.getGameBoard()[to[0]][to[1]].getPiece()!=null){// to add piece to cemetery
      Piece toDelete=board.getGameBoard()[to[0]][to[1]].getPiece();
      toDelete.setMoved(false);//in order to reboot it to initial state and perform .remove later
      if(Character.isLowerCase(toDelete.getPieceSign())){
        player[0].addPieceCemetery(toDelete);
        player[0].getPieces().remove(toDelete);// only removes first occurrence of the piece
      }else{
        player[1].addPieceCemetery(toDelete);
        player[1].getPieces().remove(toDelete);// only removes first occurrence of the piece
      }
    }

    Piece toSet=board.getGameBoard()[from[0]][from[1]].getPiece();
    Piece originalPiece=toSet;

    //PawnPromotion
    char cmp=toSet.getPieceSign();
    int pos=(cmp=='p')?0:(cmp=='P')?7:-1;
    int who=(Character.isLowerCase(cmp))?0:1;

    if ((cmp=='p' || cmp=='P') && pos==to[0]){
      toSet.setMoved(false);
      player[who].getPieces().remove(toSet);

      toSet=UserInterface.askPromotioPiece((cmp=='p')?true:false);
      player[who].getPieces().add(toSet);

      player[who].addToHistory(from, to, board.getGameBoard()[from[0]][from[1]].getPiece(),
          board.getGameBoard()[to[0]][to[1]].getPiece(), toSet);
    }else{
      // in case there is no promotion
      player[who].addToHistory(from, to, board.getGameBoard()[from[0]][from[1]].getPiece(),
          board.getGameBoard()[to[0]][to[1]].getPiece(), null);
    }


    toSet.setMoved(true);
    board.getGameBoard()[to[0]][to[1]].setPiece(toSet);//moves piece
    board.getGameBoard()[from[0]][from[1]].setPiece(null);//clears square from
    Object dataReturn[]= {board,player};

    return dataReturn;
  }

  public static boolean isValidMove(Board board, ArrayList<ArrayList<Integer>> moveData,int whichPlayer){
    int from[]=Functional.splitDataPair(moveData.get(0));//row,col
    int to[]=Functional.splitDataPair(moveData.get(1));//row,col

    if(board.getGameBoard()[from[0]][from[1]].getPiece()==null){

      return false;
    }else{
      Piece piece=board.getGameBoard()[from[0]][from[1]].getPiece();
      if(Character.isLowerCase(piece.getPieceSign()) && whichPlayer==0){
        return piece.pieceCheck(board,from,to);
      }
      if(Character.isUpperCase(piece.getPieceSign()) && whichPlayer==1){


        return piece.pieceCheck(board,from,to);
      }
    }
    return false;
  }
}

