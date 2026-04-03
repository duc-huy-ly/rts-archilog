package rts.decorator;

import rts.core.IEntity;

public abstract class EntityDecorator implements IEntity {
    private IEntity _component;

    public EntityDecorator(IEntity component) {
        this._component = component;
    }

    @Override
    public float getHP() {
        return _component.getHP();
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


}
