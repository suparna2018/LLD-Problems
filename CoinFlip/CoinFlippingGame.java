package CoinFlip;

public class CoinFlippingGame {
    public static void main(String[] args) {
        CoinGame coinGame=new CoinGame("Bobby","Tommy");
        int i=0;
        while(i<=1000){
        coinGame.StartGame();
        i++;
    }

    }
}
