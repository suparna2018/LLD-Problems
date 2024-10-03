package ObjectOrientedDesign_Java.HotelManageMent.Entity;
import java.util.ArrayList;

import ObjectOrientedDesign_Java.HotelManageMent.DAO.BookingRegister;
import ObjectOrientedDesign_Java.HotelManageMent.Entity.Room;

public class Hotel {
    static ArrayList<Room> RoomList;
    BookingRegister BookingRegister=new BookingRegister();
    static Integer n;
    
    public Hotel(Integer N){
        RoomList=new ArrayList<Room>();
        n=N;
        // BookingRegister=;
        for(Integer i=0;i<=n;i++){
            Room room=new Room(i);
            RoomList.add(room);
            
        }
    }
    static void BookRooms(Integer bookingStart,Integer BookingEnd){
        // for(Integer i=bookingStart;i<=BookingEnd;i++){
        //     for(Integer j=0;j<=n;j++){
        //         BookingRegister.Register()
        //     }

        // }
        
    }
}
