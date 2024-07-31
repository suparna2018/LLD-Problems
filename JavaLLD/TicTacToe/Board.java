package JavaLLD.TicTacToe;
import java.util.ArrayList;
import java.util.List;

import JavaLLD.TicTacToe.Model.PieceType;
import JavaLLD.TicTacToe.Model.PlayingPiece;

public class Board {
    public int size;
    public PlayingPiece[][]board;
    
    public Board(int size) {
        this.size = size;
        this.board = new  PlayingPiece[size][size];;
    }

    public boolean addPiece(int row,int column,PieceType playingPiece){
        if (board[row][column]!=null) {
            return true;
        }
        board[row][column].playingpiece=playingPiece;
        return false;
    }

public List<Pair<Integer ,Integer>> getFreeCells(){
        @SuppressWarnings("rawtypes")
        final List<Pair<Integer ,Integer>>freeCells=new ArrayList();

        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++ ){
                if(board[i][j]==null){
                    final Pair<Integer,Integer> rowColumn= new Pair<>(i,j);
                    freeCells.add(rowColumn);
                }
            }
        }
        return freeCells;
    }

    public void printBoard(){
        for(int i=0;i<board.size;i++){
            for(j=0;j<board.size;j++){
                if(board[i][j]==null){
                    System.out.print("    ");

                }
                else{
                    System.out.print(board[i][j].playingpiece.name() + "   ");
                }

                System.out.print(" | ");
            }
            System.out.println();;
        }
    }
}
