package Amazon.Entity;

public class PaymentInfo {
    String PaymentMode;
    Boolean isSuccessfull;

    public PaymentInfo(String mode){
        this.PaymentMode=mode;
    //     this.isSuccessfull=false;
    }

    Boolean PaymentInfo(Integer total){
        
        System.out.println("Please pay amount "+total);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Payment recieved successfully!!!!!");
        return this.isSuccessfull=true;
        
    }


    

}
