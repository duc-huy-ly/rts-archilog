package rts.decorator;

import rts.core.IEntity;

public class Sword extends EntityDecorator{
    private float _dmg;

    public Sword(IEntity component, float dmg) {
        super(component);
        _dmg = dmg;
    }

    @Override
    public float getAD() {
        return super.getAD() + _dmg;
    }

    
    
}
