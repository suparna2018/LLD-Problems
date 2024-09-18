package ParkingLot;
import java.util.*;
public class ParkingLot {
    List<ParkingFloor> ParkingFloors;
    public static Map<String , List<ParkingSpace>> SpotCount = new HashMap<>();
    static int totalSmallSpot;
    static int totalMediumSpot;
    Payment paymentService;

    ParkingLot(int n){
        ParkingFloors = new ArrayList<>(); 
         // Initialize total spot counts to zero
         totalSmallSpot = 0;
         totalMediumSpot = 0;
 
         // Initialize spotCount Map with empty lists for "Small" and "Medium"
         SpotCount.put("Small", new ArrayList<>());  // Ensure list exists
         SpotCount.put("Medium", new ArrayList<>()); // Ensure list exists

        for(int i=0;i<n;i++){
            ParkingFloor parkingFloor = new ParkingFloor(5, i, 2);
            
            ParkingFloors.add(parkingFloor);
            totalSmallSpot+=ParkingFloors.get(i).getSmallSpotCount();
            totalMediumSpot+=ParkingFloors.get(i).getMediumSpotCount();

        }
         for (ParkingFloor floor : ParkingFloors) {
            SpotCount.get("Small").addAll(floor.getSmallSpots());
            SpotCount.get("Medium").addAll(floor.getMediumSpots());
        }

        Payment paymentService=new Payment();
    }



}
