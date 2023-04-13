package chess.vmsb.logic.business;

import chess.vmsb.logic.business.utils.ManagePlayerTurn;
import chess.vmsb.logic.business.utils.UserInterface;

public class Chess extends ManagePlayerTurn {
    public UserInterface userUI;

    public static void main(String[] args) {

        Player playerW = new Player("joao",true);
        Player playerB = new Player("Maria",false);

        Board board = new Board(playerW,playerB);

    }

    public void setUserUI(UserInterface userUI) {
        this.userUI = userUI;
    }
    public void startGame(){

    }
    private void gameLoop(int sel){

    }
}
