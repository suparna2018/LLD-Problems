package BookMyShow.Service;

import java.io.InputStream;
import java.util.Scanner;

import BookMyShow.DAO.SeatsUserBookingMatrix;
import BookMyShow.Entity.Seats;
import BookMyShow.Entity.User;

public class BookingService {
    Seats seats;
    SeatsUserBookingMatrix seatsUserBookingMatrix;
    PaymentService PaymentService;

    public BookingService(){
        // SeatMatrix
        Seats.seatIniate();
        this.seatsUserBookingMatrix=new SeatsUserBookingMatrix();
        this.PaymentService=new PaymentService();
    }
    public void BookingRequest(User user,int people){
        int sum=0;
        

        while(people!=0){ 
            Seats seatAval=seatsUserBookingMatrix.ShowAvailableSeats();
            SeatsUserBookingMatrix.Booking(user,seatAval);
            // System.out.println(seatAval);
            people-=1;
            sum+=seatAval.Price;
                
        }
            PaymentService.PaymentService(sum);
        
    }
}
