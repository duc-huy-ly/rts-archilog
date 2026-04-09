package rts.observer;

public class EquipmentSubscriber implements ISubscriber {
    @Override
    public void update(UnitEvent event) {
        if (event.getType() == UnitEventType.EQUIPMENT_ADDED || event.getType() == UnitEventType.EQUIPMENT_REMOVED) {
            String action = event.getType() == UnitEventType.EQUIPMENT_ADDED ? "added" : "removed";
            System.out.println("EquipmentSubscriber: " + event.getSource().getName() + " " + action + " " + event.getEquipment());
        }
    }
}