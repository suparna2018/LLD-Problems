package CoinFlip;

public class Coin {
    private String coinOption="";

    public String[] coinValue={"Head", "Tail" };

    Coin(){
        int randnum=(Math.random()<0.5)?0:1;
        coinOption=coinValue[randnum];

    }

    public String getCoinOption(){
        int randnum=(Math.random()<0.5)?0:1;
        coinOption=coinValue[randnum];
        return coinOption;
    }
} 
