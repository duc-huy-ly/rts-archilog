package rts.core;

import rts.behaviors.BehaviorSoldier;

public class CritModifierExtension extends BehaviorExtension {
    private float _critChance;

    public CritModifierExtension(BehaviorSoldier component, float critChance) {
        super(component);
        try {
            if (critChance < 0 || critChance > 1) {
                throw new Exception("not valid crit change");
            }
            _critChance = critChance;
        } catch (Exception e) {
            _critChance = 0.2f;
        }
    }

}
