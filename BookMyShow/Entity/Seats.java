package BookMyShow.Entity;

import java.util.ArrayList;
import java.util.List;

public class Seats {
    public static Seats SeatMatrix[]=new Seats[50]; 
    public int Number;
    public int Price;
    // String Type;



public Seats(int Number,int Price){
    this.Number=Number;
    this.Price=Price;
} 
  

    public static void seatIniate(){
        for(int i=0;i<50;i++){
           
            // 10 seats are recliner
            if(i<10){
                SeatMatrix[i] = new Seats(i + 1, 1000);
                
            }
            else{
                 // Rest Are normal
            SeatMatrix[i] = new Seats(i + 1, 500);
            }
           
        }
    }
        
    public int getNumber() {
        return this.Number;
    }


}
