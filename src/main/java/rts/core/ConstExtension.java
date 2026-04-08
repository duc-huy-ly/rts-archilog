package rts.core;

import rts.behaviors.BehaviorSoldier;
import rts.equipments.IEquipment;

public class ConstExtension extends BehaviorExtension {

    public ConstExtension(BehaviorSoldier component, IEquipment equipment, float dmg, float armor) {
        super(component, equipment);
        _dmg = dmg;
        _armor = armor;
    }

    private float _dmg;
    private float _armor;

    @Override
    public float getAD() {
        return super.getAD() + _dmg;
    }

    @Override
    public float getArmor() {
        return super.getArmor() + _armor;
    }

}
