package ObjectOrientedDesign_Java.HotelManageMent.DAO;
import java.util.HashMap;
import java.time.LocalDate;

public class BookingRegister {
   public static HashMap<Integer,HashMap<LocalDate,Boolean>> BookingRegistry;// Keep track of the roonm Avaiability

   public BookingRegister(){
    BookingRegistry=new HashMap<>();
   }

    // Register a room for a certain date range
   public static void Register(Integer RoomNo,LocalDate starDate,LocalDate enDate){
      if(BookingRegistry.get(RoomNo) != null){
         System.out.println("Booking is already ther for Room no "+RoomNo);
         return;
        
      }
      HashMap BookingMap=new HashMap<>();
      BookingRegistry.put(RoomNo, BookingMap);
      LocalDate currDate=starDate;

      while(currDate.isAfter(enDate)){
         BookingMap.put(currDate,false);
         currDate.plusDays(1);
      }

   }

   // Check if a room is available for a given date
public static Boolean isRoomAvailable(Integer RoomNo,LocalDate starDate,LocalDate enDate){
   if(!BookingRegistry.containsKey(RoomNo)){
      return true;
   }

   HashMap bookingMap=BookingRegistry.get(RoomNo);
   LocalDate currDate=starDate;

   while (!currDate.isAfter(enDate)) {
      if((boolean) bookingMap.getOrDefault(currDate,true) ){
         return false;
      }
      currDate=currDate.plusDays(1);
   }
   return true;
   
}
   
}
