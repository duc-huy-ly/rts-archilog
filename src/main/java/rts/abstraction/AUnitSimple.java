package rts.abstraction;

import java.util.Iterator;

import rts.behaviors.BehaviorSoldier;

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


}
