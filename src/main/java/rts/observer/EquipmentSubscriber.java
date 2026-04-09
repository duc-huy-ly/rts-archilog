package rts.observer;

public class EquipmentSubscriber implements  ISubscriber{
    
    @Override
    public void update(UnitEvent e) {
        if (e.get_type() == EventType.EQUIPMENT_ADDED){
            System.out.println("Subscriber " + this.hashCode() + " message : Equipment " + e.get_equipment().getName() + " added to " + e.get_source().getName() );
        }
    }
    
}
