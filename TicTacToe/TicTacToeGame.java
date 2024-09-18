package TicTacToe;

public class TicTacToeGame extends Thread{
    BoardGame boardGame;
    String Player1;
    String Player2;
    public TicTacToeGame(String name1,String name2){
        this.Player1=name1;
        this.Player2=name2;
    }
    
    public void run(){
        boardGame=new BoardGame(Player1, Player2);
        System.out.println(Player1 + " vs " + Player2 + " - Game Started!");
        boardGame.StartGame();
    }

    public static void main(String[] args) {
        TicTacToeGame ticTacToeGame=new TicTacToeGame("Tony","Bobby");
        ticTacToeGame.start();
    }

}
