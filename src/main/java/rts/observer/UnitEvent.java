package rts.observer;

import rts.abstraction.ObservableUnit;
import rts.implementation.equipments.IEquipment;

public class UnitEvent {
    private EventType _type;
    private ObservableUnit _source;
    private float _value;
    private IEquipment _equipment;

    public UnitEvent(EventType _type, ObservableUnit _source, float _value, IEquipment _equipment) {
        this._type = _type;
        this._source = _source;
        this._value = _value;
        this._equipment = _equipment;
    }

    public EventType get_type() {
        return _type;
    }

    public ObservableUnit get_source() {
        return _source;
    }

    public float get_value() {
        return _value;
    }

    public IEquipment get_equipment() {
        return _equipment;
    }

}
