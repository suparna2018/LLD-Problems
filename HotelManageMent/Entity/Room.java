package ObjectOrientedDesign_Java.HotelManageMent.Entity;

public class Room {
    Boolean isAvailable;
    Boolean isClean;
    Integer RoomNo;
    

    Room(Integer RoomNo){
        this.isAvailable=true;
        this.isClean=true;
        this.RoomNo=RoomNo;
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public Boolean getIsClean() {
        return isClean;
    }
    public Integer getRoomNo() {
        return RoomNo;
    }
    
}
