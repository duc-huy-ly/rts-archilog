package rts.abstraction;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

import rts.observer.ISubscriber;
import rts.observer.Observable;

public abstract class ObservableUnit implements IUnit, Observable {
    private final Set<ISubscriber> subscribers = new LinkedHashSet<>();

    @Override
    public void addSubscriber(ISubscriber s) {
        subscribers.add(Objects.requireNonNull(s, "subscriber"));
    }

    @Override
    public void notifySubscribers() {
        for (ISubscriber s : Set.copyOf(subscribers)) {
            s.update(this);
        }
    }

    @Override
    public void removeSubscriber(ISubscriber s) {
        subscribers.remove(s);
    }

}
