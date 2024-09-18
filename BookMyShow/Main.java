package BookMyShow;

import BookMyShow.DAO.SeatsUserBookingMatrix;
import BookMyShow.Entity.User;
import BookMyShow.Service.BookingService;

public class Main {
    public static void main(String[] args) {
        BookingService BookingMyShow=new BookingService();
        User user1=new User("Stefen","Stefan09@gmail.com",789946789);
        User user2=new User("Evan","Evav234@yahoo.com",6540988);
        User user3=new User("Evankaa","Evanka123@hotmail.co.in",23467777);
        BookingMyShow.BookingRequest(user1,23);
        BookingMyShow.BookingRequest(user2,1);
        BookingMyShow.BookingRequest(user3,2);
        SeatsUserBookingMatrix.BookingHistory();
        

    }


}
