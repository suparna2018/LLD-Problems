package ParkingLot;

public class Main {
    public static void main(String[] args) {
        ParkingLot parkingLot=new ParkingLot(5);
        ParkingService parkingService=new ParkingService();
        // //Customer 1 
        // Vehicle v1=new Vehicle("twoWheeler");
        // parkingService.request(2,v1);

        // //Customer 2
        // Vehicle v2=new Vehicle("twoWheeler");
        // parkingService.request(2,v2);

        //Customer 3 
        Vehicle v3=new Vehicle("FourWheeler");
        parkingService.request(5,v3);


    }
}
