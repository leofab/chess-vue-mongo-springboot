package chess.vmsb.logic.business.models;

import chess.vmsb.logic.business.board.Board;

public class Bishop extends Piece {

    public Bishop(char pieceSign, boolean color) {
        super(pieceSign, color);
        super.setDx(new int[]{-1,1,1,-1});//file
        super.setDy(new int[]{1,1,-1,-1});//rank
    }
    @Override
    public boolean pieceCheck(Board board, int[]from,int[]to){
        int myDx[] =super.getDx();
        int myDy[] =super.getDy();

        double a=from[1]-to[1];
        double b=from[0]-to[0];
        if(b==0 || a==0)return false;
        double m=(a/b);
        if(Math.abs(m)==1){
            Piece sourceP=board.getGameBoard()[from[0]][from[1]].getPiece();
            if(a<=-1 && b>=1){
                return dfs(board, sourceP, from, to, myDx[0],myDy[0]);
            }else if(a<=-1 && b<=-1){
                return dfs(board, sourceP, from, to, myDx[1],myDy[1]);
            }else if(a>=1 && b<=-1){
                return dfs(board, sourceP, from, to, myDx[2],myDy[2]);
            }else if(a>=1 && b>=1){
                return dfs(board, sourceP, from, to, myDx[3],myDy[3]);
            }
        }
        return false;
    }

    private boolean dfs(Board board,Piece sourceP, int[]from,int[]to,int x,int y){
        while(true){
            if(from[0]+x<0 || from[0]+x>7)break;
            if(from[0]+y<0 || from[0]+y>7)break;
            if(board.getGameBoard()[from[0]+x][from[1]+y].getPiece()!=null)break;

            if(from[0]+x==to[0] && from[1]+y==to[1]){
                char pieceTo=board.getGameBoard()[to[0]][to[1]].getPiece().getPieceSign();

                if(board.getGameBoard()[to[0]][to[1]].getPiece()==null)return true; // true if there is no piece in that box
                return !(Character.isLowerCase(sourceP.getPieceSign()) && Character.isLowerCase(pieceTo));//false if there is a piece of the same color
            }
            from[0]+=x;
            from[1]+=y;
            return dfs(board,sourceP,from,to,x,y);
        }
        return false;
    }
}
