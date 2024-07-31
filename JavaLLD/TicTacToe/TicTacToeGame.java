package JavaLLD.TicTacToe;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import JavaLLD.TicTacToe.Model.PieceType;
import JavaLLD.TicTacToe.Model.Player;
import JavaLLD.TicTacToe.Model.PlayingPiece;
import JavaLLD.TicTacToe.Model.PlayingPieceX;   

public class TicTacToeGame {
    Deque<Player>players;
    Board gameboard;
    TicTacToeGame() {
       initializeGame();
    }
    public void initializeGame(){
        players=new LinkedList<>();
        // Create Two Players
        PlayingPieceX crossPiece=new PlayingPieceX();
        Player player1= new Player(crossPiece,"1st Player");
        PlayingPieceX OtherPiece=new PlayingPieceX();
        Player player2= new Player(OtherPiece,"2nd Player");
        players.add(player2);
        players.add(player1);

        startGame();

    }

    public String startGame(){
        boolean noWinner=true;

        while (noWinner) {
            // Take out the player whose turn is over
            Player playerTurn=players.removeFirst();
            // get the free cells  // Print the board 
            gameboard.printBoard();
            List<Pair<Integer ,Integer>> freeCells=gameboard.getFreeCells();
            if (freeCells.isEmpty()) {
                noWinner=false;
                continue;
            }
             // Read User input
        System.out.println("Hey!!"+ playerTurn.name +"Enter the row and column" );
        Scanner inpuScanner=new Scanner(System.in);
        String s=inpuScanner.nextLine();
        String values[]=s.split(",");
        int inputRow=Integer.valueOf(values[0]);
        int inputColumn=Integer.valueOf(values[1]);

          // Add user piece
          boolean pieceAddedSuccessfully=gameboard.addPiece(inputRow, inputColumn, playerTurn.playingPiece.playingpiece);
          // User cannot place his piece
          if(pieceAddedSuccessfully==false){
              System.out.println("Incorrect Position chosen, Try Again");
              players.addFirst(playerTurn);
              continue;
          }
          players.addLast(playerTurn);
          boolean winner=isWInner(inputRow, inputColumn, playerTurn.playingPiece.playingpiece);
          if(winner){
              return playerTurn.name;

          }
        }
       return "tie";
    }
    public boolean isWInner(int inputRow,int inputColumn,PieceType Piece){
        boolean checkColumn=true;

        boolean checkRow=true;
        boolean checkDiagonal=true;
        boolean checkAntiDiagonal=true;

        // Check for rows
        for(int i=0;i<gameboard.size;i++){
            if(gameboard.board[i][inputColumn]==null || gameboard.board[i][inputColumn].playingpiece!=Piece ){
                checkColumn=false;
            }
        }
        // Check Columns
        for(int i=0;i<gameboard.size;i++){
            if(gameboard.board[inputRow][i]==null || gameboard.board[inputRow][i].playingpiece!=Piece ){
                checkRow=false;
            }
        }
        // check Diagonals
        for(int i=0,int j=0; i<gameboard.size,j<gameboard.size;i++,j++){
            if(gameboard.board[i][j]==null || gameboard.board[i][j].playingpiece!=Piece ){
                checkDiagonal=false;
            }
        }
        for(int i=0,int j=gameboard.size-1;i<gameboard.size,j>0; i++,j--){
            if(gameboard.board[i][j]==null || gameboard.board[i][j].playingpiece!=Piece){
                checkAntiDiagonal=false;
            }
        }
        return checkColumn || checkDiagonal|| checkRow|| checkAntiDiagonal;
    }
}
