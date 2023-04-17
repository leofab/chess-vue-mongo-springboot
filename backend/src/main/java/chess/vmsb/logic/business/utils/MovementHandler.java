package chess.vmsb.logic.business.utils;

import chess.vmsb.logic.business.board.Board;
import chess.vmsb.logic.business.board.Square;
import chess.vmsb.logic.business.models.Piece;
import chess.vmsb.logic.business.models.Player;

import java.util.ArrayList;

public class MovementHandler implements Functional{
    private int countRep;
    private int pieceCheckCoord;
    //TODO talks to VUE
//    private UI userUI;

    public int[] getKingXY (Board board, Player[] player){
        Player playerW = player[0];
        Player playerB = player[1];
        int[] wKingXY = new int[2];
        int[] bKingXY = new int[2];
        int[] wbKingXY = new int[4];
        Piece wKing = playerW.getPieces().stream().filter(piece -> piece.getPieceSign() == 'k').findFirst().get();
        Piece bKing = playerB.getPieces().stream().filter(piece -> piece.getPieceSign() == 'K').findFirst().get();
        for (int i = 0; i < board.getGameBoard().length; i++) {
            for (int j = 0; j < board.getGameBoard()[i].length; j++) {
                if (board.getGameBoard()[i][j].getPiece() == wKing){
                    wbKingXY[0] = i;
                    wbKingXY[1] = j;
                }
                if (board.getGameBoard()[i][j].getPiece() == bKing){
                    wbKingXY[2] = i;
                    wbKingXY[3] = j;
                }
            }
        }
        return wbKingXY;
    }
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
        } else if(fromSquare.getPiece().isMoved() == toSquare.getPiece().isMoved()){
            System.out.println("Invalid move. You can't move your piece to a square occupied by your own piece.");
            return false;
        }
        // [Add additional logic to check if the move is valid based on your game rules]
        // For example, you can check if the move is valid for the specific piece type,
        // the player's turn, the direction of the move, etc.

        // If all validations pass, return true to indicate a valid move
        return true;
    }
    //# performMove(Board board, Player[] player, ArrayList<ArrayList<Integer>> moveData): Object[]


    @Override
    public ArrayList<Integer> splitCoordinatesString(String str) {
        return null;
    }

    @Override
    public int[] splitDataPair(ArrayList<Integer> data) {
        return new int[0];
    }

    @Override
    public char[] toCharCoordinate(int cr) {
        // Extract the file (column) and rank (row) values from the input int
        int file = cr / 10;
        int rank = cr % 10;

        // Check that the file and rank values are valid
        if (file < 1 || file > 8 || rank < 1 || rank > 8) {
            throw new IllegalArgumentException("Invalid input int. Must be in the range of 11 to 88.");
        }

        // Calculate the corresponding characters for file and rank
        char fileChar = (char) ('a' + file );
        char rankChar = (char) ('1' + rank );

        // Create and return the char[] with file and rank characters
        return new char[] {fileChar, rankChar};
    }

    @Override
    public int[] toIntCoordinate(String cr) {
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

    @Override
    public ArrayList<Integer> reverseCoordinate(ArrayList<Integer> coord) {
        return null;
    }

    @Override
    public Object deepCopy(Object odlObj) {
        return null;
    }
}
