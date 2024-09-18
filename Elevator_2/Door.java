package Elevator_2;

public class Door {
    public void OpenDoor(){
        System.out.println("Door opening!!");
        try {
            Thread.sleep(100);
        } catch (Exception e) {
           
        }
       
    }
    public void closeDoor(){
        System.out.println("Door Closing!!");
        try {
            Thread.sleep(100);
        } catch (Exception e) {
          
        }
    }

}
