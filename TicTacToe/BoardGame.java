package TicTacToe;

public class BoardGame {
    Board board=new Board();
    public Players players[]=new Players[2];

    public BoardGame(String name1,String name2){
        System.out.println(name2);
        players[0]=new Players(name1,1);
        players[1]=new Players(name2,2);

    }
    //Start Game()
    public void StartGame(){
        int randIndex=Math.random()>0.5?0:1;

        char PlayersPick=players[randIndex].getRandSignOption();
        char opponenetPick=players[1-randIndex].getSignOption(PlayersPick);
        Boolean res=Board.GameOver();
        while(res==false){
            try{
                players[0].PlaceMySign();
                players[1].PlaceMySign();
            }
           
            catch(Exception e){
                res=true;
            }
     
        }
        
        if(res){
            Boolean r1=players[0].DidPlayerWin(PlayersPick); 
            Boolean r2=players[1].DidPlayerWin(opponenetPick);
            if(r1){
                System.out.println("Congo!!!! "+players[0].name+" You win");
            }
            else if(r2){
                System.out.println("Congo!!!! "+players[1].name+" You win");
            }
            else{
                System.out.println("Draw");
            }
        }

    }

}
