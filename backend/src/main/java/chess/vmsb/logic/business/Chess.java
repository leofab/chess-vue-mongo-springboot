package chess.vmsb.logic.business;

import chess.vmsb.logic.business.board.Board;
import chess.vmsb.logic.business.models.Player;
import chess.vmsb.logic.business.utils.ManagePlayerTurn;
import chess.vmsb.logic.business.utils.MovementHandler;
import chess.vmsb.logic.business.utils.UserInterface;

import java.util.ArrayList;

public class Chess {
  public static UserInterface ui;
  public static void main(String[] args) {
    UserInterface.welcome();
    startGame();
  }

  public static void startGame(){
    boolean flag=true;
    do{
      ManagePlayerTurn.setTurn(0);
      int readValue= UserInterface.readMenu();
      switch (readValue) {
        case 1:
          gameLoop();
          break;
        case 2://exit
          flag=false;
          break;
        default:
          UserInterface.onError(0);
          break;
      }
    }while(flag);
  }
  private static void gameLoop(){
    Player player[]= new Player[2];
    player[0]=new Player(UserInterface.readName("Branco"), true);
    player[1]= new Player(UserInterface.readName("Preto"), false);
    Board board = new Board(player[0], player[1]);

    boolean flag=true;

    do{
      UserInterface.printBoard(board);
      UserInterface.printCemetery(player[0],player[1]);
      UserInterface.whosePlayer(player[ManagePlayerTurn.getTurn()]);

      //on Check
      if(MovementHandler.isCheck(board,player,ManagePlayerTurn.getTurn())){
        if(!MovementHandler.isCheckRemovable(board,player,ManagePlayerTurn.getTurn())){
          UserInterface.checkMate(player,ManagePlayerTurn.getTurn());
          break;
        }
        UserInterface.onCheck(player,ManagePlayerTurn.getTurn());
      }
      //onDraw
      if(MovementHandler.drawFifty()){
        UserInterface.messageDrawFifty(player);
        break;
      }
      //saltemate draw
      if(MovementHandler.isKingStalemate(board, player, ManagePlayerTurn.getTurn())){
        UserInterface.messageStalemate();
        break;
      }

      int opt=UserInterface.movementOptions();
      if(opt==1){
        while(true){
          ArrayList<ArrayList<Integer>> moveData = UserInterface.inputMove();
          if(MovementHandler.isValidMove(board, moveData , ManagePlayerTurn.getTurn())){//
            Object boardPlayer[]=MovementHandler.performMove(board, player,moveData);
            if(MovementHandler.isCheck((Board) boardPlayer[0],(Player[]) boardPlayer[1],ManagePlayerTurn.getTurn())){//in case the move put the king in check
              UserInterface.onInvalidMoveCheck(player,ManagePlayerTurn.getTurn());
              break;
            }
            //if king is not in check, then we proceed to assign the genrated board to the current board.
            MovementHandler.setPieceCheckCoord(new int[]{-1,-1});
            board=(Board) boardPlayer[0];//note: casting is required, return type is object, need to be board
            player=(Player[]) boardPlayer[1];
            ManagePlayerTurn.changeTurn();
            break;
        }else if(MovementHandler.canCastle(board, moveData, ManagePlayerTurn.getTurn()) && !MovementHandler.isCheck(board,player,ManagePlayerTurn.getTurn())){
            Object boardPlayer[]=MovementHandler.performCastling(board, player,moveData);
            board=(Board) boardPlayer[0];//note: casting is required, return type is object, need to be board
            player=(Player[]) boardPlayer[1];
            ManagePlayerTurn.changeTurn();
            break;
          }else{
            UserInterface.onInvalidMove();
          }
        }
      }else if (opt==2){
        UserInterface.showPlayHist(player);
      }else if(opt==3){
        UserInterface.onQuitGame(player[ManagePlayerTurn.getTurn()]);// if player quit, another player wins
        UserInterface.onWinMessage(player[(ManagePlayerTurn.getTurn()+1)%2]); // the other player wins
      }else{
        UserInterface.onError(0);
      }
    }while (flag);
  }
}
