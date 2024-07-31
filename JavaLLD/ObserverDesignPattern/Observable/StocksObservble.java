package JavaLLD.ObserverDesignPattern.Observable;
import JavaLLD.ObserverDesignPattern.Observer.NotificationAlertObserver;

public interface StocksObservble {
    public void add(NotificationAlertObserver observer);
    public void remove(NotificationAlertObserver observer);
    public void notifySubscribers();
    public int getStockCOunt();
    public void setStockCount(int newStockAdded);
    
}