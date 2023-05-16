package chess.vmsb.logic.business.utils;

public class ManagePlayerTurn {
  private static int turn=0;
  public static void changeTurn(){
    if(turn==1)turn=0;//switch turn
    else turn=1;
  }
  public static int getTurn(){
    return turn;
  }
  public static void setTurn(int turn){turn = turn;
  }

}
