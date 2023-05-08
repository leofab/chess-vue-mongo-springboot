package chess.vmsb.logic.business.utils;

public class ManagePlayerTurn {
  private static byte turn;
  public static void changeTurn(){
    if(turn==1)turn=0;//switch turn
    else turn=1;
  }
  public static byte getTurn(){
    return turn;
  }
  public static void setTurn(byte turn){turn = turn;
  }


}
