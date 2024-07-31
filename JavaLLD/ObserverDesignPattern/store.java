package JavaLLD.ObserverDesignPattern;

import JavaLLD.ObserverDesignPattern.Observable.StocksObservble;
import JavaLLD.ObserverDesignPattern.Observable.IphoneStocksObservable;
import JavaLLD.ObserverDesignPattern.Observer.EmailAlertObserver;
import JavaLLD.ObserverDesignPattern.Observer.MobileAlertObserver;
import JavaLLD.ObserverDesignPattern.Observer.NotificationAlertObserver;

public class store {
    public static void main(String[] args) {
        StocksObservble IphoneStocksObservable= new IphoneStocksObservable();

    NotificationAlertObserver observer1=new EmailAlertObserver("xyz123@gmail.com", IphoneStocksObservable);
    NotificationAlertObserver observer2=new EmailAlertObserver("asd321@gmail.com", IphoneStocksObservable);
    NotificationAlertObserver observer3=new MobileAlertObserver("WonderfullCoder", IphoneStocksObservable);


    IphoneStocksObservable.add(observer1);
    IphoneStocksObservable.add(observer2);
    IphoneStocksObservable.add(observer3);

    IphoneStocksObservable.setStockCount(16);
    }
}
