package rts.observer;

public interface Observable {
    void addSubscriber(ISubscriber s);
    void removeSubscriber(ISubscriber s);
    void notifySubscribers(UnitEvent event);

}
