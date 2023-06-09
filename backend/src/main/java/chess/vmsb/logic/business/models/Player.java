package chess.vmsb.logic.business.models;

import chess.vmsb.logic.business.utils.Functional;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Player implements Serializable {
  private String name;
  private boolean color;
  private ArrayList<Piece> pieces = new ArrayList<>();
  private ArrayList<Piece> cemetery = new ArrayList<>();
  private ArrayList<String> history = new ArrayList<>();

  public Player(String name, boolean color){
    this.name = name;
    this.color = color;
    createPieces();
  }

  private void createPieces(){
    pieces = new ArrayList<>();

    String values;
    if(color){
      values="prnbkq";
    }else{
      values="PRNBKQ";
    }
    //create pieces
    for (int i = 0; i < 8; i++) pieces.add(new Pawn(values.charAt(0)));
    for (int i = 0; i < 2; i++) pieces.add(new Rook(values.charAt(1)));
    for (int i = 0; i < 2; i++) pieces.add(new Knight(values.charAt(2)));
    for (int i = 0; i < 2; i++) pieces.add(new Bishop(values.charAt(3)));

    pieces.add(new Queen(values.charAt(5)));
    pieces.add(new King(values.charAt(4)));
  }

  public void addToHistory(int[] from, int[] to, Piece pieceFrom, Piece pieceTo, Piece promotionPiece){
    String toAdd= new String();
    if(pieceFrom.getPieceSign()!='p' && pieceFrom.getPieceSign()!='P')
      toAdd+=Character.toUpperCase(pieceFrom.getPieceSign());

    toAdd+= Functional.toCharCoordinate(from[1]);
    toAdd+=Integer.toString(8-from[0]);

    if(pieceTo==null)toAdd+="-";
    else toAdd+="x";

    toAdd+=Functional.toCharCoordinate(to[1]);
    toAdd+=Integer.toString(8-to[0]);

    if(promotionPiece!=null){
      toAdd+="=" + Character.toUpperCase(promotionPiece.getPieceSign());
    }
    history.add(toAdd);

  }

  public void addToHistory(String str){
    history.add(str);
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

  public void addPieceCemetery(Piece cPiece){
    this.cemetery.add(cPiece);
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
  }

