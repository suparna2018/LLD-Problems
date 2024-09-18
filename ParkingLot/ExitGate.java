package ParkingLot;

public class ExitGate {

    
  int GateNumber;
  int Floor; 
    ExitGate(int GateNumber,int Floor){
        this.Floor=Floor;
        this.GateNumber=GateNumber;
    }
    Void verifyToken(){
        System.out.println("Token Verified");
        return null;
    }
}
