package rts.core;

import rts.behaviors.BehaviorSoldier;

public abstract class BehaviorExtension implements BehaviorSoldier {
    private BehaviorSoldier _component;


    public BehaviorExtension(BehaviorSoldier component)  {
        _component = component;
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
        return _component.getAD();
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


}
