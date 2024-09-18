package Elevator_2;

public class Elevator {
    int currFloor;
    int id;
    LiftButtonPanel liftButtonPanel;
    Door door;
    boolean MovingUp;
    int startFloor;
    int EndFloor;

    Elevator(int id,int currFloor){
        this.id=id;
        this.currFloor=currFloor;
    }

    public void Moving(int s,int d){
        System.out.println("Going from"+s +" to "+d);
        //Destitation Reaching
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            
        }
        
        
    }

}
