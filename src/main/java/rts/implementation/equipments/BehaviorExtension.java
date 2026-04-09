package rts.implementation.equipments;

import rts.implementation.behaviors.BehaviorSoldier;

public abstract class BehaviorExtension implements BehaviorSoldier {
    private BehaviorSoldier _component;
    private IEquipment _equipment;

    public BehaviorExtension(BehaviorSoldier component, IEquipment equipment)  {
        _component = component;
        _equipment = equipment;
    }

    @Override
    public float getHp() {
        return _component.getHp();
    }

    @Override
    public boolean isAlive() {
        return _component.isAlive();
    }

    @Override
    public float getAD() {
        return _component.getAD() ;
    }

    @Override
    public void getHit(float dmg) {
        _component.getHit(dmg);
    }

    @Override
    public float getArmor() {
        return _component.getArmor();
    }

    public BehaviorSoldier get_component() {
        return _component;
    }

    public IEquipment getEquipment() {
        return _equipment;
    }

    public void setBehavior(BehaviorSoldier b){
        _component = b;
    }

}
