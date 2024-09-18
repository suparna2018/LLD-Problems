package ParkingLot;

public class ParkingSpace {
    String spotType;
    boolean isEmpty;
    int Floor;
    int id;


    ParkingSpace(String spotType,int floor,int id){
        this.spotType=spotType;
        this.Floor=floor;
        this.isEmpty=true;
        this.id=id;
    }

}
