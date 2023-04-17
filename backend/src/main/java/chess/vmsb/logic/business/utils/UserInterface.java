package chess.vmsb.logic.business.utils;
import chess.vmsb.logic.business.board.Board;
import chess.vmsb.logic.business.board.Square;
import chess.vmsb.logic.business.models.Piece;
import chess.vmsb.logic.business.models.Player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class UserInterface extends MovementHandler{

//
//+inputMove() : ArrayList<ArrayList<Integer>>
    public ArrayList<ArrayList<Integer>> inputMove(){ // Already transforms fileRank to Arraylist<ArrayList<Integer>>
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

    @Override
    public boolean isValidMove(Board board, ArrayList<ArrayList<Integer>> moveData){
        // Extract the 'from' and 'to' coordinates from the moveData
        ArrayList<Integer> from = moveData.get(0);
        ArrayList<Integer> to = moveData.get(1);
        // Get the file (column) and rank (row) values from the 'from' and 'to' coordinates
        int fromFile = from.get(0);
        int fromRank = from.get(1);
        int toFile = to.get(0);
        int toRank = to.get(1);
        // Validate if the 'from' and 'to' coordinates are within the valid board range
        if (fromFile < 0 || fromFile > 7 || fromRank < 0 || fromRank > 7 || toFile < 0 || toFile > 7 || toRank < 0
                || toRank > 7) {
            System.out.println("Invalid move. Coordinates are out of range.");
            return false;
        }
        // Get the square at the 'from' and 'to' coordinates on the board
        Square fromSquare = board.getGameBoard()[fromRank][fromFile];
        Square toSquare = board.getGameBoard()[toRank][toFile];
        // Validate if the 'from' square does not contains a piece and the 'to' square is empty
        if (fromSquare.getPiece() == null || toSquare.getPiece() != null) {
            System.out.println("Invalid move. Source square does not contain a piece or target square is not empty.");
            return false;
        } else if(fromSquare.getPiece().isColor() == toSquare.getPiece().isColor()){
            System.out.println("Invalid move. You can't move your piece to a square occupied by your own piece.");
            return false;
        }
        // [Add additional logic to check if the move is valid based on your game rules]
        // For example, you can check if the move is valid for the specific piece type,
        // the player's turn, the direction of the move, etc.

        // If all validations pass, return true to indicate a valid move
        return true;
    }

    @Override
    public Object[] performMove(Board board, Player[] player, ArrayList<ArrayList<Integer>> moveData) {
        if(isValidMove(board, moveData)){
            // Extract the 'from' and 'to' coordinates from the moveData
            ArrayList<Integer> from = moveData.get(0);
            ArrayList<Integer> to = moveData.get(1);
            // Get the file (column) and rank (row) values from the 'from' and 'to' coordinates
            int fromFile = from.get(0);
            int fromRank = from.get(1);
            int toFile = to.get(0);
            int toRank = to.get(1);
            // Get the square at the 'from' and 'to' coordinates on the board
            Square fromSquare = board.getGameBoard()[fromRank][fromFile];
            Square toSquare = board.getGameBoard()[toRank][toFile];
            // Get the piece from the 'from' square
            Piece piece = fromSquare.getPiece();
            // Set the piece on the 'to' square
            toSquare.setPiece(piece);
            toSquare.setValue(piece.getPieceSign());
            // Remove the piece from the 'from' square
            fromSquare.setPiece(null);
            fromSquare.setValue('-');
            // [Add additional logic to perform the move based on your game rules]
            // For example, you can check if the move is valid for the specific piece type,
            // the player's turn, the direction of the move, etc.
            // If all validations pass, return true to indicate a valid move
            return new Object[]{board, player[0]};
        }else {
            return new Object[]{board, player[0]};
        }
    }

}
