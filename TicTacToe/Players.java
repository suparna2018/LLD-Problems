package TicTacToe;

public class Players {
    String name;
    int number;
    char PlayerSign;

    public Players(String name,int number){
        this.name=name;
        this.number=number;

    }
    //Gets to choose the sign of choice
    public char getRandSignOption(){
        char getSign=Math.random()>0.5?'X':'0';
        this.PlayerSign=getSign;
        PlaceMySign();
        DidPlayerWin(this.PlayerSign);
        return getSign;
    }
    
    //Place your sign
    public void PlaceMySign(){
        int pos[]=Board.checkBoardStatus();
        int x=pos[0];
        int y=pos[1];
            Board.Board[x][y]=this.PlayerSign;
            Board.Display();
            System.out.println();
    }
  
    public char getSignOption(char Player1Picks) {
        char opponenetSign=Player1Picks=='X'?'0':'X';
        this.PlayerSign=opponenetSign;
        PlaceMySign();
        Board.Display();
        DidPlayerWin(this.PlayerSign);
        return opponenetSign;

    }
      //Did I win?
    public Boolean DidPlayerWin(char playersPick) {
        Boolean checkDiag=true;
         // checkDiagonal
         for(int i=0;i<3;i++){
                if (Board.Board[i][i+i]!='|' && Board.Board[i][i+i]!=playersPick){
                    checkDiag=false;
                    break;
                }
               
        }
        Boolean checkAntiDiag=true;
        //check Anti diagonal
        for(int i=0;i<3;i++){
            if (Board.Board[i][4-1-i]!=playersPick){
                checkDiag=false;
                break;
            }
           
    }

         //Check rows
         Boolean checkrow=true;
       for(int i=0;i<3;i++){
        for (int j=0;j<5;j++){
            if (Board.Board[i][i]!='|' && Board.Board[i][j]!=playersPick){
                checkrow=false;
                break;
            }
        }
       }
         //check columns
         Boolean checkcol=true;
         for(int i=0;i<5;i++){
            for (int j=0;j<3;j++){
                if (Board.Board[j][i]!='|' && Board.Board[j][i]!=playersPick){
                    checkcol=false;
                    break;
                }
            }
           }
        return checkcol||checkDiag||checkAntiDiag||checkrow;
    }

}
