package rts.observer;

import rts.abstraction.IUnit;

public class UnitSubscriber implements ISubscriber {

    @Override
    public void update(Object o) {
        if (o instanceof IUnit u){
            System.out.println("Subscriber " + this + " received a notification from " + u + ", named " + u.getName());
        }
    }
    
}
