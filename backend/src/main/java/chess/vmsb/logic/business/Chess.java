package chess.vmsb.logic.business;

import chess.vmsb.logic.business.board.Board;
import chess.vmsb.logic.business.models.Player;
import chess.vmsb.logic.business.utils.MovementHandler;
import chess.vmsb.logic.business.utils.UserInterface;

import java.util.ArrayList;

public class Chess {
    public UserInterface userUI;

    public static void main(String[] args) {
    }

    public void setUserUI(UserInterface userUI) {
        this.userUI = userUI;
    }
    public static void startGame(){
        boolean flag=true;
        do{
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
        player[0]=new Player(UserInterface.readName("Blancas"), true);
        player[1]= new Player(UserInterface.readName("Negras"), false);

        boolean flag=true;
        int turn=0;

        do{
            Board board = new Board(player[0], player[1]);
            UserInterface.printBoard(board);
            UserInterface.printCemetery(player[0],player[1]);
            ArrayList<ArrayList<Integer>> moveData = UserInterface.inputMove(player[turn]);
        }while (flag);
    }
}
