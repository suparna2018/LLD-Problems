package ObjectOrientedDesign_Java.HotelManageMent;
import java.time.LocalDate;
import ObjectOrientedDesign_Java.HotelManageMent.Entity.Hotel;
import ObjectOrientedDesign_Java.HotelManageMent.Entity.Customer;

public class Main {
    public static void main(String[] args) {
        // Create a hotel with 5 rooms
        Hotel hotel = new Hotel(5);

        // Create a customer
        Customer customer = new Customer("John Doe");

        // Customer requests a booking from 2024-10-01 to 2024-10-05 for room 1
        LocalDate startDate = LocalDate.of(2024, 10, 1);
        LocalDate endDate = LocalDate.of(2024, 10, 5);
        customer.BookingRequest(1, startDate, endDate);

        Customer customer1 = new Customer("Johnyy Bravoo");

        // Customer requests a booking from 2024-10-01 to 2024-10-05 for room 1
        LocalDate startDate1 = LocalDate.of(2024, 10, 1);
        LocalDate endDate1 = LocalDate.of(2024, 10, 5);
        customer.BookingRequest(1, startDate1, endDate1);
    }
}
