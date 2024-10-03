package ObjectOrientedDesign_Java.HotelManageMent.Entity;
import java.util.UUID;

import ObjectOrientedDesign_Java.HotelManageMent.DAO.BookingRegister;

import java.time.LocalDateTime;
import java.time.LocalDate;

public class Customer {
    String Name;
    UUID customerId;

    public Customer(String customerName){
        this.Name=customerName;
        this.customerId=UUID.randomUUID();
        
    }
    public void BookingRequest(Integer roomNo, LocalDate bookingStart,LocalDate BookingEnd){
        // LocalDateTime currentTime=LocalDateTime.now();
        if(BookingRegister.isRoomAvailable(roomNo,bookingStart,BookingEnd)){
            BookingRegister.Register(roomNo, bookingStart, BookingEnd);
            System.out.println("Room Bookes Successfully");
        }
        else{
            System.out.println("Ohh!! Room is not Available choose other room");
        }

    }


}
