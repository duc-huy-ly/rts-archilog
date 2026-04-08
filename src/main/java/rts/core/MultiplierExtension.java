package rts.core;

import rts.behaviors.BehaviorSoldier;
import rts.equipments.IEquipment;

public class MultiplierExtension extends BehaviorExtension {
    private float _adMultiplier = 0;
    private float _armorMultiplier = 0;

    public MultiplierExtension(BehaviorSoldier component, IEquipment equipment, float adMultiplier,
            float armorMultiplier) {
        super(component, equipment);
        if (armorMultiplier >= 0 && armorMultiplier <= 1 && adMultiplier >= 0 || adMultiplier <= 1) {
            _adMultiplier = adMultiplier;
            _armorMultiplier = armorMultiplier;
        }
    }

    @Override
    public float getAD() {
        return super.getAD() * (1 + _adMultiplier);
    }

    @Override
    public float getArmor() {
        return super.getArmor() * (1 + _armorMultiplier);
    }

}
