package ParkingLot;
import java.util.*;

public class Payment {
    public static Map<String, String> VehicleParkingSpotMap = new HashMap<>();  // Initialize the map
    public static Map<String, Integer> PriceChart = new HashMap<>();            // Initialize the map

    // Constructor
    Payment() {
        VehicleParkingSpotMap.put("twoWheeler", "Small");
        VehicleParkingSpotMap.put("FourWheeler", "Medium");

        PriceChart.put("Small", 100);
        PriceChart.put("Medium", 1000);
    }

    // Payment processing method
    static int PaymentGateway(int hours, Vehicle vehicle) {
        String vt = VehicleParkingSpotMap.get(vehicle.vehicleType);  // Get the vehicle type
        
        // Check if the vehicle type exists in the map
        if (vt == null) {
            System.out.println("Error: Vehicle type '" + vehicle.vehicleType + "' not found in VehicleParkingSpotMap.");
            return 0;
        }

        Integer price = PriceChart.get(vt);  // Get the price based on vehicle type
        
        // Check if the parking spot type exists in the PriceChart
        if (price == null) {
            System.out.println("Error: Parking spot type '" + vt + "' not found in PriceChart.");
            return 0;
        }

        System.out.println("Please pay " + (hours * price) + " rs.");
        try {
            Thread.sleep(2000);  // Simulate payment delay
            System.out.println("Payment Successful!!");
        } catch (InterruptedException e) {
            System.out.println("Payment Failed");
        }

        return hours * price;  // Return total price
    }
}

