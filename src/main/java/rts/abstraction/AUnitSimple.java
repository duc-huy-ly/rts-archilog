package rts.abstraction;

import java.util.Iterator;

import rts.behaviors.BehaviorSoldier;
import rts.core.BehaviorExtension;
import rts.equipments.IEquipment;

public abstract class AUnitSimple implements IUnit {
    private BehaviorSoldier _behavior;
    private String _name;

    public AUnitSimple(BehaviorSoldier behavior, String name) {
        _behavior = behavior;
        _name = name;
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
    }

    @Override
    public float getHp() {
        return _behavior.getHp();
    }

    @Override
    public String getName() {
        return _name;
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
