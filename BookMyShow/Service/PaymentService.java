package BookMyShow.Service;

public class PaymentService {
    int Price;

    public PaymentService(){
        
    }

    public void PaymentService(int sum) {
        System.out.println("Pay amount "+sum +" via Card or UPI");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Payment recieved!!");
    }

}
