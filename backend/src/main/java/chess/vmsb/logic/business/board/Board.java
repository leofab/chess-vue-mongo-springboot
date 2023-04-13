package chess.vmsb.logic.business.board;

import chess.vmsb.logic.business.models.*;

import java.util.ArrayList;

public class Board{
    private Player playerW;
    private Player playerB;
    private Square[][] gameBoard;

//    private Board(){
//        super();
//    }

    //Invoke Board with two players and set up the board with the pieces
    public Board (Player playerW, Player playerB){
        this.gameBoard = new Square[8][8];
        this.playerW = playerW;
        this.playerB = playerB;

        //Set up the board
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                if (i == 2 || i == 3 || i == 4 || i == 5) {
                    gameBoard[i][j] = new Square(i,j,'-');
                } else if (i == 1 || i == 6) {
                    gameBoard[i][j] = new Square(i,j,'P');
                    gameBoard[i][j].setPiece(new Pawn(gameBoard[i][j].getValue()));
                } else if ((i == 0 && (j == 0 || j == 7)) || (i == 7 && (j == 0 || j == 7))) {
                    gameBoard[i][j] = new Square(i,j,'R');
                    gameBoard[i][j].setPiece(new Rook(gameBoard[i][j].getValue()));
                } else if ((i == 0 && (j == 1 || j == 6)) || (i == 7 && (j == 1 || j == 6))) {
                    gameBoard[i][j] = new Square(i,j,'N');
                    gameBoard[i][j].setPiece(new Knight(gameBoard[i][j].getValue()));
                } else if ((i == 0 && (j == 2 || j == 5)) || (i == 7 && (j == 2 || j == 5))) {
                    gameBoard[i][j] = new Square(i,j,'B');
                    gameBoard[i][j].setPiece(new Bishop(gameBoard[i][j].getValue()));
                } else if ((i == 0 && j == 4) || (i == 7 && j == 4)) {
                    gameBoard[i][j] = new Square(i,j,'K');
                    gameBoard[i][j].setPiece(new King(gameBoard[i][j].getValue()));
                } else if ((i == 0 && j == 3) || (i == 7 && j == 3)) {
                    gameBoard[i][j] = new Square(i,j,'Q');
                    gameBoard[i][j].setPiece(new Queen(gameBoard[i][j].getValue()));
                }
            }
        }

        //Set up the player pieces

        ArrayList<Piece> piecesW = new ArrayList<>();
        ArrayList<Piece> piecesB = new ArrayList<>();
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                if (gameBoard[i][j].getValue() == 'P' && i == 1) {
                    piecesW.add(gameBoard[i][j].getPiece());
                } else if (gameBoard[i][j].getValue() == 'P' && i == 6) {
                    piecesB.add(gameBoard[i][j].getPiece());
                } else if (gameBoard[i][j].getValue() == 'R' && i == 0) {
                    piecesW.add(gameBoard[i][j].getPiece());
                } else if (gameBoard[i][j].getValue() == 'R' && i == 7) {
                    piecesB.add(gameBoard[i][j].getPiece());
                } else if (gameBoard[i][j].getValue() == 'N' && i == 0) {
                    piecesW.add(gameBoard[i][j].getPiece());
                } else if (gameBoard[i][j].getValue() == 'N' && i == 7) {
                    piecesB.add(gameBoard[i][j].getPiece());
                } else if (gameBoard[i][j].getValue() == 'B' && i == 0) {
                    piecesW.add(gameBoard[i][j].getPiece());
                } else if (gameBoard[i][j].getValue() == 'B' && i == 7) {
                    piecesB.add(gameBoard[i][j].getPiece());
                } else if (gameBoard[i][j].getValue() == 'K' && i == 0) {
                    piecesW.add(gameBoard[i][j].getPiece());
                } else if (gameBoard[i][j].getValue() == 'K' && i == 7) {
                    piecesB.add(gameBoard[i][j].getPiece());
                } else if (gameBoard[i][j].getValue() == 'Q' && i == 0) {
                    piecesW.add(gameBoard[i][j].getPiece());
                } else if (gameBoard[i][j].getValue() == 'Q' && i == 7) {
                    piecesB.add(gameBoard[i][j].getPiece());
                }
            }
        }
        playerW.setPieces(piecesW);
        playerB.setPieces(piecesB);
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
        return "\nPlayer White: " + playerW.getName() +
                "\nWhite Pieces : " + playerW.getPieces() +
                "\nPlayer Black: " + playerB.getName() +
                "\nChessBoard v1.0 ";
    }
}
