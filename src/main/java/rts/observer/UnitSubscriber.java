package rts.observer;

import rts.abstraction.IUnit;

public class UnitSubscriber implements ISubscriber {

    @Override
    public void update(Object o) {
        if (o instanceof IUnit u){
            System.out.println("Subscriber" + this.toString() + "Received a notification from " + u.toString() + " , named " + u.getName());
        }
    }
    
}
