package rts.observer;

public class HitSubscriber implements ISubscriber{
    
    @Override
    public void update(UnitEvent e) {
       if  (e.get_type() == EventType.HIT_TAKEN){
            System.out.println("Subscriber" + this.hashCode() + "received notification : " + e.get_source() + "took " + e.get_value() + " dmg.");
       } 
    }
    
}
