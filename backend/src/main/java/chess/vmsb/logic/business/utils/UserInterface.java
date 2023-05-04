package chess.vmsb.logic.business.utils;
import chess.vmsb.logic.business.board.Board;
import chess.vmsb.logic.business.board.Square;
import chess.vmsb.logic.business.models.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class UserInterface {
  private static String divisor = "-------------------";
  private static Scanner sc = new Scanner(System.in);

  public static void onWinMessage(Player player){
    System.out.println(divisor);
    System.out.println("\tJogador " + player.getName() + " ganhou!!");
    System.out.println(divisor);
  }

  public static void onTieMessage(Player[] player){
    System.out.println(divisor);
    System.out.println("\tEmpate");
    System.out.println(divisor);
  }

  public static void onQuitGame(Player player) {
    System.out.println(divisor);
    System.out.println(player.getName() + "abandonou a partida");
    System.out.println(divisor);
  }

  public static void onError(){
    System.out.println(divisor);
    System.out.println("Erro de entrada, use valores entre 1 e 3");
    System.out.println(divisor);
  }

  private static void onDuplicateCoordinate(){
    System.out.println(divisor);
    System.out.println("\tErro!!, Coordenadas iguais, digite novamente");
    System.out.println(divisor);
  }

  public static void onInvalidMove() {
    System.out.println(divisor);
    System.out.println("\tErro!!, Coordenadas inválida, digite novamente");
    System.out.println(divisor);
  }

  public static void printBoard(Board board){
    System.out.println(divisor);
    System.out.println(board.stringBoard());
  }

  public static String readName(String col){
    System.out.println(divisor);
    System.out.println("Nome do Jogador "+ col);
    return sc.next();
  }

  public static void welcome() {
    System.out.println(divisor);
    System.out.println("Bem vindo ao Jogo");
  }

  public static int readMenu() {
    System.out.println(divisor);
    System.out.println("Selecione uma opção");
    System.out.println("1. Iniciar jogo");
    System.out.println("2. Sair");
    return sc.nextInt();
  }

  public static void printCemetery(Player w, Player b) {
    System.out.println(divisor);
    System.out.println("Cemitério: " );
    System.out.println("Brancas->" );
    for (int i=0;i<w.getCemetery().size();i++) {
      System.out.print(w.getCemetery().get(i).getPieceSign());
    }
    System.out.println("Pretas->" );
    for (int i=0;i<b.getCemetery().size();i++) {
      System.out.print(b.getCemetery().get(i).getPieceSign());
    }
    System.out.println(divisor);
  }

  //
//+inputMove() : ArrayList<ArrayList<Integer>>
  private static String coordinateRead(){
    String moveText=new String();
    boolean flag=true;
    do{
      moveText= sc.next();
      if(moveText.charAt(0)>='a' && moveText.charAt(0)<='h' && moveText.charAt(1)>='1' && moveText.charAt(1)<='8'){
        flag=false;
      }else{
        onError();
      }
    }while(flag);
    return moveText;
  }

  public static ArrayList<ArrayList<Integer>> inputMove(Player player) {
    String playerColor= (player.isColor())?"White":"Black";
    boolean flag=true;
    ArrayList<ArrayList<Integer>> moveCoordinates= new ArrayList<>();

    do{
      System.out.println(divisor);
      System.out.println("Turno de " + player.getName() + " - " + playerColor);
      System.out.println("Coloque as cordenadas de origem no formato rankFile : exemplo e2 e4");
      moveCoordinates.add(Functional.splitCoordinatesString(coordinateRead()));
      System.out.println("Coloque as coordenadas de destino:");
      moveCoordinates.add(Functional.splitCoordinatesString(coordinateRead()));

      if(moveCoordinates.get(0).equals(moveCoordinates.get(1))){//to avoid same coordinates input
        onDuplicateCoordinate();
        moveCoordinates.clear();
      }else{
        flag=false;
      }
    }while(flag);

    return moveCoordinates;
  }

  public static Piece askPromotioPiece(boolean color) {
    Piece returnPiece;
    //create pieces to return
    ArrayList<Piece> values=new ArrayList<>(Arrays.asList(new Queen(color),
        new Knight(color),new Rook(color),new Bishop(color)));

    System.out.println("Qual peça promover? :");
    System.out.println("1. Queen");
    System.out.println("2. Knight");
    System.out.println("3. Rook");
    System.out.println("4. Bishop");

    while(true){
      int opt=sc.nextInt();
      if(opt>=1 && opt<=4){
        returnPiece= values.get(opt-1);
        break;
      }else{
        onError();
      }
    }
    return returnPiece;
  }

  public static int movementOptions() {
    int dataRead;

    System.out.println(divisor);
    System.out.println("Selecione uma opção");
    System.out.println("1. Fazer jogada");
    System.out.println("2. Ver histórico de jogadas");
    System.out.println("3. Sair");
    while(true){
      dataRead=sc.nextInt();
      if(dataRead>=1 && dataRead<=3){
        break;
      }else{
        onError();
      }
    }
    return dataRead;
  }

  public static void showPlayHist(Player[] player) {
    int it=0;
    System.out.println(divisor);
    System.out.println("Histórico de jogadas:");
    System.out.println("   Brancas \tPretas");
    while (true){
      System.out.print(it+". ");
      if(it<player[0].getHistory().size())System.out.print(player[0].getHistory().get(it)+"\t");
      else System.out.print("        "+"\t");

      if(it<player[1].getHistory().size())System.out.print(player[1].getHistory().get(it));
      else System.out.print("        ");
      System.out.println("");
      if(it>=player[0].getHistory().size() && it>=player[0].getHistory().size()){
        break;
      }
      it++;
    }
  }

  public static void castleFail() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }


}
