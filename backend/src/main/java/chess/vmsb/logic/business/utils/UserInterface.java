package chess.vmsb.logic.business.utils;
import chess.vmsb.logic.business.board.Board;
import chess.vmsb.logic.business.board.Square;
import chess.vmsb.logic.business.models.Piece;
import chess.vmsb.logic.business.models.Player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class UserInterface {
    private static String divisor = "-------------------";
    private static Scanner reader = new Scanner(System.in);

    public static void onError(){
        System.out.println("Erro de entrada, use valores entre 1 e 3");
    }

    private static void onDuplicateCoordinate(){
        System.out.println(divisor);
        System.out.println("\tError!!, Cooerdenadas iguales, intente otra vez");
        System.out.println(divisor);
    }

    public static void onInvalidMove() {
        System.out.println(divisor);
        System.out.println("\tError!! Movimiento no valido, intente otra vez");
        System.out.println(divisor);
    }

    public static void printBoard(Board board){
        System.out.println(divisor);
        System.out.println(board.stringBoard());
    }

    public static String readName(String col){
        System.out.println(divisor);
        System.out.println("Nome do Jogador "+ col);
        return reader.next();
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
        return reader.nextInt();
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
    public static ArrayList<ArrayList<Integer>> inputMove(Player player){ // Already transforms fileRank to Arraylist<ArrayList<Integer>>
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> move = new ArrayList<>();
        System.out.println("Enter the coordinates of the piece you want to move: \n -> ");
        String coord = sc.nextLine();
        int[] from = toIntCoordinate(coord);
        move.add(new ArrayList<>(Arrays.asList(from[0], from[1])));
        System.out.println("Enter the coordinates of the square you want to move to: \n -> ");
        coord = sc.nextLine();
        int[] to = toIntCoordinate(coord);
        move.add(new ArrayList<>(Arrays.asList(to[0], to[1])));
        return move;
    }

    public static int[] toIntCoordinate(String cr) {
        // Convert the input String to lowercase to ensure case-insensitive comparison
        cr = cr.toLowerCase();

        // Check that the input String has exactly 2 characters
        if (cr.length() != 2) {
            throw new IllegalArgumentException("Input String must have exactly 2 characters");
        }

        // Extract the file (column) and rank (row) characters from the input String
        char fileChar = cr.charAt(0);
        char rankChar = cr.charAt(1);

        // Check that the file and rank characters are valid
        if (fileChar < 'a' || fileChar > 'h' || rankChar < '1' || rankChar > '8') {
            throw new IllegalArgumentException("Invalid input String. Must be in the format 'fileRank', e.g., 'e4'");
        }

        // Calculate the corresponding numerical values for file and rank
        int file = fileChar - 'a';
        int rank = rankChar - '1';

        // Create and return the int[] with file and rank values
        return new int[] {file, rank};
    }


}
