package rts.abstraction;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

import rts.observer.ISubscriber;
import rts.observer.Observable;
import rts.observer.UnitEvent;

public abstract class ObservableUnit implements IUnit, Observable {
    private String _name;

    public ObservableUnit(String _name) {
        this._name = _name;
    }

    private final Set<ISubscriber> subscribers = new LinkedHashSet<>();

    @Override
    public void addSubscriber(ISubscriber s) {
        subscribers.add(Objects.requireNonNull(s, "subscriber"));
    }

    @Override
    public void notifySubscribers(UnitEvent e) {
        for (ISubscriber s : Set.copyOf(subscribers)) {
            s.update(e);
        }
    }

    @Override
    public void removeSubscriber(ISubscriber s) {
        subscribers.remove(s);
    }

    public String getName(){
        return _name; 
    }

    
}
