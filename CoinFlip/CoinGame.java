package CoinFlip;

public class CoinGame {
    public Player[] players=new Player[2];
    Coin coin=new Coin();

    

    public CoinGame(String Player1Name,String Player2Name) {
        players[0]= new Player(Player1Name);
        players[1]= new Player(Player2Name);
        }



    public void StartGame(){
        
        int randIndex = (Math.random()<0.5)?0:1;
        String PlayerPick=players[randIndex].getRandCoinOption();


        String opponentPick=players[1-randIndex].getCoinOption(PlayerPick);

        String winninfFlip=coin.getCoinOption();
        players[0].didPlayerWin(winninfFlip);
        players[1].didPlayerWin(winninfFlip);



    }
    
}
