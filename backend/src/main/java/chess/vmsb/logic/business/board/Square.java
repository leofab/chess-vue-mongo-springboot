package chess.vmsb.logic.business.board;

import chess.vmsb.logic.business.models.Piece;

public class Square {
    private int row;
    private int col;
    private char value;
    private Piece piece;

    public Square(int row, int col, char value) {
        this.row = row;
        this.col = col;
        this.value = value;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    @Override
    public String toString() {
        return "Square{" +
                "row=" + row +
                ", col=" + col +
                '}';
    }
}
