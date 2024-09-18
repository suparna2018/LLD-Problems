package Elevator_2;

public class FLoorButtonPanel implements ButtonPanel {
    int currFloor;
    int destinationFloor;

    public FLoorButtonPanel(int currFloor){
        this.currFloor=currFloor;
    }
    @Override
    public void messageDisplay(int Floor,String msg) {
       System.out.println("Lift is coming,Wait a minute");
    }

     // Request an elevator to move from the current floor to the destination floor
     public boolean requestElevator(int source, int destination) {
        // Get the singleton instance of Dispatcher
        Dispatcher dispatcher = Dispatcher.getInstance(null);
        
        // Request Dispatcher to schedule the elevator
        Elevator selectedElevator = dispatcher.schedule(source, destination);
        
        // Provide feedback message
        if (selectedElevator != null) {
            messageDisplay(source, "Elevator " + selectedElevator.id + " is coming to floor " + source);
            return true;
        } else {
            messageDisplay(source, "No elevator available.");
            return false;
        }
    }
    
}
