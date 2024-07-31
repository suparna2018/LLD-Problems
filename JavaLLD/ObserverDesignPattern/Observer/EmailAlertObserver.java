package JavaLLD.ObserverDesignPattern.Observer;
import JavaLLD.ObserverDesignPattern.Observable.StocksObservble;

public class EmailAlertObserver implements NotificationAlertObserver {
    String emailid;
    StocksObservble stocksObservble;
    public EmailAlertObserver(String emailid,StocksObservble stocksObservble) {
        this.stocksObservble=stocksObservble;
        this.emailid=emailid;
    }
    @Override
    public void update() {
        sendEmail(emailid, "Item is back in stock!! Hurry up");
    }
    
    public void sendEmail(String emailid,String msg){
        System.out.println("Email sent to "+ emailid);
        // System.out.println(msg);
    }
}
