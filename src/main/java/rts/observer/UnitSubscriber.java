package rts.observer;

public class UnitSubscriber implements ISubscriber {

    @Override
    public void update(UnitEvent event) {
        System.out.println("Subscriber " + this + " received " + event.getType() + " from " + event.getSource().getName());
    }
    
}
