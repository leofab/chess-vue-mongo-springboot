package chess.vmsb.logic.business.board;

import chess.vmsb.logic.business.models.Player;

public class Board {
    private Player playerW;
    private Player playerB;
    private Square[][] gameBoard;

    private Board(){
        super();
    }

    public Board (Player playerW, Player playerB){
        this.gameBoard = new Square[8][8];
        this.playerW = playerW;
        this.playerB = playerB;
    }

    public Board(Board b){

        this.gameBoard = b.gameBoard;

    }

    public Square[][] getGameBoard() {
        return gameBoard;
    }

    public void setGameBoard(Square[][] gameBoard) {
        this.gameBoard = gameBoard;
    }

    @Override
    public String toString() {
        String nameW = playerW.getName();
        String nameB = playerB.getName();
        for(int i = 0; i < gameBoard.length; i++){
            for(int j = 0; j < gameBoard[i].length; j++){

              System.out.print("- ");
            }
            System.out.println();
        }
        return "\nPlayer White: " + nameW + "\nPlayer Black: " + nameB + "\nChessBoard v1.0 ";
    }
}
