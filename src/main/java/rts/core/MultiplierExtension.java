package rts.core;

import rts.behaviors.BehaviorSoldier;
import rts.equipments.IEquipment;

public class MultiplierExtension extends BehaviorExtension {
    private float _adMultiplier = 0;
    private float _armorMultiplier = 0;

    public MultiplierExtension(BehaviorSoldier component, IEquipment equipment, float adMultiplier,
            float armorMultiplier) {
        super(component, equipment);

        _adMultiplier = adMultiplier;
        _armorMultiplier = armorMultiplier;
    }

    @Override
    public float getAD() {
        return super.getAD() * _adMultiplier;
    }

    @Override
    public float getArmor() {
        return super.getArmor() *_armorMultiplier;
    }

}
