package chess.vmsb.logic.business;

import chess.vmsb.logic.business.board.Board;
import chess.vmsb.logic.business.models.Player;
import chess.vmsb.logic.business.utils.ManagePlayerTurn;
import chess.vmsb.logic.business.utils.MovementHandler;
import chess.vmsb.logic.business.utils.UserInterface;
import org.apache.catalina.User;

import java.util.ArrayList;

public class Chess {

  public static void main(String[] args) {
    UserInterface.welcome();
    startGame();
  }

  public static void startGame(){
    boolean flag=true;
    do{
      ManagePlayerTurn.setTurn((byte)0);
      int readValue= UserInterface.readMenu();
      switch (readValue) {
        case 1:
          gameLoop();
          break;
        case 2:
          flag=false;
          break;
        default:
          UserInterface.onError();
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
      int opt=UserInterface.movementOptions();
      if(opt==1){
        while(true){
          ArrayList<ArrayList<Integer>> moveData = UserInterface.inputMove();
          if(MovementHandler.isValidMove(board, moveData , ManagePlayerTurn.getTurn())){//
            Object boardPlayer[]=MovementHandler.performMove(board, player,moveData);
            board=(Board) boardPlayer[0];//note: casting is required, return type is object, need to be board
            player=(Player[]) boardPlayer[1];
            ManagePlayerTurn.changeTurn();
            break;
            // missing if it is check, checkmate conditions, PUT IT LATER
        }else if(MovementHandler.canCastle(board, moveData, ManagePlayerTurn.getTurn()) && !MovementHandler.isCheck()){
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
        UserInterface.onError();
      }
    }while (flag);
  }
}
