package Elevator_2;

import java.util.*;

public class Dispatcher {
    // Singleton Instance Creation
    public static volatile Dispatcher Instance;

    // List of Elevators
    List<Elevator> Elevators;
    // Map of Elevators and Floors
    Map<Elevator,Integer> elevatorPositions;

    // Private Constructor to prevent instantiation
    private Dispatcher(List<Elevator> Elevators){
        this.Elevators=Elevators;
        this.elevatorPositions=new HashMap<>();
        for(Elevator elevator:Elevators){
            elevatorPositions.put(elevator,elevator.id);
        }
    }
    // method to create a singleton Instance
    public static Dispatcher getInstance(List<Elevator> Elevators){
        if(Instance==null){
            synchronized(Dispatcher.class){
                if(Instance==null){
                    Instance=new Dispatcher(Elevators);
                }
            }
            
        }
        return Instance;
    }

    // Scheduling method that finds the best elevator for the given source and destination
    public Elevator schedule(int source,int destination){
        Elevator bestElevator=null;
        int minDistance=(int) 1e9;

         // Find the closest elevator
        for(Elevator elevator:Elevators){
            int currentPosition=elevatorPositions.get(elevator);
            int Distance=Math.abs(currentPosition-source);

            if(minDistance>Distance){
                minDistance=Distance;
                bestElevator=elevator;
            }
        }

         // Move the best elevator to handle the request
        if(bestElevator!=null){
            bestElevator.Moving(source,destination);
            elevatorPositions.put(bestElevator,destination);
        }
        return bestElevator;

    }
// Prevent cloning

@Override
protected Object clone() throws CloneNotSupportedException {
    // TODO Auto-generated method stub
    throw new  CloneNotSupportedException("Clone not supported for Dispatcher");
}



}



















// package ObjectOrientedDesign_Java.Elevator;

// import java.util.HashMap;
// import java.util.List;
// import java.util.Map;

// public class Dispatcher {
//     // List of Elevators
//     List<Elevator> elevators;
    
//     // Map of Elevator and their current position (floor)
//     Map<Elevator, Integer> elevatorPositions;

//     // Constructor to initialize elevators and their positions
//     public Dispatcher(List<Elevator> elevators) {
//         this.elevators = elevators;
//         this.elevatorPositions = new HashMap<>();
//         for (Elevator elevator : elevators) {
//             elevatorPositions.put(elevator, elevator.currFloor);
//         }
//     }
//      // Scheduling method that finds the best elevator for the given source and destination
//      public Elevator schedule(int source, int destination) {
//         Elevator bestElevator = null;
//         int minDistance = Integer.MAX_VALUE;

//         // Find the closest elevator
//         for (Elevator elevator : elevators) {
//             int currentPosition = elevator.currFloor;
//             int distance = Math.abs(currentPosition - source);

//             // Check if this elevator is closer
//             if (distance < minDistance) {
//                 minDistance = distance;
//                 bestElevator = elevator;
//             }
//         }

//         // Move the best elevator to handle the request
//         if (bestElevator != null) {
//             bestElevator.Moving(source, destination);
//         }

//         return bestElevator;
//     }
// }


