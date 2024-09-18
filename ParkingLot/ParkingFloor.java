package ParkingLot;
import java.util.*;

public class ParkingFloor {
    List<ParkingSpace> parkingSpaces;
    List<EntryGate> entryGates;
    List<ExitGate> exitGates;
    int mediumSpotCount;
    int smallSpotCount;
    int floor;
    private static List<ParkingSpace> smallSpots;
    private static List<ParkingSpace> mediumSpots;

    ParkingFloor(int floor, int n, int numberOfGates) {
        parkingSpaces = new ArrayList<>();
        entryGates = new ArrayList<>();
        exitGates = new ArrayList<>();
        smallSpots = new ArrayList<>();
        mediumSpots = new ArrayList<>();
        int smallSpot = 0;
        int mediumSpotCounter = 0;
        String spotType;
        this.floor = floor;

        for (int i = 0; i < n; i++) {
            ParkingSpace parkingSpot;
            if (i < n / 3) {  // Assign small spots to the first third of spaces
                spotType = "Small";
                parkingSpot = new ParkingSpace(spotType, i, floor);
                smallSpots.add(parkingSpot);
                smallSpot++;
            } else {  // Assign medium spots to the rest
                spotType = "Medium";
                parkingSpot = new ParkingSpace(spotType, i, floor);
                mediumSpots.add(parkingSpot);
                mediumSpotCounter++;
            }
            parkingSpaces.add(parkingSpot);
        }
        
        // Initialize entry and exit gates
        for (int i = 0; i < numberOfGates; i++) {
            EntryGate entryGate = new EntryGate(i, this.floor);
            entryGates.add(entryGate);
        }
        for (int i = 0; i < numberOfGates; i++) {
            ExitGate exitGate = new ExitGate(i, this.floor);
            exitGates.add(exitGate);
        }

        this.smallSpotCount = smallSpot;
        this.mediumSpotCount = mediumSpotCounter;
    }

    public List<ParkingSpace> getSmallSpots() {
        return smallSpots;
    }

    public List<ParkingSpace> getMediumSpots() {
        return mediumSpots;
    }

    public int getSmallSpotCount() {
        return smallSpotCount;
    }

    public int getMediumSpotCount() {
        return mediumSpotCount;
    }
}
