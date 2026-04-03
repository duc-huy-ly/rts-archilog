package rts.decorator;

import rts.core.IEntity;

public class Shield extends EntityDecorator{
    private float _armor;

    public Shield(IEntity component, float armor) {
        super(component);
        _armor = armor;
    }

    @Override
    public float getArmor() {
        return super.getArmor() + _armor;
    }


    


}
