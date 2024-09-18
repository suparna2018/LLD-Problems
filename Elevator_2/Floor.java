package Elevator_2;

public class Floor {
    int floor;
    FLoorButtonPanel floorButtonPanel;

    // Constructor to initialize the floor and button panel
    Floor(int floor) {
        this.floor = floor;
        this.floorButtonPanel = new FLoorButtonPanel(this.floor);
    }

    // Method to request an elevator
    void request(int destination) {
        floorButtonPanel.requestElevator(this.floor, destination);
    }
}