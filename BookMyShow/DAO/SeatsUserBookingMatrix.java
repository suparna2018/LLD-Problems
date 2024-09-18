package BookMyShow.DAO;

import java.nio.file.FileStore;
import java.util.HashMap;

import BookMyShow.Entity.Seats;
import BookMyShow.Entity.User;

public class SeatsUserBookingMatrix {
    public static HashMap<Seats,User> SeatBooking;

    public SeatsUserBookingMatrix(){
        SeatBooking=new HashMap<>();
    }

    public static void BookingHistory(){
        for(HashMap.Entry<Seats,User> entry:SeatBooking.entrySet()){
            Seats seats=entry.getKey();
            User user =entry.getValue();
            System.out.println("The seat "+seats.Number);
            System.out.print("is booked by"+user.Name);
            System.out.println();
        }
    }

    public static void Booking(User User,Seats Seat){
        if(!SeatBooking.containsKey(Seat)){
            SeatBooking.put( Seat,User);
            System.out.println("Booking Done Successfully for Seat number"+Seat.getNumber());
        }
        else{
            System.out.println("Booking Failed!!!!Try again");
        }
        
    }

    public Seats ShowAvailableSeats() {
        Boolean flag=true; 
        Seats FirstSeat=null;
        // Iterate through the seats in SeatMatrix to find an available one
        for (int i = 0; i < Seats.SeatMatrix.length; i++) {
            Seats seat = Seats.SeatMatrix[i];  // Get the seat from the SeatMatrix
            
            // Check if the seat is already booked
            if (!SeatBooking.containsKey(seat)) {
                // Seat is available
                
                if(flag){
                    FirstSeat=seat;
                    flag=false;
                }
            }
        }
        
        return FirstSeat;
    }
    
    
}
