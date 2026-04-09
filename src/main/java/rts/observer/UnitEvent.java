package rts.observer;

import rts.abstraction.IUnit;
import rts.equipments.IEquipment;

public class UnitEvent {
    private final IUnit source;
    private final UnitEventType type;
    private final float value;
    private final IEquipment equipment;

    public UnitEvent(IUnit source, UnitEventType type, float value, IEquipment equipment) {
        this.source = source;
        this.type = type;
        this.value = value;
        this.equipment = equipment;
    }

    public IUnit getSource() {
        return source;
    }

    public UnitEventType getType() {
        return type;
    }

    public float getValue() {
        return value;
    }

    public IEquipment getEquipment() {
        return equipment;
    }
}