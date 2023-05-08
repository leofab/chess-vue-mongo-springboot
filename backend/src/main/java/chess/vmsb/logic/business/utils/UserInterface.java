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

  public static void messageStalemate(){
    System.out.println(divisor);
    System.out.println("\tEmpate por afogamento");
    System.out.println(divisor);
  }

  public static void onInvalidMoveCheck(Player[] player, int turn){
    System.out.println(divisor);
    System.out.println("\tJogador " + player[turn].getName() + " está em xeque, movimento inválido");
    System.out.println(divisor);
  }

  public static void onCheck(Player[] player, int turn){
    System.out.println(divisor);
    System.out.println("\tJogador " + player[turn].getName() + " está em xeque");
    System.out.println(divisor);
  }

  public static void checkMate(Player[] player, int turn){
    System.out.println(divisor);
    System.out.println("\tJogador " + player[turn].getName() + " perdeu");
    System.out.println(divisor);
  }


  public static void onQuitGame(Player player) {
    System.out.println(divisor);
    System.out.println(player.getName() + "abandonou a partida");
    System.out.println(divisor);
  }

  public static String messages[]= new String[]{"Opção inválida","Não há peça na posição selecionada"
      ,"Digite valor numérico","Digite uma coordenada válida com letra e número"
      ,"Coordenadas erradas ou fora do limite","Movimento inválido"
      ,"Coordenadas iguais","Movimento inválido"};

  public static void onError(int msg){
    System.out.println(divisor);
    System.out.println("\tError!!");

    if(msg<0 || msg>=messages.length){
      System.out.println("\tMensagem não encontrada");
    }else{
      System.out.println("\t"+messages[msg]);
    }
    System.out.println("\t Digite novamente");
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

  public static void messageDrawFifty(Player[] player){
    System.out.println(divisor);
    System.out.println("\tEmpate, ambos jogadores ficaram 50 jogadas sem captura ou movimento de peão");
    System.out.println(divisor);
  }

  public static void messageDrawKing(Player[] player){
    System.out.println(divisor);
    System.out.println("\tEmpate, ambos jogadores ficaram apenas com o rei");
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
    String opt;
    int out;
    while(true){
      System.out.println("Seleccione una opcion");
      System.out.println("1. Nuevo Juego");
      System.out.println("2. Cargar Juego");
      System.out.println("3. Salir");
      try{
        opt=sc.next();
        out=Integer.parseInt(opt);
        if(out>=1 && out<=3){
          break;
        }else{
          onError(0);
        }
      }catch(NumberFormatException e){
        onError(2);
      }
    }
    return out;
  }

  public static void printCemetery(Player w, Player b) {
    System.out.println(divisor);
    System.out.println("Cemitério: " );
    System.out.println("Brancas->" );
    for (int i=0;i<w.getCemetery().size();i++) {
      System.out.println(w.getCemetery().get(i).getPieceSign());
    }
    System.out.println("Pretas->" );
    for (int i=0;i<b.getCemetery().size();i++) {
      System.out.println(b.getCemetery().get(i).getPieceSign());
    }
    System.out.println(divisor);
  }

  public static void whosePlayer(Player player){
    String playerColor= (player.isColor())?"Branco":"Preto";
    System.out.println(divisor);
    System.out.println("Turno do Jogador " + player.getName() + " - " + playerColor);
  }

  //
//+inputMove() : ArrayList<ArrayList<Integer>>
  private static String coordinateRead(){
    String coord=new String();
    boolean flag=true;
    do{
      coord= sc.next();
      if(coord.length()!=2){
        onError(3);
        continue;
      }
      coord=coord.toLowerCase();
      if(coord.charAt(0)>='a' && coord.charAt(0)<='h' && coord.charAt(1)>='1' && coord.charAt(1)<='8'){
        flag=false;
      }else{
        onError(4);
      }
    }while(flag);
    return coord;
  }

  public static ArrayList<ArrayList<Integer>> inputMove() {
    boolean flag=true;
    ArrayList<ArrayList<Integer>> moveCoordinates= new ArrayList<>();

    do{
      System.out.println(divisor);
      System.out.println("Coloque as cordenadas de origem no formato rankFile : exemplo e2 e4");
      System.out.println("Para rookar coloque o rei na origem e a torre no destino");
      moveCoordinates.add(Functional.splitCoordinatesString(coordinateRead()));
      System.out.println("Coloque as coordenadas de destino:");
      moveCoordinates.add(Functional.splitCoordinatesString(coordinateRead()));

      if(moveCoordinates.get(0).equals(moveCoordinates.get(1))){//to avoid same coordinates input
        onError(6);
        moveCoordinates.clear();
      }else{
        flag=false;
      }
    }while(flag);

    return moveCoordinates;
  }

  public static Piece askPromotioPiece(boolean color) {
    Piece returnPiece;
    String opt;
    int out;
    ArrayList<Piece> values=new ArrayList<>(Arrays.asList(new Queen(color),
        new Knight(color),new Rook(color),new Bishop(color)));
    while(true){
      System.out.println(divisor);
      System.out.println("Seleccione pieza que quiere cambiar:");
      System.out.println("1. Queen");
      System.out.println("2. Knight");
      System.out.println("3. Rook");
      System.out.println("4. Bishop");
      try{
        opt=sc.next();
        out=Integer.parseInt(opt);
        if(out>=1 && out<=4){
          returnPiece= values.get(out-1);
          break;
        }else{
          onError(0);
        }
      }catch (NumberFormatException e){
        onError(2);
      }
    }
    return returnPiece;
  }

  public static int movementOptions() {
    int out;
    String opt;
    while(true){
      System.out.println(divisor);
      System.out.println("Seleccione una opcion:");
      System.out.println("1. Realizar movimiento");
      System.out.println("2. Mostrar historial de jugadas (notacion LAN)");
      System.out.println("3. Guardar juego");
      System.out.println("4. Retirarse");
      try{
        opt=sc.next();
        out=Integer.parseInt(opt);
        if(out>=1 && out<=4){
          break;
        }else{
          onError(0);
        }
      }catch(NumberFormatException e){
        onError(2);
      }
    }
    return out;
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
