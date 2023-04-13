package chess.vmsb.logic.business;

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

    }public Board(Board b, Player playerW, Player playerB){

        this.gameBoard = b.gameBoard;
        this.playerW = playerW;
        this.playerB = playerB;

    }

    public Square[][] getGameBoard() {
        return gameBoard;
    }

    public void setGameBoard(Square[][] gameBoard) {
        this.gameBoard = gameBoard;
    }
}
