package Elevator_2;

import java.util.Arrays;
import java.util.List;

public class ElevatorManager extends Thread {

        Elevator e1=new Elevator(1,1);
        Elevator e2=new Elevator(2,2);
        Elevator e3=new Elevator(3,3);
        Elevator e4=new Elevator(4,4);
        Elevator e5=new Elevator(5,5);

        Floor f1=new Floor(1);
        Floor f2=new Floor(2);
        Floor f3=new Floor(3);
        Floor f4=new Floor(4);
        Floor f5=new Floor(5);

        

        
        public ElevatorManager() {
            // Making requests for elevators
            Dispatcher dispatcher = Dispatcher.getInstance(Arrays.asList(e1, e2, e3, e4, e5));
           
        }

        public void run(){
            List<Floor> FloorList=Arrays.asList(f1, f2, f3, f4, f5);
            for(int i=0;i<5;i++){
                int x=Math.random()>0.7?(i+1)%5:(i+3)%5;
                if(x==i){
                    System.out.println("Invalid Request!!");
                }
                else{
                    FloorList.get(i).request(x); 
                }
                
            }
            
        }
        
}
