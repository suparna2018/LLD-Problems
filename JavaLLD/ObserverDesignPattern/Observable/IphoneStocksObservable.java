package JavaLLD.ObserverDesignPattern.Observable;

import java.util.ArrayList;
import java.util.List;

import JavaLLD.ObserverDesignPattern.Observer.NotificationAlertObserver;

public class IphoneStocksObservable implements StocksObservble {
    
    public List<NotificationAlertObserver> observerList=new ArrayList<>();
    int stockCount=0;

    @Override
    public void add(NotificationAlertObserver observer){
        observerList.add(observer);
    }
    @Override
    public void remove(NotificationAlertObserver observer){
        observerList.remove(observer);
    }

    @Override
    public void notifySubscribers(){
        for(NotificationAlertObserver observer: observerList){
            observer.update();
        }
    }

    @Override
    public int getStockCOunt(){
        return stockCount;
    }
    @Override
    public void setStockCount(int newStockAdded){
        if (stockCount==0){
            notifySubscribers();
        }
        stockCount= stockCount+newStockAdded;

    }

}
