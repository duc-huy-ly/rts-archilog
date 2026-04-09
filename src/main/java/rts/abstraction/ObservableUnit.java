package rts.abstraction;

import java.util.ArrayList;
import java.util.HashSet;

import rts.observer.ISubscriber;
import rts.observer.Observable;

public abstract class ObservableUnit implements IUnit, Observable {
    private ArrayList<ISubscriber> subscribers = new ArrayList<>();
    private HashSet<ISubscriber> subscriberSet = new HashSet<>();

    @Override
    public void addSubscriber(ISubscriber s) {
        if (!subscriberSet.contains(s)) {
            subscribers.add(s);
            subscriberSet.add(s);
        }
    }

    @Override
    public void notifySubscribers() {
        ArrayList<ISubscriber> copy = (ArrayList<ISubscriber>) subscribers.clone();

        for (ISubscriber s : copy) {
            s.update(this);
        }
    }

    @Override
    public void removeSubscriber(ISubscriber s) {
        if (subscriberSet.contains(s)) {
            subscriberSet.remove(s);
            subscribers.remove(s);
        }

    }

}
