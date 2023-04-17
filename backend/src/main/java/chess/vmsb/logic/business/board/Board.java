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

    public Square[][] initComponent(Player playerW, Player playerB){
        ArrayList<Piece> piecesW = new ArrayList<>();
        ArrayList<Piece> piecesB = new ArrayList<>();
        //Set up the board
        for (int i = gameBoard.length-1; i >=0; i--) {
            for (int j = gameBoard.length-1; j >= 0; j--) {
                if (i == 2 || i == 3 || i == 4 || i == 5) {
                    gameBoard[i][j] = new Square(i,j);
                    gameBoard[i][j].setValue('-');
                } else if (i == 1 || i == 6) {
                    gameBoard[i][j] = new Square(i,j);
                    if(i == 1){
                        gameBoard[i][j].setValue('p');
                        Pawn pawn = new Pawn(true);
                        pawn.setPieceSign(gameBoard[i][j].getValue());
                        pawn.setDx(i);
                        pawn.setDy(j);
                        gameBoard[i][j].setPiece(pawn);
                        piecesW.add(pawn);
                    }else{
                        Pawn pawn = new Pawn(false);
                        gameBoard[i][j].setValue('P');
                        pawn.setPieceSign(gameBoard[i][j].getValue());
                        pawn.setDx(i);
                        pawn.setDy(j);
                        gameBoard[i][j].setPiece(pawn);
                        piecesB.add(pawn);
                    }
                } else if ((i == 0 && (j == 0 || j == 7)) || (i == 7 && (j == 0 || j == 7))) {
                    gameBoard[i][j] = new Square(i,j);
                    if((i == 0) ){
                        gameBoard[i][j].setValue('r');
                        Rook rook = new Rook(true);
                        rook.setPieceSign(gameBoard[i][j].getValue());
                        rook.setDx(i);
                        rook.setDy(j);
                        gameBoard[i][j].setPiece(rook);
                        piecesW.add(rook);
                    }else{
                        gameBoard[i][j].setValue('R');
                        Rook rook = new Rook(false);
                        rook.setPieceSign(gameBoard[i][j].getValue());
                        rook.setDx(i);
                        rook.setDy(j);
                        gameBoard[i][j].setPiece(rook);
                        piecesB.add(rook);
                    }
                } else if ((i == 0 && (j == 1 || j == 6)) || (i == 7 && (j == 1 || j == 6))) {
                    gameBoard[i][j] = new Square(i,j);
                    if((i == 0 ) ){
                        gameBoard[i][j].setValue('n');
                        Knight knight = new Knight(true);
                        knight.setPieceSign(gameBoard[i][j].getValue());
                        knight.setDx(i);
                        knight.setDy(j);
                        gameBoard[i][j].setPiece(knight);
                        piecesW.add(knight);
                    }else{
                        gameBoard[i][j].setValue('N');
                        Knight knight = new Knight(false);
                        knight.setPieceSign(gameBoard[i][j].getValue());
                        knight.setDx(i);
                        knight.setDy(j);
                        gameBoard[i][j].setPiece(knight);
                        piecesB.add(knight);
                    }
                } else if ((i == 0 && (j == 2 || j == 5)) || (i == 7 && (j == 2 || j == 5))) {
                    gameBoard[i][j] = new Square(i,j);
                    if((i == 0) ){
                        gameBoard[i][j].setValue('b');
                        Bishop bishop = new Bishop(true);
                        bishop.setPieceSign(gameBoard[i][j].getValue());
                        bishop.setDx(i);
                        bishop.setDy(j);
                        gameBoard[i][j].setPiece(bishop);
                        piecesW.add(bishop);
                    }else{
                        gameBoard[i][j].setValue('B');
                        Bishop bishop = new Bishop(false);
                        bishop.setPieceSign(gameBoard[i][j].getValue());
                        bishop.setDx(i);
                        bishop.setDy(j);
                        gameBoard[i][j].setPiece(bishop);
                        piecesB.add(bishop);
                    }
                } else if ((i == 0 && j == 4) || (i == 7 && j == 4)) {
                    gameBoard[i][j] = new Square(i,j);
                    if((i == 0) ){
                        gameBoard[i][j].setValue('k');
                        King king = new King(true);
                        king.setPieceSign(gameBoard[i][j].getValue());
                        king.setDx(i);
                        king.setDy(j);
                        gameBoard[i][j].setPiece(king);
                        piecesW.add(king);
                    }else{
                        gameBoard[i][j].setValue('K');
                        King king = new King(false);
                        king.setPieceSign(gameBoard[i][j].getValue());
                        king.setDx(i);
                        king.setDy(j);
                        gameBoard[i][j].setPiece(king);
                        piecesB.add(king);
                    }
                } else if ((i == 0 && j == 3) || (i == 7 && j == 3)) {
                    gameBoard[i][j] = new Square(i,j);
                    if((i == 0) ){
                        gameBoard[i][j].setValue('q');
                        Queen queen = new Queen(true);
                        queen.setPieceSign(gameBoard[i][j].getValue());
                        queen.setDx(i);
                        queen.setDy(j);
                        gameBoard[i][j].setPiece(queen);
                        piecesW.add(queen);
                    }else{
                        gameBoard[i][j].setValue('Q');
                        Queen queen = new Queen(false);
                        queen.setPieceSign(gameBoard[i][j].getValue());
                        queen.setDx(i);
                        queen.setDy(j);
                        gameBoard[i][j].setPiece(queen);
                        piecesB.add(queen);
                    }
                }
            }
        }

        //Set up the player pieces

        playerW.setPieces(piecesW);
        playerB.setPieces(piecesB);
        return gameBoard;
    }

    @Override
    public String toString() {
        for(int i = gameBoard.length-1; i >= 0; i--){
            for(int j = 0; j < gameBoard[i].length; j++){

              System.out.print(gameBoard[i][j].getValue() + " ");
            }
            System.out.println();
        }
        return "\nPlayer White: " + playerW.getName() +
                "\nPlayer Black: " + playerB.getName() +
                "\nChessBoard v1.0 ";
    }
}
