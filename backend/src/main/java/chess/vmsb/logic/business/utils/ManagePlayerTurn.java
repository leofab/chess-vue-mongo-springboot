package chess.vmsb.logic.business.utils;

public class ManagePlayerTurn {
  private int turn;
  public void changeTurn(){
    if(turn==1)turn=0;//switch turn
    else turn=1;
  }
  public int getTurn(){
    return turn;
  }
  public void setTurn(int turn){
    this.turn = turn;
  }


}
