package CoinFlip;

public class Player {
    private String name;
    private String coinOption="";

    public String[] coinValue={"Head", "Tail" };

    public Player(String name) {
        this.name = name;
       
    }

    public String getCoinOption(String opponeneString){
        coinOption= (opponeneString=="Head")?"Tail":"Head";
        return coinOption;
    }
    
    public void SetCoinOtion(){

    }

    public String getRandCoinOption(){
        int randnum=(Math.random()<0.5)?0:1;
        coinOption=coinValue[randnum];
        return coinOption;
    }
    public void didPlayerWin(String winningFlip){
        if(winningFlip==coinOption){
            System.out.println("Congo!!! "+ name +" You win!!!");
        }

    }
}
