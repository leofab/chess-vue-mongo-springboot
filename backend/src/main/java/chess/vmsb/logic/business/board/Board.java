package chess.vmsb.logic.business.board;

import chess.vmsb.logic.business.models.Player;

public class Board{
    private Player playerW;
    private Player playerB;
    private Square[][] gameBoard;

//    private Board(){
//        super();
//    }

    public Board (Player playerW, Player playerB){
        this.gameBoard = new Square[8][8];
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                gameBoard[2][j] = new Square(2,j,'-');
                gameBoard[3][j] = new Square(3,j,'-');
                gameBoard[4][j] = new Square(4,j,'-');
                gameBoard[5][j] = new Square(5,j,'-');
                gameBoard[1][j] = new Square(1,j,'P');
                gameBoard[6][j] = new Square(6,j,'P');
                gameBoard[7][7] = new Square(6,j,'R');
                gameBoard[7][0] = new Square(6,j,'R');
                gameBoard[0][7] = new Square(6,j,'R');
                gameBoard[0][0] = new Square(6,j,'R');
                gameBoard[7][6] = new Square(6,j,'N');
                gameBoard[7][1] = new Square(6,j,'N');
                gameBoard[0][6] = new Square(6,j,'N');
                gameBoard[0][1] = new Square(6,j,'N');
                gameBoard[7][5] = new Square(6,j,'B');
                gameBoard[7][2] = new Square(6,j,'B');
                gameBoard[0][5] = new Square(6,j,'B');
                gameBoard[0][2] = new Square(6,j,'B');
                gameBoard[7][4] = new Square(6,j,'K');
                gameBoard[7][3] = new Square(6,j,'Q');
                gameBoard[0][4] = new Square(6,j,'K');
                gameBoard[0][3] = new Square(6,j,'Q');
            }
        }
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
        for(int i = 0; i < gameBoard.length; i++){
            for(int j = 0; j < gameBoard[i].length; j++){

              System.out.print(gameBoard[i][j].getValue() + " ");
            }
            System.out.println();
        }
        return "\nPlayer White: " + playerW.getName() + "\nPlayer Black: " + playerB.getName() + "\nChessBoard v1.0 ";
    }
}
