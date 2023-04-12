package vmsb.chess.logic.business;

import vmsb.chess.logic.business.utils.Functional;

import java.util.ArrayList;
import java.util.Objects;

public class Player implements Functional{
    private String name;
    private boolean color;
    private ArrayList<Piece> pieces;
    private ArrayList<Piece> cemetery;
    private ArrayList<String> history;

    public Player(String name, boolean color){
        this.name = name;
        this.color = color;
    }

    private void createPieces(){
        //TODO create logic of createPieces
    }

    public void addToHistory(int from, int to, Piece pieceFrom, Piece pieceTo, Piece promotionPiece){
        //TODO create logic of addToHistory
    }

    public void addToHistory(String str){
        //TODO create logic of addToHistory
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }

    public ArrayList<Piece> getPieces() {
        return pieces;
    }

    public void setPieces(ArrayList<Piece> pieces) {
        this.pieces = pieces;
    }

    public ArrayList<Piece> getCemetery() {
        return cemetery;
    }

    public void setCemetery(ArrayList<Piece> cemetery) {
        this.cemetery = cemetery;
    }

    public ArrayList<String> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<String> history) {
        this.history = history;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return color == player.color && name.equals(player.name) && pieces.equals(player.pieces) && cemetery.equals(player.cemetery) && history.equals(player.history);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, pieces, cemetery, history);
    }

        @Override
        public ArrayList<Integer> splitCoordinatesString(String str) {
            return null;
        }

        @Override
        public int[] splitDataPair(ArrayList<Integer> data) {
            return new int[0];
        }

        @Override
        public char toCharCoordinate(int cr) {
            return 0;
        }

        @Override
        public ArrayList<Integer> reverseCoordinate(ArrayList<Integer> coord) {
            return null;
        }

        @Override
        public Object deepCopy(Object odlObj) {
            return null;
        }

}

