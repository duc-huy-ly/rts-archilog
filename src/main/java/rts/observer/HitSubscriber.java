package rts.observer;

public class HitSubscriber implements ISubscriber {
    @Override
    public void update(UnitEvent event) {
        if (event.getType() == UnitEventType.HIT) {
            System.out.println("HitSubscriber: " + event.getSource().getName() + " took " + event.getValue() + " damage");
        }
    }
}