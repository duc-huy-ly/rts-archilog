package rts.abstraction;

import java.util.Iterator;

import rts.implementation.behaviors.BehaviorSoldier;
import rts.implementation.equipments.BehaviorExtension;
import rts.implementation.equipments.IEquipment;
import rts.observer.EventType;
import rts.observer.UnitEvent;

public abstract class AUnitSimple extends ObservableUnit {
    private BehaviorSoldier _behavior;

    public AUnitSimple(BehaviorSoldier behavior, String name) {
        super(name);
        _behavior = behavior;
    }

    @Override
    public float getAD() {
        return _behavior.getAD();
    }

    @Override
    public float getArmor() {
        return _behavior.getArmor();
    }

    @Override
    public void getHit(float dmg) {
       _behavior.getHit(dmg); 
       super.notifySubscribers(new UnitEvent(EventType.HIT_TAKEN, this, dmg, null));
    }

    @Override
    public float getHp() {
        return _behavior.getHp();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public boolean isAlive() {
        return _behavior.isAlive();
    }

    @Override
    public void addUnit(IUnit u) {
        
    }

    @Override
    public Iterator<IUnit> getUnits() {
        return null;
    }

    @Override
    public void removeUnit(IUnit u) {
        
    }

    @Override
    public void addEquipment(IEquipment e) {
        _behavior = e.createExtension(_behavior); 
        super.notifySubscribers(new UnitEvent(EventType.EQUIPMENT_ADDED, this, 0, e));
    }
    

    @Override
    public void removeEquipment(IEquipment e){
        // Check if the equipment is at the head
        if (_behavior instanceof BehaviorExtension && ((BehaviorExtension) _behavior).getEquipment() == e){
            _behavior = ((BehaviorExtension) _behavior).get_component();
            return;
        }
        
        // Otherwise, traverse to find and remove it
        BehaviorSoldier pre = _behavior;
        BehaviorSoldier cur = _behavior;

        while(cur instanceof BehaviorExtension && ((BehaviorExtension) cur).getEquipment() != e){
            pre = cur;
            cur = ((BehaviorExtension)cur).get_component();
        }
        
        if (cur instanceof BehaviorExtension && ((BehaviorExtension) cur).getEquipment() == e){
            ((BehaviorExtension) pre).setBehavior(((BehaviorExtension)cur).get_component());
        }
        
    }

}
