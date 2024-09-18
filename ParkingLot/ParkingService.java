package ParkingLot;

public class ParkingService {
    
    
    static boolean request(int hours,Vehicle vehicle){
        String vehString=Payment.VehicleParkingSpotMap.get(vehicle.vehicleType);
        if(CheckForEmpySpots(vehString)){
            System.out.println("ParkingSpot Availavle!!");
            GenerateSpot(vehString);
            Payment.PaymentGateway(hours, vehicle);
            System.out.println("You can Park your vehicle!!");

        }
        return false;

    }

    private static boolean CheckForEmpySpots(String vehString) {

        if(vehString=="Small" && ParkingLot.totalSmallSpot==0){
            System.out.println("No spot for"+ vehString + "vehicles");
            return false;
        }
        else if(vehString=="Medium" && ParkingLot.totalMediumSpot==0){
            System.out.println("No spot for"+ vehString + "vehicles");
            return false;
        }
        else{
            
            return true;
        }
    }

    private static void GenerateSpot(String vehString) {
        if (vehString.equals("Medium")) {
            ParkingLot.totalMediumSpot -= 1;
        } else if (vehString.equals("Small")) {
            ParkingLot.totalSmallSpot -= 1;
        }
    
        boolean spotAllocated = false;
    
        // Try to allocate a spot for the given vehicle type
        for (ParkingSpace e : ParkingLot.SpotCount.get(vehString)) {
            if (e.isEmpty && e.spotType.equals(vehString)) {
                e.isEmpty = false;
                System.out.println("Plot number allocated, Park at floor " + e.Floor + " on Spot with id " + e.id);
                spotAllocated = true;
                break;
            }
        }
    
        // If no "Small" spot is available for a small vehicle, check for "Medium" spots
        if (!spotAllocated && vehString.equals("Small")) {
            for (ParkingSpace e : ParkingLot.SpotCount.get("Medium")) {
                if (e.isEmpty && e.spotType.equals("Medium")) {
                    e.isEmpty = false;
                    System.out.println("Small vehicle allocated to a medium spot, Park at floor " + e.Floor + " on Spot with id " + e.id);
                    spotAllocated = true;
                    break;
                }
            }
        }
    
        if (!spotAllocated) {
            System.out.println("No available spot for the vehicle.");
        }
    }
}
