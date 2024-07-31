package JavaLLD.ObserverDesignPattern.Observer;
import JavaLLD.ObserverDesignPattern.Observable.StocksObservble;

public class MobileAlertObserver implements NotificationAlertObserver{
     String username;
    StocksObservble stocksObservble;
    public MobileAlertObserver(String username,StocksObservble stocksObservble) {
        this.stocksObservble=stocksObservble;
        this.username=username;
    }
   

    @Override
    public void update(){
        sendMsgonMob(username, "Item is back in stock!! Hurry up");
    } 
    public void sendMsgonMob(String username,String msg){
        System.out.println("Email sent to "+username);
        // System.out.println(msg);
    }

}