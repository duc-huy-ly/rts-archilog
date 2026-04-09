package rts.observer;


public class UnitSubscriber implements ISubscriber {

    @Override
    public void update(UnitEvent e) {
       System.out.println("Received notification from " + e.get_source().getName());
    }
    
}
